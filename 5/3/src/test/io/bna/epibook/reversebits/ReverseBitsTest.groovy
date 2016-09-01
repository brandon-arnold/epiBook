package io.bna.epibook.reversebits

/**
 * Created by brand on 8/31/2016.
 */
class ReverseBitsTest extends GroovyTestCase {

    void reverse(BitReversalStrategy b) {
        assertEquals(b.reverse(0xFEDCBA98), 0x195D3B7FL << 32)
    }

    void testIterativeSwappingReversalStrategy() {
        IterativeSwappingReversalStrategy iterativeStrat = new IterativeSwappingReversalStrategy()
        reverse(iterativeStrat)
    }

    void testLookupTableReversalStrategy() {
        LookupTableReversalStrategy s = new LookupTableReversalStrategy()
        reverse(s)
    }

    void testAltLookupTableReversalStrategy() {
        AltLookupTableReversalStrategy a = new AltLookupTableReversalStrategy()
        reverse(a)
    }
}
