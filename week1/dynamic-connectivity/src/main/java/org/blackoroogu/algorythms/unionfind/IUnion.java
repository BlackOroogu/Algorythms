package org.blackoroogu.algorythms.unionfind;

/**
 * Created by kguryanov on 3/4/2016.
 * Interface for Union class
 */
public interface IUnion {
    void union(int first, int second);
    boolean isConnected(int first, int second);
    int find(int item);
    int count();
}
