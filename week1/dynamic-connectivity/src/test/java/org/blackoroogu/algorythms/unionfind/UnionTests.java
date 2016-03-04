package org.blackoroogu.algorythms.unionfind;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kguryanov on 3/4/2016.
 * Union and UnionFind test class
 */
public class UnionTests {

    @Test
    public void UnionTest(){
        Union theUnion = new Union(10);
        theUnion.union(0,9);
        Assert.assertTrue(theUnion.isConnected(0,9));
    }
}
