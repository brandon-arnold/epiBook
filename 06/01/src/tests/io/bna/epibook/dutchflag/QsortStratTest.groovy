package io.bna.epibook.dutchflag

/**
 * Created by brand on 9/8/2016.
 */
class QsortStratTest extends GroovyTestCase {
    QsortStrat q = new QsortStrat();

    void testFlag50() {
        int[] flag = new int[50];
        Random rn = new Random()
        for(int i = 0; i < 50; i++)
            flag[i] = rn.nextInt(25);
        int twentyFifth = flag[25];
        // System.out.println(Arrays.toString(flag));
        // System.out.println(twentyFifth.toString());
        q.sort(flag, 25);
        // System.out.println(Arrays.toString(flag));
        int section = flag[0] == twentyFifth ? 1 : 0;
        for(int i = 0; i < 50; i++) {
            if(section == 0) {
                assertTrue(flag[i] < twentyFifth);
                if(i < 49)
                    if(flag[i + 1] == twentyFifth)
                        section++;
            } else if(section == 1) {
                assertTrue(flag[i] == twentyFifth);
                if(i < 49)
                    if(flag[i + 1] > twentyFifth)
                        section++;
            } else
                assertTrue(flag[i] > twentyFifth);
        }
    }

    void test20times() {
        for(int i = 0; i < 20; i++)
            testFlag50();
    }
}
