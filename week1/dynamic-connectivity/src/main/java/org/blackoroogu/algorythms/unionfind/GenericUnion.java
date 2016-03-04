package org.blackoroogu.algorythms.unionfind;

import java.util.Arrays;

/**
 * Created by kguryanov on 3/4/2016.
 * A QuickUnion implementation
 */
abstract class GenericUnion implements IUnion {
    protected final int[] items;

    protected GenericUnion(int size) {
        items = new int[size];
        for (int i = 0; i < size; i++)
            items[i] = i;
    }


    public boolean isConnected(int first, int second) {
        return root(first) == root(second);
    }

    @Override
    public String toString() {
        String formatFormula = String.format("%%0%dd",(int)(Math.log10(items.length))+1);
        return this.getClass().getSimpleName() + "[" + String.format(formatFormula, count()) + "]" +
                "{items=" + Arrays.toString(items) +
                '}';
    }

    public int count() {
        int count = 0;
        int[] cache = new int[items.length];
        for (int i = 0; i < cache.length; i++)
            if (cache[root(i)] == 0) {
                cache[root(i)]++;
                count++;
            }
        return count;
    }

    public int[] depths(){
        int[] depths  = new int[items.length];
        for (int i = 0; i < depths.length; i++)
            depths[i] = getdepth(i);
        return depths;
    }

    private int getdepth(int index){
        int count=1;
        while(items[index] != index){
            count++;
            index = items[index];
        }
        return count;
    }

    public int length(){
        return items.length;
    }
}
