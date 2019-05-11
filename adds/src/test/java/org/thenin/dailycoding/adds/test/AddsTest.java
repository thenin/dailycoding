package org.thenin.dailycoding.adds.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.thenin.dailycoding.adds.addsArray;

public class AddsTest {

    @Test
    private void addTestSimple(){
        Assert.assertTrue(addsArray.checkSum(new int[]{10, 15, 3, 7},17));
        Assert.assertTrue(addsArray.checkSum(new int[]{10, 15, 8, 7, 19, 30},26));
        Assert.assertTrue(addsArray.checkSum(new int[]{10, -17, 8, 7, 19, 30},13));
        Assert.assertFalse(addsArray.checkSum(new int[]{10, -17, 8, 7, 19, 30},14));
    }
}
