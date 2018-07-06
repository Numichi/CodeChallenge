package tasks.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IntegerToRomanTest {
    private IntegerToRoman integerToRoman;

    @BeforeClass
    public void setUpBeforeClass() {
        integerToRoman = new IntegerToRoman();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {
                11,
                "XI"
            },
            {
                10,
                "X"
            },
            };
    }

    @Test(dataProvider = "data-default")
    public void test(
        int value,
        String excepted
    ) {
        Assert.assertEquals(integerToRoman.intToRoman(value), excepted);
    }
}
