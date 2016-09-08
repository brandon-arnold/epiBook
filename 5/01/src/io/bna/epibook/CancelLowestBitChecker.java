package io.bna.epibook;

/**
 * Created by brand on 8/31/2016.
 */
public class CancelLowestBitChecker implements ParityCheckStrategy {
    @Override
    public int parity(long x) {
        int toggler = 0;
        while(x > 0) {
            toggler ^= 0x1;
            x = x & (x - 1);
        }
        return toggler;
    }
}
