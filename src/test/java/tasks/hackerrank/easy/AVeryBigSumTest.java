package tasks.hackerrank.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AVeryBigSumTest {
    private AVeryBigSum aVeryBigSumTest;

    @BeforeClass
    public void setUpBeforeClass() {
        aVeryBigSumTest = new AVeryBigSum();
    }

    @Test
    public void simpleArraySumTest() {
        Assert.assertEquals(0, aVeryBigSumTest.aVeryBigSum(null));
        Assert.assertEquals(0, aVeryBigSumTest.aVeryBigSum(new long[]{}));
        Assert.assertEquals(
            9042935877L,
            aVeryBigSumTest.aVeryBigSum(new long[]{
                1001458909L,
                1004570889L,
                1007019111L,
                1003302837L,
                1002514638L,
                1006431461L,
                1002575010L,
                1007514041L,
                1007548981L
            })
        );
        Assert.assertEquals(
            5000000015L,
            aVeryBigSumTest.aVeryBigSum(new long[]{
                1000000001L,
                1000000002L,
                1000000003L,
                1000000004L,
                1000000005
            })
        );
    }
}
