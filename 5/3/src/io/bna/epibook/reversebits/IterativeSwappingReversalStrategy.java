package io.bna.epibook.reversebits;

import io.bna.epiBook.swapBits.SwapBitsStrategy;
import io.bna.epiBook.swapBits.XorIfDiffSwap;

/**
 * Created by brand on 8/31/2016.
 */
public class IterativeSwappingReversalStrategy {
    SwapBitsStrategy swapper = new XorIfDiffSwap();

    public long reverse(long input) {
        short msb = Long.SIZE - 1,
              lsb = 0;
        long output = input;
        while(msb > lsb) {
            output = swapper.swap(output, lsb, msb);
            msb--;
            lsb++;
        }
        return output;
    }
}
