package tasks.hackerrank.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleArraySumTest {
    private SimpleArraySum simpleArraySum;

    @BeforeClass
    public void setUpBeforeClass() {
        simpleArraySum = new SimpleArraySum();
    }

    @Test
    public void simpleArraySumTest() {
        Assert.assertEquals(0, simpleArraySum.simpleArraySum(null));
        Assert.assertEquals(0, simpleArraySum.simpleArraySum(new int[]{}));
        Assert.assertEquals(31, simpleArraySum.simpleArraySum(new int[]{1, 2, 3, 4, 10, 11}));
        Assert.assertEquals(43, simpleArraySum.simpleArraySum(new int[]{1, 2, 3, 4, 10, 11, 12}));
    }
}
