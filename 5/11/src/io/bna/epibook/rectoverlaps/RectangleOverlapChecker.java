package io.bna.epibook.rectoverlaps;

/**
 * Created by brand on 9/8/2016.
 */
public class RectangleOverlapChecker {
    
    boolean isOverlapping(Rectangle r1, Rectangle r2) {
        boolean xOverlaps = isBetween(r1.getxMin(), r1.getxMax(), r2.getxMin()) || isBetween(r1.getxMin(), r1.getxMax(), r2.getxMax());
        boolean yOverlaps = isBetween(r1.getyMin(), r1.getyMax(), r2.getyMin()) || isBetween(r1.getyMin(), r1.getyMax(), r2.getyMax());
        return xOverlaps && yOverlaps;
    }
    
    private boolean isBetween(int min, int max, int val) {
        return min < val && max > val;
    }
}
