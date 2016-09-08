package io.bna.epibook.rectoverlaps

/**
 * Created by brand on 9/8/2016.
 */
class RectangleOverlapCheckerTest extends GroovyTestCase {
    Rectangle r1 = new Rectangle(0, 50, 0, 50),
              r2 = new Rectangle(25, 100, 25, 100),
              r3 = new Rectangle(50, 100, 50, 100);

    void testOverlapping() {
        RectangleOverlapChecker checker = new RectangleOverlapChecker();
        assertTrue(checker.isOverlapping(r1, r2));
        assertTrue(checker.isOverlapping(r2, r3));
        assertFalse(checker.isOverlapping(r1, r3));
    }
}
