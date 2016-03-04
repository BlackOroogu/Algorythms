package org.blackoroogu.algorythms.threesum;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kguryanov on 3/4/2016.
 * ThreeSum Abstract
 */
abstract class GenericThreeSum implements IThreeSum {
    protected int[] items;
    protected ArrayList<int[]> sums = new ArrayList<int[]>();

    public GenericThreeSum(int[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
//        String formatFormula = String.format("%%0%dd",(int)(Math.log10(items.length))+1);
        ArrayList<String> tmp = new ArrayList<String>();
        for (int[] values : sums)
            tmp.add(Arrays.toString(values));

        return this.getClass().getSimpleName() +
                "{items={" + String.join(",",tmp) +
                "}}";
    }

    public String items() {
//        String formatFormula = String.format("%%0%dd",(int)(Math.log10(items.length))+1);
        return this.getClass().getSimpleName() +
                "{items=" + Arrays.toString(items) +
                '}';
    }
}
