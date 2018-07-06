package tasks.codility.challenges;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Zinc2018Test {
    private Zinc2018v1 zinc2018v1;
    private Zinc2018v2 zinc2018v2;

    @DataProvider(name = "data")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                new int[] {
                    1,
                    2,
                    1,
                    1
                },
                3
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4
                },
                4
            },
            {
                new int[] {
                    2,
                    2,
                    2,
                    2
                },
                1
            },
            {
                new int[] {
                    2,
                    2,
                    1,
                    2,
                    2
                },
                4
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4,
                    5,
                    6,
                    7,
                    8
                },
                56
            },
            {
                new int[] {
                    1,
                    2
                },
                0
            },
            };
    }

    @BeforeClass
    public void setUpBeforeClass() {
        zinc2018v1 = new Zinc2018v1();
        zinc2018v2 = new Zinc2018v2();
    }

    @Test(dataProvider = "data")
    public void testSolution1(
        int[] input,
        int excepted
    ) {
        Assert.assertEquals(zinc2018v1.solution(input), excepted);
    }

    @Test(dataProvider = "data")
    public void testSolution2(
        int[] input,
        int excepted
    ) {
        // Assert.assertEquals(zinc2018v2.solution(input), excepted);
    }
}
