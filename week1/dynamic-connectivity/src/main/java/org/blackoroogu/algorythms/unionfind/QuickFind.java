package org.blackoroogu.algorythms.unionfind;

/**
 * Created by kguryanov on 3/4/2016.
 * A QuickFind implementation
 */
public class QuickFind extends GenericUnion {

    protected QuickFind(int size) {
        super(size);
    }

    public void union(int first, int second) {
        int firstID = root(first);
        int secondID = root(second);
        for (int i = 0; i < items.length; i++)
            if (items[i] == firstID)
                items[i] = secondID;
    }

    public int root(int index){
        return items[index];
    }

}
