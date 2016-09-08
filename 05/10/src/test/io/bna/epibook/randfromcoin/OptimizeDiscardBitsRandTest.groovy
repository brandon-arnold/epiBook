package io.bna.epibook.randfromcoin

/**
 * Created by brand on 9/8/2016.
 */
class OptimizeDiscardBitsRandTest extends GroovyTestCase {
    void testRand() {
        OptimizeDiscardBitsRand r = new OptimizeDiscardBitsRand();
        for(int i = 1; i < 2000; i++) {
            int randy = r.rand(0, i);
            assertTrue(randy <= i);
            System.out.println("x=0, y=" + i.toString() + ", rand=" + randy.toString());
        }
    }
}
