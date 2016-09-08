package io.bna.epibook.bitwisepow

import static java.lang.Math.pow;

/**
 * Created by brand on 9/3/2016.
 */
class BitwisePowStrategyTest extends GroovyTestCase {

    void testStrategy(BitwisePowStrategy s) {
        assertEquals(s.pow(5d, 3), 125d);
        assertEquals(s.pow(39802339d, 0xA), pow(39802339, 10d));
    }

    void testLowestYNMultiplyPow() {
        BitwisePowStrategy s = new LowestYNMultiplyPow();
        testStrategy(s);
    }
}
