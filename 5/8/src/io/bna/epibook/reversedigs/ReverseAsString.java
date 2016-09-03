package io.bna.epibook.reversedigs;

/**
 * Created by brand on 9/3/2016.
 */
public class ReverseAsString implements DigitReversalStrategy {
    @Override
    public long reverseDigits(long in) {
        char[] digits = Long.toString(in).toCharArray();
        int len = digits.length;
        char temp;
        for(int i = 0; i < len / 2; i++) {
            temp = digits[i];
            digits[i] = digits[len - i - 1];
            digits[len - i - 1] = temp;
        }
        return Long.parseLong(new String(digits));
    }
}
