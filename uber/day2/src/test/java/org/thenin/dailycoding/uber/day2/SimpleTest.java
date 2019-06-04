package org.thenin.dailycoding.uber.day2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test(expectedExceptions = Solutions.TooLazyException.class)
    public void testBruteForce() throws Solutions.TooLazyException {
        Assert.assertEquals(Solutions.doBruteForce(new int[]{1, 2, 3, 4, 5}), new int[]{120, 60, 40, 30, 24});
        Assert.assertEquals(Solutions.doBruteForce(new int[]{3, 2, 1}), new int[]{2, 3, 6});
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(Solutions.doWithDIvision(new int[]{1, 2, 3, 4, 5}), new int[]{120, 60, 40, 30, 24});
        Assert.assertEquals(Solutions.doWithDIvision(new int[]{3, 2, 1}), new int[]{2, 3, 6});
    }

    @Test
    public void testKindaSmart() {
        Assert.assertEquals(Solutions.doKindaSmart(new int[]{3, 2, 1}), new int[]{2, 3, 6});
        Assert.assertEquals(Solutions.doKindaSmart(new int[]{1, 2, 3, 4, 5}), new int[]{120, 60, 40, 30, 24});

    }
}
