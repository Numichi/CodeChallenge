package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinAvgTwoSliceTest {
    private MinAvgTwoSlice MinAvgTwoSlice;

    @BeforeClass
    public void setUpBeforeClass() {
        MinAvgTwoSlice = new MinAvgTwoSlice();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                new int[] {
                    4,
                    2,
                    2,
                    5,
                    1,
                    5,
                    8
                },
                1
            }
        };
    }

    @Test(dataProvider = "default")
    public void testDefault(
        int[] arr,
        int expected
    ) {
        Assert.assertEquals(MinAvgTwoSlice.solution(arr), expected);
    }
}