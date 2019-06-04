package org.thenin.dailycoding.google.day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

 //   @Test
    public void doTest() {
        Solution.Node node = new Solution.Node("root",
                new Solution.Node("left",
                        new Solution.Node("left.left",
                                null, null),
                        null),
                new Solution.Node("right", null, null));

        Assert.assertEquals(Solution.deserialize(Solution.serialize(node)).left.left.val, "left.left");
    }


    @Test
    public void doSerialize(){
        Solution.Node node = new Solution.Node("root",
                new Solution.Node("left",
                        new Solution.Node("left.left",
                                null, null),
                        null),
                new Solution.Node("right", null, null));
        System.out.println("Start serialize");
        System.out.println(Solution.serialize(node));
    }
}
