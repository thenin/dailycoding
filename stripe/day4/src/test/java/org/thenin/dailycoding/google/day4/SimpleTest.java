package org.thenin.dailycoding.google.day4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.thenin.dailycoding.google.day4.Solution.findMissingInt;

public class SimpleTest {
    @Test
    public void doTest(){
        Assert.assertEquals(findMissingInt(new int[]{3, 4, -1, 1}),2);
        Assert.assertEquals(findMissingInt(new int[]{1, 2, 0}),3);
    }
}
