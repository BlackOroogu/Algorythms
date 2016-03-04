package org.blackoroogu.algorythms.unionfind;

/**
 * Created by kguryanov on 3/4/2016.
 * Actual Union class
 */

public class Union extends GenericUnion {

    protected Union(int size) {
        super(size);
    }

    public void union(int first, int second) {
        int firstID = find(first);
        int secondID = find(second);
        if (firstID != secondID)
            items[firstID] = secondID;
    }

    public int find(int index) {
        if (items[index] == index)
            return index;

        return (find(items[index]));
    }




}
