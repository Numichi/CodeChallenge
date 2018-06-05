package tasks.hackerrank.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PlusMinusTest {
    private PlusMinus plusMinus;

    @BeforeClass
    public void setUpBeforeTest() {
        plusMinus = new PlusMinus();
    }

    @Test
    public void plusMinus() {
        double core = 6.0;
        double[] expected = new double[]{3/core, 2/core, 1/core};
        Assert.assertEquals(expected, plusMinus.plusMinus(new int[]{-4, 3, -9, 0, 4, 1}));

        core = 7.0;
        expected = new double[]{3/core, 4/core, 0/core};
        Assert.assertEquals(expected, plusMinus.plusMinus(new int[]{1, -2, -7, 9, 1, -8, -5}));
    }
}
