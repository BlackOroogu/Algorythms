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
    }


    public boolean isConnected(int first, int second) {
        return find(first) == find(second);
    }

    @Override
    public String toString() {
        return "Union{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    public int count() {
        int count = 0;
        int[] cache = new int[items.length];
        for (int i =0; i< cache.length; i++)
            if (cache[i] == 0) {
                cache[find(i)]++;
                count++;
            }
        return count;
    }
}
