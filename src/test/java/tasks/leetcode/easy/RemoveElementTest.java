package tasks.leetcode.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RemoveElementTest {
    private RemoveElement removeElement;

    @BeforeClass
    public void setUpBeforeClass() {
        removeElement = new RemoveElement();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {
                new int[] {
                    3,
                    3
                },
                5,
                2
            },
            {
                new int[] {
                    3,
                    2,
                    2,
                    3
                },
                2,
                2
            },
            {
                new int[] {
                    3,
                    2,
                    2,
                    3
                },
                3,
                2
            },
            {
                new int[] {
                    5,
                    5,
                    5,
                    5
                },
                5,
                0
            },
            {
                new int[] {
                    5,
                    5,
                    5,
                    5
                },
                0,
                4
            },
            {
                new int[] {
                    2,
                    2,
                    2
                },
                0,
                3
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4,
                    5,
                    6,
                    7
                },
                3,
                6
            },
            };
    }

    @Test(dataProvider = "data-default")
    public void test(
        int[] p1,
        int p2,
        int excepted
    ) {
        Assert.assertEquals(removeElement.removeElement(p1, p2), excepted);
    }
}
