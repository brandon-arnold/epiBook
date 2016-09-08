package io.bna.epibook.bitwisepow;

/**
 * Created by brand on 9/3/2016.
 */
public class LowestYNMultiplyPow implements BitwisePowStrategy {
    @Override
    public double pow(double x, int y) {
        if(y == 0) return 1d;
        else if(y == 1) return x;
        double bundlePow = 1,
               xToBundlePow = x,
               result = x;
        y -= bundlePow;
        while(y > 0) {
            if(bundlePow <= y) {
                result *= xToBundlePow;
                y -= bundlePow;
            } else {
                bundlePow = 1;
                while (bundlePow * bundlePow < y) bundlePow++;
                xToBundlePow = x;
                for(int i = 1; i < bundlePow; i++)
                    xToBundlePow *= x;
            }
        }
        return result;
    }
}
