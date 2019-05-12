package org.thenin.dailycoding.adds.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.thenin.dailycoding.adds.addsArray;

import java.util.Arrays;
import java.util.HashSet;

public class AddsTest {
    static private Logger log = Logger.getLogger(AddsTest.class);

    @Test
    private void addTestSimple(){
        Assert.assertTrue(addsArray.checkSum(new int[]{10, 15, 3, 7},17));
        Assert.assertTrue(addsArray.checkSum(new int[]{10, 15, 8, 7, 19, 30},26));
        Assert.assertTrue(addsArray.checkSum(new int[]{10, -17, 8, 7, 19, 30},13));
        Assert.assertFalse(addsArray.checkSum(new int[]{10, -17, 8, 7, 19, 30},14));
    }

    @Test(dataProvider="genData")
    public static void testDataProvider(int[] values, int sum){

        Assert.assertTrue(addsArray.checkSum(values,sum));
    }

    @DataProvider
    public Object[][] genData() {
        log.debug("Prepare data.....");
        HashSet<Integer> uniqueList = new HashSet<>();
        int size = (int)(Math.random()*10+3);

        while (uniqueList.size()<size) uniqueList.add((int) (Math.random() * 99 + 1));

        int[] tmp = uniqueList.stream().mapToInt(i->i).toArray();
        int first=0,second=0;
        while (first == second){
            first = (int)(Math.random()*tmp.length);
            second = (int)(Math.random()*tmp.length);
        }
        int sum = tmp[first] + tmp[second];

        log.debug(Arrays.toString(tmp));
        log.debug(String.format("Selected %d and %d .......",first,second));
        log.debug(String.format("%d + %d = %d",tmp[first],tmp[second],sum));
        log.debug("Done prepare data.....");
        return new Object[][]{{tmp,sum}};
    }
}
