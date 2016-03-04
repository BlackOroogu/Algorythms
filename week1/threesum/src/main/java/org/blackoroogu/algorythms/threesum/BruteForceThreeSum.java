package org.blackoroogu.algorythms.threesum;

/**
 * Created by kguryanov on 3/4/2016.
 * ThreeSums bruteforced
 */
public class BruteForceThreeSum extends GenericThreeSum {
    public BruteForceThreeSum(int[] items) {
        super(items);
    }

    public int calcSums() {
        for (int i : items)
            for (int k : items)
                for (int j : items)
                    if (isZeroSum(i, k, j))
                        sums.add(new int[]{i, k, j});
        return sums.size();
    }

    private boolean isZeroSum(int i, int j, int k){
        return (i+j+k == 0);
    }
}
