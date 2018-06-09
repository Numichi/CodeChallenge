package tasks.hackerrank.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PlusMinusTest {
    private PlusMinus plusMinus;

    @BeforeClass
    public void setUpBeforeTest() {
        plusMinus = new PlusMinus();
    }

    @DataProvider(name = "data-default")
    public static Object[][] dataProviderDefault() {
        return new Object[][] {
            { new int[] { -4, 3, -9, 0, 4, 1 }, new double[] { 3. / 6., 2. / 6., 1 / 6. } },
            { new int[] { 1, -2, -7, 9, 1, -8, -5 }, new double[] { 3. / 7., 4. / 7., 0. / 7. } },
        };
    }

    @Test(dataProvider = "data-default")
    public void plusMinus(int[] input, double[] expected) {
        Assert.assertEquals(plusMinus.plusMinus(input), expected);
    }
}
