
import java.util.ArrayList;

/**
 * @author Steven Dao
 * @version 1.0
 *
 * Date: December 7, 2021
 * Purpose: To create the class StudentSolver that simulates a Roomba cleaning device that, starting at some
 *          position within y = 0 moving towards y = h, moves continuously in the positively increasing y-direction
 *          while optimizing the path that would clean the highest total of mess severities.
 */
public class StudentSolver {

    /**
     * Returns the ArrayList of coordinates which optimizes the path that would clean the highest total
     * severity of messes.
     *
     * @param r the ratio of vertical to horizontal speed
     * @param mess an ArrayList containing pairs consisting of coordinates of messes and a severity s for the mess
     * @return the ArrayList containing the optimal order of messes that the Roomba should clean up
     */
    public static ArrayList<Integer> run(double r, ArrayList<Pair<Pair<Double, Double>, Integer>> mess) {

        // store the size to prevent excessive method calls within loops
        int messSize = mess.size();
        // store our connections similar to a dictionary of a directed acyclic graph
        ArrayList<ArrayList<Pair<Integer, Integer>>> connections = new ArrayList<>();
        // dynamic programming: store the most severe paths of previously-checked branches
        ArrayList<ArrayList<Integer>> connectionMemo = new ArrayList<>();

        // populate our connections to have ArrayLists equal to the number of points on the graph
        for (int i = 0; i < messSize; ++i) {
            connections.add(new ArrayList<>());
            connectionMemo.add(new ArrayList<>());
        }

        // populate each ArrayList within our connections with pairs that will represent
        // the next reachable paths of each point
        for (int i = 0; i < messSize; ++i) {
            for (int j = 0; j < messSize; ++j) {
                // look for points other than itself
                if (i != j) {
                    // store the pairs for readability
                    Pair<Pair<Double, Double>, Integer> firstMess = mess.get(i);
                    Pair<Pair<Double, Double>, Integer> secondMess = mess.get(j);

                    // if point `a` can reach point `b`, then store it within its relevant index in our dictionary
                    if (canReachPoint(firstMess.first, secondMess.first, r))
                        connections.get(i).add(new Pair<>(i, j));
                }
            }
        }

        // store a copy of the original messes, so we can safely change it
        ArrayList<Pair<Pair<Double, Double>, Integer>> messCopy = new ArrayList<>();

        // we must create shallow copies of the objects within the ArrayList manually
        for (Pair<Pair<Double, Double>, Integer> currentMess : mess)
            messCopy.add(new Pair<>(new Pair<>(currentMess.first.first, currentMess.first.second), currentMess.second));

        // store the indexes of the messes in descending order (working from top to bottom);
        // we do this to memo the smaller branches before working our way down to the larger branches
        int[] messIndexDescending = new int[messSize];
        int maxIndex = -1;

        // organize the messes from highest to lowest y-coordinate
        for (int i = 0; i < messSize; ++i) {
            double max = -1;

            // within each iteration, store the newest max
            for (int j = 0; j < messSize; ++j) {
                // store the current y-coordinate for readability
                double currentHeight = messCopy.get(j).first.second;

                // replace our max if the current height is larger
                if (max < currentHeight) {
                    max = currentHeight;
                    maxIndex = j;
                }
            }

            // replace the height, so we can skip it in the next loop
            messCopy.get(maxIndex).first.second = -Double.MAX_VALUE;
            // store the current max index in descending order
            messIndexDescending[i] = maxIndex;
        }

        // store the index of the path containing our highest severity sum
        maxIndex = -1;
        // store the highest severity sum of all connection branches
        int maxSeveritySum = -1;
        // store our values by reference when needed
        int[] globalMax = new int[1];
        // keep track of the connection indexes we've visited
        boolean[] visitedMemo = new boolean[messSize];
        // store the most severe path for each connection index
        ArrayList<Integer> mostSeverePath = new ArrayList<>();

        // traverse our messes in descending height
        for (int currentIndex : messIndexDescending) {
            // recursively traverse each connection subtree and store the path containing the highest severity sum
            memoMostSeverePath(currentIndex, 0, globalMax, visitedMemo, connectionMemo, connections,
                    mess, mostSeverePath, new ArrayList<>());

            // store the most severe path into our connection memo
            connectionMemo.get(currentIndex).addAll(mostSeverePath);

            // keep track of the index of the path with the highest severity sum
            if (maxSeveritySum < globalMax[0]) {
                maxSeveritySum = globalMax[0];
                maxIndex = currentIndex;
            }

            // reset for the next loop
            globalMax[0] = 0;
        }

        // return the optimal path containing the largest severity sum
        return connectionMemo.get(maxIndex);
    }

    /**
     * Recursively populates the mostSeverePath ArrayList with the indexes of the messes with the greatest severity
     * in the indicated connection index of the dictionary of connections.
     *
     * @param currentIndex the connection index that we're currently looking at
     * @param currentSum the current severity sum, passed in by value
     * @param globalMax the global maximum sum of severity to compare against other paths in this connection index
     * @param visitedMemo the boolean matrix indicating whether we've already traversed through a specific index
     * @param connectionMemo the memo which contains the paths with the highest severity sum in each index
     * @param connections the dictionary of edges displaying the other points of which a point can reach
     * @param mess the messes containing all mess coordinates and their severity levels
     * @param mostSeverePath the stored path of the highest severity sum for this connection index
     * @param currentPath the path consisting of specific edges in this iteration
     */
    private static void memoMostSeverePath(int currentIndex, int currentSum, int[] globalMax, boolean[] visitedMemo,
                                           ArrayList<ArrayList<Integer>> connectionMemo,
                                           ArrayList<ArrayList<Pair<Integer, Integer>>> connections,
                                           ArrayList<Pair<Pair<Double, Double>, Integer>> mess,
                                           ArrayList<Integer> mostSeverePath,
                                           ArrayList<Integer> currentPath) {

        // store the current edges of the connection index for readability
        ArrayList<Pair<Integer, Integer>> currentEdges = connections.get(currentIndex);
        // avoid reassigning parameters
        int localMax = currentSum;

        // only add to the local max at this moment if this is a new sub-branch
        if (!visitedMemo[currentIndex])
            localMax += mess.get(currentIndex).second;

        // base case: exit if this sub-branch is in our memo or does not lead to other points
        if (visitedMemo[currentIndex] || currentEdges.size() == 0) {
            // add the coordinate if this recursion iteration began with a dead end
            if (currentPath.size() == 0)
                currentPath.add(currentIndex);

            // add the sum of the memo sub-branch to this local max
            localMax += getSeveritySum(mess, connectionMemo.get(currentIndex));

            // replace the global max if this local max is greater
            if (globalMax[0] < localMax) {
                globalMax[0] = localMax;

                // store and replace the highest severity path and include any memos
                mostSeverePath.clear();
                mostSeverePath.addAll(currentPath);
                mostSeverePath.addAll(connectionMemo.get(currentIndex));
            }
            return;
        }

        // add this point to our current path
        currentPath.add(currentIndex);

        // iterate through all edges in the connection index
        for (Pair<Integer, Integer> currentEdge : currentEdges) {
            // store the next point for readability
            int nextPoint = currentEdge.second;

            // mark the next connection index as visited within the memo
            visitedMemo[nextPoint] = true;
            // recursively traverse all branches of this path and memo the path with the highest severity sum
            memoMostSeverePath(nextPoint, localMax, globalMax, visitedMemo, connectionMemo, connections,
                    mess, mostSeverePath, new ArrayList<>(currentPath));
        }
    }

    /**
     * Returns the sum of the severity levels in the list of mess indexes.
     *
     * @param mess the mess containing its coordinates and its severity level
     * @param path the path consisting of specific edges
     * @return the sum of the severity levels of all messes in the path
     */
    private static int getSeveritySum(ArrayList<Pair<Pair<Double, Double>, Integer>> mess, ArrayList<Integer> path) {

        int sum = 0;

        // add the sum of all severity levels from the indicated messes
        for (int index : path)
            sum += mess.get(index).second;

        return sum;
    }

    /**
     * Returns true if and only if the first point `a` can reach the second point `b` using their slopes and
     * the given vertical/horizontal speed ratio.
     *
     * @param a the first point of coordinates
     * @param b the second point of coordinates
     * @param r the given ratio of vertical/horizontal speed
     * @return true if `a` can reach `b`; false otherwise
     */
    private static boolean canReachPoint(Pair<Double, Double> a, Pair<Double, Double> b, double r) {

        // the y-value of `a` must be less than that of `b`, since the vertical speed is always increasing
        if (a.second >= b.second)
            return false;

        // calculate the slope between the points using the ratio of rise/run
        double slope = (b.second - a.second) / (b.first - a.first);

        // point `a` can reach point `b` if its slope is at least +r/-r
        return (slope >= r || slope <= (-1) * r);
    }
}
