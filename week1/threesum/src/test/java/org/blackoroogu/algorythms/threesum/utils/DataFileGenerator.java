package org.blackoroogu.algorythms.threesum.utils;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * Created by kguryanov on 6/22/2015.
 * Tests Data generator
 */
public class DataFileGenerator {

    public static String getName(int number){
        return String.format("%sthreesum.txt",number);
    }

    @Test
    @Parameters({"size"})
    public void genData(int size) {
        String filename = String.format(getName(size),size);
        Object[] intArray;
        HashSet<Integer> integerSet = new HashSet<>();
        Random randomGenerator = new Random();

        while(integerSet.size()<size){
            integerSet.add(randomGenerator.nextInt(size) - size / 2);
        }
        intArray = integerSet.toArray();
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(filename), "utf-8"))) {
            writer.write(Arrays.toString(intArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
