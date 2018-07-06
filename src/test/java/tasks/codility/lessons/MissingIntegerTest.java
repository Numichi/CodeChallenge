package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MissingIntegerTest {
    private MissingInteger MissingInteger;

    @BeforeClass
    public void setUpBeforeClass() {
        MissingInteger = new MissingInteger();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                new int[] {
                    -1,
                    -3
                },
                1
            },
            {
                new int[] {
                    1,
                    2,
                    3
                },
                4
            },
            {
                new int[] {
                    1,
                    3,
                    6,
                    4,
                    1,
                    2
                },
                5
            },
            {
                new int[] {},
                1
            },
            {
                new int[] {1},
                2
            },
            {
                new int[] {2},
                1
            },
            };
    }

    @Test(dataProvider = "default")
    public void testDefault(
        int[] arr,
        int expected
    ) {
        Assert.assertEquals(MissingInteger.solution(arr), expected);
    }
}