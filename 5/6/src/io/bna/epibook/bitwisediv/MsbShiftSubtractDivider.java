package io.bna.epibook.bitwisediv;

/**
 * Created by brand on 9/3/2016.
 */
public class MsbShiftSubtractDivider implements BitwiseDivisionStrategy {

    @Override
    public long divide(long x, long y) {
        long twoPower = 0x1L,
             twoPowProduct = y,
             quotient = 0,
             remainder = x;
        while(remainder >= y) {
            while(twoPowProduct <= remainder) {
                twoPowProduct <<= 1;
                twoPower <<= 1;
            }
            twoPower >>>= 1;
            twoPowProduct >>>= 1;
            quotient += twoPower; // convert to bitwise +
            remainder -= twoPowProduct; // convert to bitwise -
            twoPowProduct = y;
            twoPower = 0x1L;
        }
        return quotient;
    }
}
