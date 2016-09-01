package io.bna.epibook.reversebits

/**
 * Created by brand on 8/31/2016.
 */
class ReverseBitsTest extends GroovyTestCase {
    IterativeSwappingReversalStrategy iterativeStrat = new IterativeSwappingReversalStrategy();

    void testReverse() {
        assertEquals(iterativeStrat.reverse(0xFEDCBA98), 0x195D3B7FL << 32);
    }
}
