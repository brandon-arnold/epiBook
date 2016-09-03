package io.bna.epibook.nearsameweight;

/**
 * Created by brand on 9/2/2016.
 */
public class SimpleLowestOnesStrategy implements NearSameWeightStrategy {
    @Override
    public long getNearest(long bits) throws IllegalArgumentException  {
        if(bits == 0L || bits == -1L)
            throw new IllegalArgumentException("Provided number cannot be 0 or -1");

        long lowest1 = bits & ~(bits - 1);
        if(lowest1 == 0b1L) {
            long lowest0 = (~bits) & ~((~bits) - 1);
            //swap the least significant zero with the one to its right
            return bits ^ lowest0 ^ (lowest0 >>> 1);
        }
        //swap the least significant one with the zero to its right
        return bits ^ lowest1 ^ (lowest1 >>> 1);
    }
}
