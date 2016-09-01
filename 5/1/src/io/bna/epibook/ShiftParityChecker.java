package io.bna.epibook;

/**
 * Created by brand on 8/31/2016.
 */
public class ShiftParityChecker implements ParityCheckStrategy {
    @Override
    public int parity(long x) {
        int toggler = 0;
        while(x > 0) {
            toggler ^= (x & 0x1);
            x >>>= 1;
        }
        return toggler;
    }
}
