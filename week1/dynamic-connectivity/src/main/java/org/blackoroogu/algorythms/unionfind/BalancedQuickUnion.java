package org.blackoroogu.algorythms.unionfind;

/**
 * Created by kguryanov on 3/4/2016.
 * Actual QuickUnion class
 */

public class BalancedQuickUnion extends GenericUnion {

    final int[] sizes;

    protected BalancedQuickUnion(int size) {
        super(size);
        sizes = new int[size];
        for (int i = 0; i < size; i++)
            sizes[i] = 1;
    }

    public void union(int first, int second) {
        int firstID = root(first);
        int secondID = root(second);
        if (firstID == secondID)
            return;

        if (sizes[firstID] > sizes[secondID]) {
            items[firstID] = secondID;
            sizes[secondID] += sizes[firstID];
        } else {
            items[secondID] = firstID;
            sizes[firstID] += sizes[secondID];
        }
    }

    public int root(int index) {
        while (items[index] != index) {
            items[index] = items[items[index]];
            index = items[index];
        }

        return index;
    }


}
