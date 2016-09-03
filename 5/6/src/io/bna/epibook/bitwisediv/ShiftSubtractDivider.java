package io.bna.epibook.bitwisediv;

/**
 * Created by brand on 9/2/2016.
 */
public class ShiftSubtractDivider implements BitwiseDivisionStrategy {
    @Override
    public long divide(long x, long y) {
        long inc = 0,
             remainder = x;
        long twosSubtractBit, carry;
        while(remainder >= y) {
            inc++;

            // subtract y from remainder
            twosSubtractBit = y & ~(y - 1);
            while(twosSubtractBit <= y) {
                if((twosSubtractBit & y) > 0) {
                    carry = twosSubtractBit;
                    while ((carry & remainder) == 0) {
                        remainder |= carry;
                        carry <<= 1;
                    }
                    remainder ^= carry;
                }
                twosSubtractBit <<= 1;
            }
        }
        return inc;
    }
}
