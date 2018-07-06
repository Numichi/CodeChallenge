package tasks.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContainerWithMostWaterTest {
    private ContainerWithMostWater containerWithMostWater;

    @BeforeClass
    public void setUpBeforeClass() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {
                new int[] {
                    2,
                    2,
                    100,
                    100,
                    2
                },
                100
            },
            {
                new int[] {
                    2,
                    100,
                    2,
                    100,
                    2
                },
                200
            },
            {
                new int[] {
                    100,
                    2,
                    2,
                    100,
                    2
                },
                300
            },
            {
                new int[] {
                    2,
                    100,
                    2,
                    100,
                    100
                },
                300
            },
            {
                new int[] {
                    2,
                    100,
                    100,
                    100,
                    100
                },
                300
            },
            };
    }

    @Test(dataProvider = "data-default")
    public void test(
        int[] container,
        int excepted
    ) {
        Assert.assertEquals(containerWithMostWater.maxArea(container), excepted);
    }
}
