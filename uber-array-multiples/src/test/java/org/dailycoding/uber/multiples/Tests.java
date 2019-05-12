package org.dailycoding.uber.multiples;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.util.Arrays;
import java.util.HashSet;

import static org.dailycoding.uber.multiples.Solution.*;

public class Tests {

    private static Logger log = Logger.getLogger(Tests.class);

    @Test
    public void testDivision(){
        Assert.assertEquals(arrayMultiplesWithDivision(new long[]{3, 2, 1}),new long[]{2, 3, 6});
        Assert.assertEquals(arrayMultiplesWithDivision(new long[]{1, 2, 3, 4, 5}),new long[]{120, 60, 40, 30, 24});
    }

    @Test
    public void testNoDivision(){
        Assert.assertEquals(arrayMultiplesNoDivision(new long[]{3, 2, 1}),new long[]{2, 3, 6});
        Assert.assertEquals(arrayMultiplesNoDivision(new long[]{1, 2, 3, 4, 5}),new long[]{120, 60, 40, 30, 24});
    }

    @Test
    public void testNoDivisionRightWay(){
        Assert.assertEquals(arrayMultiplesNoDivisionRightWay(new long[]{3, 2, 1}),new long[]{2, 3, 6});
        Assert.assertEquals(arrayMultiplesNoDivisionRightWay(new long[]{1, 2, 3, 4, 5}),new long[]{120, 60, 40, 30, 24});
    }


    @Test(dataProvider="genData")
    public void syntheticTest(long[] inArray,long[] multiples){
        long startTime = System.currentTimeMillis();
        Assert.assertEquals(arrayMultiplesWithDivision(inArray),multiples);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        log.info(String.format("arrayMultiplesWithDivision execution time: %d",elapsedTime));

        startTime = System.currentTimeMillis();
        Assert.assertEquals(arrayMultiplesNoDivision(inArray),multiples);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        log.info(String.format("arrayMultiplesNoDivision execution time: %d",elapsedTime));

        startTime = System.currentTimeMillis();
        Assert.assertEquals(arrayMultiplesNoDivisionRightWay(inArray),multiples);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        log.info(String.format("arrayMultiplesNoDivisionRightWay execution time: %d",elapsedTime));
    }

    @DataProvider
    public Object[][] genData() {
        long[] inArray = genInArray(1000);

        return new Object[][]{{inArray,getMultiples(inArray)}};
    }

    private static long[] getMultiples(long[] inArray){
        long[] result = new long[inArray.length];

        long multiple = 1;
        for (long l : inArray) {
            multiple *= l;
        }

        for (int i=0;i<result.length;i++){
            result[i] = multiple/inArray[i];
        }
        log.debug("Multiples:"+Arrays.toString(result));
        return result;
    }

    private long[] genInArray(int size) {
        long[] result = new long[size];

        Arrays.setAll(result, i -> (int) (Math.random() * 2+1));
        log.debug("InArray:"+Arrays.toString(result));
        return result;

    }
}
