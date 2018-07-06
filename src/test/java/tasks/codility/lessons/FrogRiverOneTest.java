package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FrogRiverOneTest {
    private FrogRiverOne FrogRiverOne;

    @BeforeClass
    public void setUpBeforeClass() {
        FrogRiverOne = new FrogRiverOne();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                5,
                new int[] {
                    1,
                    3,
                    1,
                    4,
                    2,
                    3,
                    5,
                    4
                },
                6
            },
            {
                5,
                new int[] {
                    1,
                    3,
                    1,
                    4,
                    2,
                    3,
                    4
                },
                -1
            },
            };
    }

    @Test(dataProvider = "default")
    public void testDefault(
        int pos,
        int[] arr,
        int expected
    ) {
        Assert.assertEquals(FrogRiverOne.solution(pos, arr), expected);
    }
}