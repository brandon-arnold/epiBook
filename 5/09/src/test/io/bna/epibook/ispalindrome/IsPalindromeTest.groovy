package io.bna.epibook.ispalindrome

/**
 * Created by brand on 9/3/2016.
 */
class IsPalindromeTest extends GroovyTestCase {

    void testStrategy(IsPalindromeStrategy s) {
        assertTrue(s.isPalindrome(123454321));
        assertTrue(s.isPalindrome(11111*11111));
        assertFalse(s.isPalindrome(123456));
    }

    void testDigitArrayPalindrome() {
        IsPalindromeStrategy s = new DigitArrayPalindromeChecker();
        testStrategy(s);
    }
}
