package org.blackoroogu.algorythms.unionfind;

/**
 * Created by kguryanov on 3/4/2016.
 * Actual Union class
 */

public class Union implements IUnion {
    private final int[] items;

    public Union(int size){
        items = new int[size];
    }

    public void union(int first, int second) {

    }

    public boolean isConnected(int first, int second) {
        return false;
    }

    public int find(int item) {
        return 0;
    }

    public int count() {
        return 0;
    }
}
