package io.bna.epibook.reversedigs

/**
 * Created by brand on 9/3/2016.
 */
class DigitReversalTest extends GroovyTestCase {
    void reverse(DigitReversalStrategy s) {
        assertEquals(123456789L, s.reverseDigits(987654321L));
        assertEquals(99887766L, s.reverseDigits(66778899L));
    }

    void testReverseAsString() {
        DigitReversalStrategy s = new ReverseAsString();
        reverse(s);
    }
}
