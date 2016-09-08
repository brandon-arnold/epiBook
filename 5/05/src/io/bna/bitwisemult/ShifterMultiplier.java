package io.bna.bitwisemult;

/**
 * Created by brand on 9/2/2016.
 */
public class ShifterMultiplier implements BitwiseMultiplyStrategy {
    @Override
    public long times(long x, long y) {
        long sum = 0;
        long twosMultBit = 0x1L << (Long.SIZE - 1);
        long twosAddBit, carry;
        while(twosMultBit != 0) {
            sum <<= 1;
            if((x & twosMultBit) > 0) {
                // add y to sum

                // add each bit of y to its appropriate place in sum, dealing with carry as necessary
                twosAddBit = y & ~(y - 1); // y's lowest 1 bit
                while(twosAddBit <= y) {
                    carry = twosAddBit;
                    if((twosAddBit & y) > 0) {
                        // add single bit into 'sum' at the place occupied by carry
                        while ((carry | sum) == sum) {
                            sum ^= carry;
                            carry <<= 1;
                        }
                        sum ^= carry; // activate the current 0th bit of sum, completing carry
                    }
                    twosAddBit <<= 1;
                }
            }
            twosMultBit >>>= 1;
        }
        return sum;
    }
}
