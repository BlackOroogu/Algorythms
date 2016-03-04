package org.blackoroogu.algorythms.threesum;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Random;

/**
 * Created by kguryanov on 3/4/2016.
 * Simple tests for ThreeSUm
 */
public class ThreeSumTests {
    private static int[] theData;

    @Test
    public void SimpleTest() {
        BruteForceThreeSum btTreeSum = new BruteForceThreeSum(theData);
        doTest(btTreeSum);

    }

    @BeforeClass
    public void genData() {
        int[] intArray = new int[10];
        HashSet<Integer> integerSet = new HashSet<Integer>();
        Random rnd = new Random();
        int size = intArray.length;
        while (integerSet.size() < size) {
            integerSet.add(rnd.nextInt(size * 2) * 5 - size * 5);
        }

        int i = 0;
        for (int tmp : integerSet.toArray(new Integer[integerSet.size()])) {
            intArray[i++] = tmp;
        }

        theData = intArray;
    }

    private void doTest(IThreeSum calc) {
        Reporter.log(calc.items(), true);
        Reporter.log(String.valueOf(calc.calcSums()), true);
        Reporter.log(calc.toString(), true);
    }

    @BeforeMethod
    protected void startSession(Method method) throws Exception {
        Reporter.log(String.format("\n" +
                "[=========== %s ===========]", method.getName()), true);
    }


}
