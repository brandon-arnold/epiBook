package io.bna.epibook.reversebits;

/**
 * Created by brand on 8/31/2016.
 */
public class LookupTableReversalStrategy implements BitReversalStrategy {
    long[] masks = new long[32];

    public LookupTableReversalStrategy() {
        for(int i = 0; i < 32; i++)
            masks[i] = (0x1L << 63 - i) | (0x1L << i);
    }

    @Override
    public long reverse(long bits) {
        long masked;
        for(int i = 0; i < 32; i++) {
            masked = bits & masks[i];
            if(masked != masks[i] && masked != 0L)
                bits ^= masks[i];
        }
        return bits;
    }
}
