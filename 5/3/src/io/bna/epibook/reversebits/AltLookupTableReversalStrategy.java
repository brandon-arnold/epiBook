package io.bna.epibook.reversebits;

/**
 * Created by brand on 8/31/2016.
 */
public class AltLookupTableReversalStrategy implements BitReversalStrategy {
    BitReversalStrategy reverser = new LookupTableReversalStrategy();
    int[] reversals = new int[0x10000];

    public AltLookupTableReversalStrategy() {
        for(int i = 0; i < 0x10000; i++)
            reversals[i] = (int)(reverser.reverse(i) >>> 48);
    }

    @Override
    public long reverse(long bits) {
        int lsb  = (int)(bits & 0xFFFF),
            mlsb = (int)((bits >>> 16) & 0xFFFF),
            lmsb = (int)((bits >>> 32) & 0xFFFF),
            msb  = (int)((bits >>> 48) & 0xFFFF);
        return (long)reversals[lsb] << 48 | (long)reversals[mlsb] << 32 | (long)reversals[lmsb] << 16 | (long)reversals[msb];
    }
}
