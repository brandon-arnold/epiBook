package io.bna.epibook.bitwisediv

/**
 * Created by brand on 9/2/2016.
 */
class BitwiseDivisionStrategyTest extends GroovyTestCase {
    void testShiftSubtractDivider() {
        BitwiseDivisionStrategy s = new ShiftSubtractDivider();
        assertEquals(s.divide(0xFF00FF00L, 0x00FF00FFL), 0xFF00FF00L / 0x00FF00FFL);
        assertEquals(s.divide(300, 100), 3);
    }
}
