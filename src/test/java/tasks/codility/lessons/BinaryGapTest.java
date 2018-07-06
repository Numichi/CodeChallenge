package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BinaryGapTest {
    private BinaryGap binaryGap;

    @BeforeClass
    public void setUpBeforeClass() {
        binaryGap = new BinaryGap();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                9,
                2
            },
            {
                529,
                4
            },
            {
                1041,
                5
            },
            {
                32,
                0
            },
            {
                328,
                2
            },
            };
    }

    @Test(dataProvider = "default")
    public void test(
        int input,
        int expected
    ) {
        Assert.assertEquals(binaryGap.solution(input), expected, "Input was: " + input);
    }
}
