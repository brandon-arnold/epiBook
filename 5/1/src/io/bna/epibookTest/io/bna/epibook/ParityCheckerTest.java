package io.bna.epibook;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by brand on 8/31/2016.
 */
public class ParityCheckerTest {

    private void parityAssertion(ParityCheckStrategy p) throws Exception {
        assertEquals(p.parity(5), 0);
        assertEquals(p.parity(15), 0);
        assertEquals(p.parity(255), 0);
        assertEquals(p.parity(128), 1);
        assertEquals(p.parity(Long.MAX_VALUE), 1);
        assertEquals(p.parity(0x10101000), 1);
        assertEquals(p.parity(0xFFFFFFFF), 0);
        assertEquals(p.parity(0xFFFFFFFF), 0);
        assertEquals(p.parity(0xFFFFFFFF), 0);
    }

    @Test
    public void cancelLowestTest() throws Exception {
        ParityCheckStrategy clParity = new CancelLowestBitChecker();
        parityAssertion(clParity);
    }

    @Test
    public void shiftParityTest() throws Exception {
        ParityCheckStrategy sParity = new ShiftParityChecker();
        parityAssertion(sParity);
    }

    @Test
    public void lookupTableTest() throws Exception {
        ParityCheckStrategy ltParity = new LookupTableChecker();
        parityAssertion(ltParity);
    }
}