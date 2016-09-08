package io.bna.epiBook.swapBits;

/**
 * Created by brand on 8/31/2016.
 */
public class XorIfDiffSwap implements SwapBitsStrategy {
    @Override
    public long swap(long value, short x, short y) {
        if( ((value >>> x) & 0x1) != ((value >>> y) & 0x1)) {
            long mask = ((long)0x1 << x) | ((long)0x1 << y);
            return value ^ mask;
        }
        return value;
    }
}
