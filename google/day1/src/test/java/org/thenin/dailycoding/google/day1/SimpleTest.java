package org.thenin.dailycoding.google.day1;

import org.testng.Assert;
import org.testng.annotations.Test;


import static org.thenin.dailycoding.google.day1.StupidOne.*;



public class SimpleTest {

    @Test(expectedExceptions = TooLazyException.class)
    public void simpleTestStupid() throws TooLazyException {
       StupidOne.solution(new int[]{10, 15, 3, 7} ,17);
    }

    @Test
    public void simmpleTestComon(){
       Assert.assertTrue(CommonOne.Solution(new int[]{10, 15, 3, 7} ,17));
    }

    @Test
    public void simmpleTestComon2(){
        Assert.assertFalse(CommonOne.Solution(new int[]{10, 15, 3, 6} ,17));
    }


}
