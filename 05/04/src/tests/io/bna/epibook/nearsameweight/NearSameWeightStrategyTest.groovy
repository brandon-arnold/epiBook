package io.bna.epibook.nearsameweight

import sun.java2d.pipe.SpanShapeRenderer

/**
 * Created by brand on 9/2/2016.
 */
class NearSameWeightStrategyTest extends GroovyTestCase {

    void testStrategy(NearSameWeightStrategy s) {
        assertEquals(s.getNearest(0x0000000000000010L), 0x0000000000000008L);
        assertEquals(s.getNearest(0x0000000000000100L), 0x0000000000000080L);
        assertEquals(s.getNearest(0xFFFFFFFFFFFFF0FEL), 0xFFFFFFFFFFFFF0FDL);
        assertEquals(s.getNearest(0xFFFFFFFFFFFFF0FFL), 0xFFFFFFFFFFFFF17FL);
    }

    public void testSimpleLowest() {
        NearSameWeightStrategy s = new SimpleLowestOnesStrategy();
        testStrategy(s);
    }
}
