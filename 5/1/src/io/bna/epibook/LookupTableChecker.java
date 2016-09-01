package io.bna.epibook;

/**
 * Created by brand on 8/31/2016.
 */
public class LookupTableChecker implements ParityCheckStrategy {
    short[] intIsOdd = new short[0x10000];
    CancelLowestBitChecker p = new CancelLowestBitChecker();

    public LookupTableChecker() {
        for(int i = 0; i < 0x10000; i++)
            intIsOdd[i] = (short)p.parity((long)i);
    }

    @Override
    public int parity(long x) {
        return (
                  intIsOdd[(int)((x >>> 48) & 0xFFFF)]
                ^ intIsOdd[(int)((x >>> 32) & 0xFFFF)]
                ^ intIsOdd[(int)((x >>> 16) & 0xFFFF)]
                ^ intIsOdd[(int)(x & 0xFFFF)]
               );
    }
}
