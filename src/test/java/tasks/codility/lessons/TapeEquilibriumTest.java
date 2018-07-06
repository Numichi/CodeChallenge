package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TapeEquilibriumTest {
    private TapeEquilibrium TapeEquilibrium;

    @BeforeClass
    public void setUpBeforeClass() {
        TapeEquilibrium = new TapeEquilibrium();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                new int[] {
                    3,
                    1,
                    2,
                    4,
                    3
                },
                1
            },
            };
    }

    @Test(dataProvider = "default")
    public void testDefault(
        int[] arr,
        int expected
    ) {
        Assert.assertEquals(TapeEquilibrium.solution(arr), expected);
    }
}