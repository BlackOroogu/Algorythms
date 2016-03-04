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
        int firstID = find(first);
        int secondID = find(second);
        for (int i = 0; i < items.length; i++)
            if (items[i] == firstID)
                items[i] = secondID;
    }

    public int find(int index) {
        return items[index];
    }

    public int count() {
        return 0;
    }
}
