package org.blackoroogu.algorythms.unionfind;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by kguryanov on 3/4/2016.
 * QuickUnion and UnionFind test class
 */
public class UnionTests {

    @Test
    public void QuickUnionTest() {
        QuickUnion theUnion = new QuickUnion(10);
        Reporter.log(theUnion.toString(), true);

        doTests(theUnion);
    }

    @Test
    public void QuickUnionTest2() {
        QuickUnion theUnion2 = new QuickUnion(10);
        Reporter.log(theUnion2.toString(), true);

        doTests2(theUnion2);
    }

    @Test
    public void QuickFindTest() {
        QuickFind theUnion = new QuickFind(10);
        Reporter.log(theUnion.toString(), true);

        doTests(theUnion);

    }

    @Test
    public void BalancedQuickUnionTest() {
        BalancedQuickUnion theUnion = new BalancedQuickUnion(10);
        Reporter.log(theUnion.toString(), true);

        doTests(theUnion);

    }

    @Test
    public void BalancedQuickUnionTest2() {
        BalancedQuickUnion theUnion = new BalancedQuickUnion(10);
        Reporter.log(theUnion.toString(), true);

        doTests2(theUnion);

    }


    @BeforeMethod
    protected void startSession(Method method) throws Exception {

        Reporter.log(String.format("\n" +
                "[=========== %s ===========]", method.getName()), true);
    }

    private void doTests(IUnion theUnion) {
        doTest(theUnion, 4, 3);
        doTest(theUnion, 3, 8);
        doTest(theUnion, 6, 5);
        doTest(theUnion, 9, 4);
        doTest(theUnion, 2, 1);
        doTest(theUnion, 8, 9);
//        doTest(theUnion, 5, 4);
        doTest(theUnion, 5, 0);
        doTest(theUnion, 7, 2);
        doTest(theUnion, 6, 1);
        doTest(theUnion, 7, 3);

    }

    private void doTests2(IUnion theUnion) {
        for (int i = 0; i < theUnion.length() - 1; i++)
            doTest(theUnion, i, i + 1);

    }

    private void doTest(IUnion theUnion, int first, int second) {
        theUnion.union(first, second);
        Assert.assertTrue(theUnion.isConnected(first, second));
        Reporter.log(theUnion.toString(), true);
    }
}
