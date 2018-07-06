package tasks.leetcode.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoSumTest {
    private TwoSum twoSum;

    @BeforeClass
    public void setUpBeforeClass() {
        twoSum = new TwoSum();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {
                new int[] {
                    5,
                    5,
                    5
                },
                10,
                new int[] {
                    0,
                    1
                }
            },
            {
                new int[] {},
                10,
                new int[] {
                    -1,
                    -1
                }
            },
            {
                new int[] {0},
                0,
                new int[] {
                    -1,
                    -1
                }
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4
                },
                1,
                new int[] {
                    -1,
                    -1
                }
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4
                },
                2,
                new int[] {
                    -1,
                    -1
                }
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4
                },
                3,
                new int[] {
                    0,
                    1
                }
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4
                },
                5,
                new int[] {
                    0,
                    3
                }
            },
            };
    }

    @Test(dataProvider = "data-default")
    public void test(
        int[] array,
        int target,
        int[] excepted
    ) {
        Assert.assertEquals(twoSum.twoSum(array, target), excepted);
    }
}
