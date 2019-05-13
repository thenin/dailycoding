package org.dailycoding.google.sedeserializes;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.dailycoding.google.sedeserializes.SeDeserialiseSolution.*;

public class SeDeserialiseTest {

    @Test
    public void SerialiseTest(){
        SeDeserialiseSolution testItem = new SeDeserialiseSolution(
                "root",
                new SeDeserialiseSolution("left",
                        new SeDeserialiseSolution("" +
                                "left.left", null, null), null),null);

        Assert.assertEquals(testItem, doDeserialise(doSrialise(testItem)));

    }
}
