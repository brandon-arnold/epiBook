package io.bna.epiBook.swapBits

/**
 * Created by brand on 8/31/2016.
 */
class SwapBitsTest extends GroovyTestCase {

    void testSwap(SwapBitsStrategy p) {
        assertEquals(p.swap((long)0x3, (short)0, (short)1), 0x3)
        assertEquals(p.swap((long)0x1, (short)0, (short)1), 0x2)
        assertEquals(p.swap((long)0x2, (short)1, (short)0), 0x1)
        assertEquals(p.swap((long)0x2, (short)0, (short)1), 0x1)
        assertEquals(p.swap((long)0xFFFEFFFF, (short)0, (short)16), 0xFFFFFFFE)
    }

    public void testSimpleShiftBothSwap() {
        SwapBitsStrategy simple = new SimpleShiftBothSwap()
        testSwap(simple)
    }

    public void testXorIfDiffSwap() {
        SwapBitsStrategy xorIfDiff = new XorIfDiffSwap()
        testSwap(xorIfDiff)
    }
}
