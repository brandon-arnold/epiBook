package io.bna.epiBook.swapBits;

/**
 * Created by brand on 8/31/2016.
 */
public class SimpleShiftBothSwap implements SwapBitsStrategy {

    @Override
    public long swap(long value, short x, short y) {
        short larger = (short)Math.max(x, y),
              smaller = (short)Math.min(x, y);
        long mask = (0x1 << x) | (0x1 << y);
        long zeroedXY = value & ~mask;
        long xAtY = (value & (0x1 << larger)) >>> (larger - smaller);
        long yAtX = (value & (0x1 << smaller)) << (larger - smaller);
        return zeroedXY | xAtY | yAtX;
    }
}
