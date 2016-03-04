package org.blackoroogu.algorythms.unionfind;

/**
 * Created by kguryanov on 3/4/2016.
 * Actual QuickUnion class
 */

public class QuickUnion extends GenericUnion {

    protected QuickUnion(int size) {
        super(size);
    }

    public void union(int first, int second) {
        int firstID = root(first);
        int secondID = root(second);
        items[firstID] = secondID;
    }

    public int root(int index) {
        if (items[index] == index)
            return index;

        return (root(items[index]));
    }


}
