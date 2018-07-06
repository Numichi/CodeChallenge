package tasks.codility;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CodilityTryTest {
    private CodilityTry codilityTry;

    @BeforeClass
    public void setUpBeforeClass() {
        codilityTry = new CodilityTry();
    }

    @DataProvider(name = "data")
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
            };
    }

    @Test(dataProvider = "data")
    public void test(
        int[] input,
        int excepted
    ) {
        Assert.assertEquals(codilityTry.solution(input), excepted);
    }
}
