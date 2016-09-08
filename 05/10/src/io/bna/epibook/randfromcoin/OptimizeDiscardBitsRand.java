package io.bna.epibook.randfromcoin;

import java.util.Random;

/**
 * Created by brand on 9/8/2016.
 */
public class OptimizeDiscardBitsRand implements RandFromCoinFlipStrategy {
    @Override
    public int rand(int min, int max) {
        int range = max - min,
            limit = 0;
        while(range > 0) {
            limit++;
            range >>>= 1;
        }

        Random rn = new Random();
        int curRand = Integer.MAX_VALUE;
        while(curRand > (max - min)) {
            curRand = 0;
            for(int i = 0; i < limit; i++) {
                curRand |= rn.nextBoolean() ? 1 : 0;
                curRand <<= 1;
            }
        }
        return min + curRand;
    }
}
