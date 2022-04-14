
import java.util.ArrayList;

/**
 * @author Steven Dao
 * @version 1.0
 *
 * Date: December 7, 2021
 * Purpose: To test the results received from the StudentSolver class.
 */
public class Main {

    /**
     * Tests the StudentSolver function using the provided test cases.
     * To add additional test cases, add to the provided containers as necessary.
     *
     * @param args the command-line arguments of the application
     */
    public static void main(String[] args) {

        int numOfTests = 0;
        int numOfTestsPassed = 0;
        ArrayList<Double> inputRs = new ArrayList<>();
        ArrayList<ArrayList<Pair<Pair<Double, Double>, Integer>>> inputMesses = new ArrayList<>();
        ArrayList<ArrayList<Integer>> expectedOrders = new ArrayList<>();


        // test case 1 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputRs.add(16.7374586913063);
        inputMesses.add(new ArrayList<>() {
            {
                add(new Pair<>(new Pair<>(50.53339753651755, 2392.9913262022305), 4));
                add(new Pair<>(new Pair<>(91.45350267880721, 2038.5690414517053), 6));
                add(new Pair<>(new Pair<>(81.30630354764358, 3002.1564113738523), 9));
                add(new Pair<>(new Pair<>(37.16228801441648, 2421.3261154038723), 8));
                add(new Pair<>(new Pair<>(16.323410763410276, 696.3036909610697), 1));
                add(new Pair<>(new Pair<>(17.558652660436632, 2306.3556734125145), 1));
                add(new Pair<>(new Pair<>(30.858752483887464, 751.748794481916), 3));
                add(new Pair<>(new Pair<>(30.957197204880696, 944.2879593578829), 8));
                add(new Pair<>(new Pair<>(15.042626905954554, 2344.979171359295), 1));
                add(new Pair<>(new Pair<>(84.13614550978521, 1310.743768220772), 9));
            }
        });
        expectedOrders.add(new ArrayList<>() {
            {
                add(6);
                add(7);
                add(1);
                add(2);
            }
        });

        // test case 2 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputRs.add(4.0970868343508045);
        inputMesses.add(new ArrayList<>() {
            {
                add(new Pair<>(new Pair<>(87.21684387143354, 954.8669492163775), 1));
                add(new Pair<>(new Pair<>(63.797111370601925, 1599.0719983165416), 10));
                add(new Pair<>(new Pair<>(89.38032320395904, 317.4943644252255), 8));
                add(new Pair<>(new Pair<>(21.887003117859052, 1623.2066088154834), 4));
                add(new Pair<>(new Pair<>(59.72128992893107, 1054.4151412143742), 4));
                add(new Pair<>(new Pair<>(65.63722317277708, 715.4761800657637), 4));
                add(new Pair<>(new Pair<>(40.945864951008645, 1503.565641866376), 3));
                add(new Pair<>(new Pair<>(16.23282429177653, 97.40979265083185), 10));
                add(new Pair<>(new Pair<>(92.79901139049763, 908.5599195365235), 7));
                add(new Pair<>(new Pair<>(75.07982260480249, 403.74349509408705), 3));
                add(new Pair<>(new Pair<>(23.40462172477689, 1260.5966364516757), 7));
                add(new Pair<>(new Pair<>(67.75966299566583, 1042.3485806619208), 1));
                add(new Pair<>(new Pair<>(87.36334875485645, 407.89154792802043), 9));
                add(new Pair<>(new Pair<>(98.30200651337582, 702.0604318874751), 3));
                add(new Pair<>(new Pair<>(36.76869215786858, 697.8608975232554), 9));
            }
        });
        expectedOrders.add(new ArrayList<>() {
            {

                add(7);
                add(12);
                add(5);
                add(8);
                add(4);
                add(10);
                add(6);
                add(1);
            }
        });

        // test case 3 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputRs.add(5.988768684433906);
        inputMesses.add(new ArrayList<>() {
            {
                add(new Pair<>(new Pair<>(19.480563486947773, 2232.0930272053406), 4));
                add(new Pair<>(new Pair<>(95.90375483307125, 1962.1684230256587), 4));
                add(new Pair<>(new Pair<>(65.79033812756633, 1539.8609895839356), 7));
                add(new Pair<>(new Pair<>(5.687547393404764, 854.9613955881503), 7));
                add(new Pair<>(new Pair<>(25.3468150696367, 406.2042837647899), 10));
                add(new Pair<>(new Pair<>(72.15171495744723, 9.403230770359535), 8));
                add(new Pair<>(new Pair<>(48.02867537389848, 2323.2976913082425), 3));
                add(new Pair<>(new Pair<>(59.4166849403024, 1403.0437584788303), 9));
                add(new Pair<>(new Pair<>(89.33410145023457, 772.4881025722256), 1));
                add(new Pair<>(new Pair<>(4.284192205272775, 1650.603705981297), 2));
                add(new Pair<>(new Pair<>(50.06506883478546, 1035.3103585092022), 3));
                add(new Pair<>(new Pair<>(77.78395825036881, 2470.0033286955786), 10));
                add(new Pair<>(new Pair<>(54.83127056222148, 1172.5673632234134), 1));
                add(new Pair<>(new Pair<>(17.269254544231178, 2079.4433357247335), 9));
                add(new Pair<>(new Pair<>(58.307946988079685, 1719.7725130022234), 2));
                add(new Pair<>(new Pair<>(21.260954447198287, 543.7983873399198), 8));
                add(new Pair<>(new Pair<>(89.27445209450329, 2377.5973710621925), 5));
                add(new Pair<>(new Pair<>(90.82344572438056, 2189.0629452027038), 10));
                add(new Pair<>(new Pair<>(41.73881299986516, 639.7021051490478), 7));
                add(new Pair<>(new Pair<>(12.45593723731849, 325.5620832925634), 3));
            }
        });
        expectedOrders.add(new ArrayList<>() {
            {
                add(5);
                add(4);
                add(15);
                add(3);
                add(12);
                add(7);
                add(2);
                add(14);
                add(1);
                add(17);
                add(16);
                add(11);
            }
        });

        // test case 4 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputRs.add(17.35043405982303);
        inputMesses.add(new ArrayList<>() {
            {
                add(new Pair<>(new Pair<>(42.29909327543452, 839.3758007380363), 8));
                add(new Pair<>(new Pair<>(62.420449277731905, 888.2458757982125), 9));
                add(new Pair<>(new Pair<>(103.62186353046064, 64.25590742806443), 8));
                add(new Pair<>(new Pair<>(55.773291278136064, 657.0226387011826), 9));
                add(new Pair<>(new Pair<>(104.54012779564636, 602.6552282676638), 3));
                add(new Pair<>(new Pair<>(106.1046040611817, 309.6107048422623), 1));
                add(new Pair<>(new Pair<>(18.694255301474225, 6.492350206754808), 7));
                add(new Pair<>(new Pair<>(40.59814204086071, 39.21088501807897), 9));
                add(new Pair<>(new Pair<>(100.13525481594934, 308.42084226646415), 9));
                add(new Pair<>(new Pair<>(71.89964918108923, 239.51068150145431), 8));
                add(new Pair<>(new Pair<>(100.78772675070286, 412.117278029609), 4));
                add(new Pair<>(new Pair<>(56.93692393360826, 1054.774861951274), 3));
                add(new Pair<>(new Pair<>(20.64162175211359, 481.3176010149312), 3));
                add(new Pair<>(new Pair<>(63.953287517111434, 524.9090323440884), 1));
                add(new Pair<>(new Pair<>(81.19963104229194, 834.8373211381709), 10));
                add(new Pair<>(new Pair<>(94.39926915850599, 235.25730865424956), 5));
                add(new Pair<>(new Pair<>(75.72986857333879, 108.7826612003318), 4));
                add(new Pair<>(new Pair<>(77.40607220658127, 1025.3429795116972), 6));
                add(new Pair<>(new Pair<>(64.92444248396897, 802.1076902454461), 6));
                add(new Pair<>(new Pair<>(30.03044810514901, 224.6345737816951), 9));
                add(new Pair<>(new Pair<>(46.5117464188381, 232.9441104060532), 10));
                add(new Pair<>(new Pair<>(13.445142204482607, 767.2756498643033), 3));
                add(new Pair<>(new Pair<>(60.01711170374992, 626.02975552842), 10));
                add(new Pair<>(new Pair<>(95.50226463831919, 509.48943361837917), 10));
                add(new Pair<>(new Pair<>(37.78776641564216, 1039.320249407337), 9));
            }
        });
        expectedOrders.add(new ArrayList<>() {
            {
                add(2);
                add(8);
                add(10);
                add(23);
                add(14);
                add(17);
            }
        });

        // test case 5 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputRs.add(11.293045929856284);
        inputMesses.add(new ArrayList<>() {
            {
                add(new Pair<>(new Pair<>(103.80398014591186, 102.08359242666548), 6));
                add(new Pair<>(new Pair<>(51.36013826078385, 3742.6459772607955), 3));
                add(new Pair<>(new Pair<>(38.87837683674738, 2242.4351424111087), 3));
                add(new Pair<>(new Pair<>(34.57905225132545, 2872.6894937349975), 2));
                add(new Pair<>(new Pair<>(93.7940386064852, 596.4851921411499), 10));
                add(new Pair<>(new Pair<>(77.08251980389512, 4384.938227154856), 10));
                add(new Pair<>(new Pair<>(103.57421930130896, 875.1858268996066), 2));
                add(new Pair<>(new Pair<>(78.47806212119262, 4622.565838456219), 2));
                add(new Pair<>(new Pair<>(0.11740026732089182, 2572.1426018584057), 3));
                add(new Pair<>(new Pair<>(92.75971679741436, 4694.488429358176), 8));
                add(new Pair<>(new Pair<>(92.30143247402596, 3092.0659683056238), 5));
                add(new Pair<>(new Pair<>(18.582486491661466, 5234.973545896562), 6));
                add(new Pair<>(new Pair<>(68.73147165939689, 2887.999286314042), 8));
                add(new Pair<>(new Pair<>(103.47099876228802, 3642.0860262015385), 8));
                add(new Pair<>(new Pair<>(72.29466302247566, 5613.56357301578), 4));
                add(new Pair<>(new Pair<>(61.26585884636464, 3908.791999970896), 3));
                add(new Pair<>(new Pair<>(81.70750682257524, 3773.7340545674833), 4));
                add(new Pair<>(new Pair<>(51.10796173290973, 934.0688895840524), 3));
                add(new Pair<>(new Pair<>(39.50412867465479, 2229.905649777077), 3));
                add(new Pair<>(new Pair<>(20.065537976094543, 4146.374435481705), 10));
                add(new Pair<>(new Pair<>(85.11440659824784, 2550.446938548962), 10));
                add(new Pair<>(new Pair<>(16.024539747205665, 5213.063422706786), 9));
                add(new Pair<>(new Pair<>(3.5648165767851596, 4056.7949300328137), 9));
                add(new Pair<>(new Pair<>(23.181145126732414, 4425.897564403771), 3));
                add(new Pair<>(new Pair<>(27.388154787887604, 600.005619626618), 1));
                add(new Pair<>(new Pair<>(60.32397659395492, 1880.9500722181572), 5));
                add(new Pair<>(new Pair<>(95.28834367309017, 3224.3662245564174), 8));
                add(new Pair<>(new Pair<>(103.46625474151118, 741.9584105114973), 4));
                add(new Pair<>(new Pair<>(101.12356799374092, 3412.3085676073556), 7));
                add(new Pair<>(new Pair<>(64.09050653310811, 4426.365264212952), 7));
                add(new Pair<>(new Pair<>(17.737466112496207, 4278.918393124227), 5));
                add(new Pair<>(new Pair<>(79.14985651794917, 5128.258801591191), 8));
                add(new Pair<>(new Pair<>(18.32920205728992, 1951.8794061700503), 6));
                add(new Pair<>(new Pair<>(6.772526260518448, 1949.674814954333), 4));
                add(new Pair<>(new Pair<>(38.120838965096425, 3776.045609396967), 10));
                add(new Pair<>(new Pair<>(58.030770150542224, 4484.575781174523), 1));
                add(new Pair<>(new Pair<>(59.59062397488317, 4754.821813529359), 6));
                add(new Pair<>(new Pair<>(57.829678133784235, 5812.695576346762), 3));
                add(new Pair<>(new Pair<>(54.57514028868184, 972.8736952317445), 3));
                add(new Pair<>(new Pair<>(42.677314293187926, 3533.2791176669375), 6));
                add(new Pair<>(new Pair<>(38.86666113811742, 2657.6291411732996), 7));
                add(new Pair<>(new Pair<>(0.8605795974821512, 5083.6438762389225), 10));
                add(new Pair<>(new Pair<>(71.23642815620586, 2868.3371159995463), 1));
                add(new Pair<>(new Pair<>(66.0621715048291, 2968.618859139703), 7));
                add(new Pair<>(new Pair<>(50.188746554858184, 2329.958246777892), 7));
                add(new Pair<>(new Pair<>(31.601466117483387, 2945.7886543141526), 8));
                add(new Pair<>(new Pair<>(12.657391284188547, 5565.899210920852), 3));
                add(new Pair<>(new Pair<>(33.23983096242855, 4608.576217094168), 6));
                add(new Pair<>(new Pair<>(52.23707132204872, 4672.09836992352), 9));
                add(new Pair<>(new Pair<>(90.10769819045935, 3085.6882980953696), 2));
                add(new Pair<>(new Pair<>(1.9440569974072415, 5679.226107690268), 3));
                add(new Pair<>(new Pair<>(94.09388580104316, 5792.857836889227), 3));
                add(new Pair<>(new Pair<>(74.87215475507595, 3242.1582209139046), 1));
                add(new Pair<>(new Pair<>(44.15337403933431, 3552.943275384898), 8));
                add(new Pair<>(new Pair<>(2.589756656053719, 3973.060579962132), 1));
                add(new Pair<>(new Pair<>(31.789144195474364, 13.28735496656648), 8));
                add(new Pair<>(new Pair<>(89.72752320699365, 1500.0902892568606), 2));
                add(new Pair<>(new Pair<>(32.20718524723119, 876.4847386056696), 6));
                add(new Pair<>(new Pair<>(79.08182861147526, 3412.252847427175), 4));
                add(new Pair<>(new Pair<>(63.24833339546687, 749.7193464252633), 5));
                add(new Pair<>(new Pair<>(38.242108669553446, 2816.7501048978042), 2));
                add(new Pair<>(new Pair<>(5.19312030116132, 1318.0086012730385), 1));
                add(new Pair<>(new Pair<>(78.4200457123064, 4298.49069458333), 5));
                add(new Pair<>(new Pair<>(73.85954080697425, 3544.1928707001475), 5));
                add(new Pair<>(new Pair<>(4.782746437005291, 454.08508547567607), 5));
                add(new Pair<>(new Pair<>(21.359163861724134, 1707.333864770578), 5));
                add(new Pair<>(new Pair<>(66.41017964384459, 406.2723693335083), 2));
                add(new Pair<>(new Pair<>(60.96897898796405, 5700.703849112758), 1));
                add(new Pair<>(new Pair<>(91.60033329364558, 1218.5051313568724), 7));
                add(new Pair<>(new Pair<>(59.31729191236118, 5577.571210077942), 6));
                add(new Pair<>(new Pair<>(101.73121792816518, 1896.3414630422453), 1));
                add(new Pair<>(new Pair<>(22.7650026333291, 627.6707680101803), 2));
                add(new Pair<>(new Pair<>(87.05759018576317, 3206.084737930209), 2));
                add(new Pair<>(new Pair<>(2.0647276449956506, 612.8484156559438), 10));
                add(new Pair<>(new Pair<>(4.897873670847268, 2957.292025735893), 6));
                add(new Pair<>(new Pair<>(90.9539643600777, 1623.769068839201), 6));
                add(new Pair<>(new Pair<>(86.81188518632553, 3905.6729227056016), 9));
                add(new Pair<>(new Pair<>(79.80766285303007, 5322.8167989241565), 10));
                add(new Pair<>(new Pair<>(102.04011867035214, 865.0217417874609), 4));
                add(new Pair<>(new Pair<>(68.83921010572207, 171.79861944376844), 7));
                add(new Pair<>(new Pair<>(88.04133806471002, 3741.6965029731805), 3));
                add(new Pair<>(new Pair<>(38.276416619795874, 1684.6731313235427), 6));
                add(new Pair<>(new Pair<>(36.402471635371676, 3144.1385021815286), 7));
                add(new Pair<>(new Pair<>(43.89859020262262, 4459.776364273117), 1));
                add(new Pair<>(new Pair<>(45.428948079089395, 1395.8760711102132), 4));
                add(new Pair<>(new Pair<>(82.47809670316107, 2103.047062558931), 10));
                add(new Pair<>(new Pair<>(40.90240381916735, 1332.591633036034), 7));
                add(new Pair<>(new Pair<>(74.49476116307112, 2410.9281244426147), 9));
                add(new Pair<>(new Pair<>(22.723970986884723, 5121.259713099711), 1));
                add(new Pair<>(new Pair<>(96.2015570730063, 2190.2950947978497), 10));
                add(new Pair<>(new Pair<>(62.96918288276548, 2260.626885699277), 1));
                add(new Pair<>(new Pair<>(7.7266317661792225, 475.364417011595), 10));
                add(new Pair<>(new Pair<>(0.9283543510266805, 3053.5374503334697), 3));
                add(new Pair<>(new Pair<>(21.392250479520413, 1811.8793689271117), 6));
                add(new Pair<>(new Pair<>(43.92535671061815, 5043.389156810329), 7));
                add(new Pair<>(new Pair<>(94.50031032749631, 2463.635094034017), 5));
                add(new Pair<>(new Pair<>(85.69547560273968, 387.28300215849197), 3));
                add(new Pair<>(new Pair<>(24.074321525488784, 1256.7820850873945), 8));
                add(new Pair<>(new Pair<>(18.913911854984825, 4750.612341371658), 1));
                add(new Pair<>(new Pair<>(72.77956344664454, 4964.426956501353), 2));
            }
        });
        expectedOrders.add(new ArrayList<>() {
            {
                add(79);
                add(96);
                add(4);
                add(27);
                add(78);
                add(68);
                add(56);
                add(75);
                add(85);
                add(87);
                add(20);
                add(12);
                add(43);
                add(72);
                add(28);
                add(13);
                add(76);
                add(62);
                add(5);
                add(48);
                add(99);
                add(31);
                add(77);
                add(69);
                add(67);
                add(37);
            }
        });


        boolean[] inputsPassed = new boolean[numOfTests];
        double[] testTimes = new double[numOfTests];


        System.out.println("""
                
                ================================================================================
                                              Testing Roomba ...
                ================================================================================""");


        for (int currentIndex = 0; currentIndex < numOfTests; ++currentIndex) {
            int testNumber = currentIndex + 1;
            double inputR = inputRs.get(currentIndex);
            ArrayList<Pair<Pair<Double, Double>, Integer>> inputMess = inputMesses.get(currentIndex);
            ArrayList<Integer> expectedOrder = expectedOrders.get(currentIndex);

            String inputAsString = getMessAsString(inputMess) + "\n\nInput r: " + inputR;

            System.out.printf("""
                    
                    -------------------------------
                             Input Mess %s
                    -------------------------------
                    %s
                    """, testNumber, inputAsString);

            long startTime = System.nanoTime();

            ArrayList<Integer> resultOrder = StudentSolver.run(inputR, inputMess);

            long endTime = System.nanoTime();
            testTimes[currentIndex] = (double) (endTime - startTime) / 1_000_000_000;

            int resultSum = getSeveritySum(inputMess, resultOrder);
            int expectedSum = getSeveritySum(inputMess, expectedOrder);

            System.out.printf("""
                    
                    -------------------------------
                          Simulated Results %s
                    -------------------------------
                    Result order: %s
                    Result sum:   %d
                    """, testNumber, resultOrder, resultSum);

            System.out.printf("""
                    
                    ------------------------------
                          Expected Results %s
                    ------------------------------
                    Sample order: %s
                    Expected sum: %d
                    """, testNumber, expectedOrder, expectedSum);

            if (getSeveritySum(inputMess, resultOrder) == getSeveritySum(inputMess, expectedOrder)) {
                inputsPassed[currentIndex] = true;
                ++numOfTestsPassed;
            }

            System.out.println("\n=======================================================================================");
        }

        StringBuilder testLog = new StringBuilder();

        for (int i = 0; i < numOfTests; ++i)
            testLog.append("\nTest ").append(i + 1).append(":\t ").append(inputsPassed[i] ? "+ Passed" : "- Failed");
        testLog.append("\n\nTests passed:\t").append(numOfTestsPassed).append(" / ").append(numOfTests);

        System.out.println(testLog);

        System.out.println("\n=======================================================================================");

        StringBuilder timeLog = new StringBuilder();
        double elapsedTime = 0;

        for (double time : testTimes)
            elapsedTime += time;

        for (int i = 0; i < numOfTests; ++i)
            timeLog.append("\nTest ").append(i + 1).append(" time:\t").append(testTimes[i]).append(" seconds");
        timeLog.append("\n\nTotal execution time:\t").append(elapsedTime).append(" seconds");

        System.out.println(timeLog);

        System.out.println("\n=======================================================================================");
    }

    public static String getMessAsString(ArrayList<Pair<Pair<Double, Double>, Integer>> messes) {

        // store the size to prevent excessive method calls within loops
        int messesSize = messes.size();
        StringBuilder messesAsString = new StringBuilder();

        for (int i = 0; i < messesSize; ++i) {
            // store the pair values for readability
            Pair<Pair<Double, Double>, Integer> mess = messes.get(i);
            Pair<Double, Double> coordinates = mess.first;
            int severity = mess.second;

            messesAsString.append("((").append(coordinates.first).append(", ").append(coordinates.second).append("), ")
                    .append(severity).append(")");

            if (i < messesSize - 1)
                messesAsString.append(",\n");
        }

        return messesAsString.toString();
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
}
