package tasks.hackerrank.problemSolving.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AVeryBigSumTest {
    private AVeryBigSum aVeryBigSumTest;

    @BeforeClass
    public void setUpBeforeClass() {
        aVeryBigSumTest = new AVeryBigSum();
    }

    @DataProvider(name = "data")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                null,
                0
            },
            {
                new long[] {},
                0
            },
            {
                new long[] {
                    1000000001L,
                    1000000002L,
                    1000000003L,
                    1000000004L,
                    1000000005
                },
                5000000015L,
                },
            {
                new long[] {
                    1001458909L,
                    1004570889L,
                    1007019111L,
                    1003302837L,
                    1002514638L,
                    1006431461L,
                    1002575010L,
                    1007514041L,
                    1007548981L
                },
                9042935877L
            }
        };
    }

    @Test(dataProvider = "data")
    public void simpleArraySumTest(
        long[] input,
        long excepted
    ) {
        Assert.assertEquals(aVeryBigSumTest.aVeryBigSum(input), excepted);
    }
}
