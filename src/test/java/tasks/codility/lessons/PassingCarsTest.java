package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PassingCarsTest {
    private PassingCars PassingCars;

    @BeforeClass
    public void setUpBeforeClass() {
        PassingCars = new PassingCars();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                new int[] {
                    0,
                    1,
                    0,
                    1,
                    1
                },
                5
            },
            {
                new int[] {
                    1,
                    0,
                    1,
                    0,
                    1,
                    1,
                    0
                },
                5
            },
            {
                new int[] {
                    1,
                    0,
                    1,
                    0,
                    1,
                    1,
                    0,
                    1
                },
                8
            },
            };
    }

    @Test(dataProvider = "default")
    public void testDefault(
        int[] arr,
        int expected
    ) {
        Assert.assertEquals(PassingCars.solution(arr), expected);
    }
}
