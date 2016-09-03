package io.bna.epibook.ispalindrome;

/**
 * Created by brand on 9/3/2016.
 */
public class DigitArrayPalindromeChecker implements IsPalindromeStrategy {

    @Override
    public boolean isPalindrome(long n) {
        short[] digits = new short[64];
        short nLen = 0;
        while(n > 0) {
            digits[nLen] = (short)(n % 10);
            n /= 10;
            nLen++;
        }
        for(int i = 0; i < nLen / 2; i++)
            if(digits[i] != digits[nLen - i - 1])
                return false;
        return true;
    }

}
