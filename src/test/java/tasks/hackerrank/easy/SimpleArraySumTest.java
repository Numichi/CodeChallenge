package tasks.hackerrank.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleArraySumTest {
    private SimpleArraySum simpleArraySum;

    @BeforeClass
    public void setUpBeforeClass() {
        simpleArraySum = new SimpleArraySum();
    }

    @DataProvider(name = "data-default")
    public static Object[][] dataProviderDefault() {
        return new Object[][] {
            { null, 0 },
            { new int[] {}, 0 },
            { new int[] { 1, 2, 3, 4, 10, 11 }, 31 },
            { new int[] { 1, 2, 3, 4, 10, 11, 12 }, 43 },
        };
    }

    @Test(dataProvider = "data-default")
    public void simpleArraySumTest(int[] input, int expected) {
        Assert.assertEquals(simpleArraySum.simpleArraySum(input), expected);
    }
}
