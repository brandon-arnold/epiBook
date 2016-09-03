package io.bna.bitwisemult

/**
 * Created by brand on 9/2/2016.
 */
class BitwiseMultiplyStrategyTest extends GroovyTestCase {

    void testShifterMultiplier() {
        BitwiseMultiplyStrategy s = new ShifterMultiplier();
        assertEquals(s.times(2895, 29589), 2895 * 29589);
        assertEquals(s.times(0x00FF0000L, 0xFF000000L), 0x00FF0000L * 0xFF000000L);
    }
}
