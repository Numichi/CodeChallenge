package tasks.leetcode.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RomanToIntegerTest {
    private RomanToInteger romanToInteger;

    @BeforeClass
    public void setUpBeforeClass() {
        romanToInteger = new RomanToInteger();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {
                "I",
                1
            },
            {
                "IV",
                4
            },
            {
                "VI",
                6
            },
            {
                "XX",
                20
            },
            {
                "DCCCXCVIII",
                898
            },
            {
                "MMXVIII",
                2018
            },
            {
                "MMCMLXXI",
                2971
            },
            };
    }

    @Test(dataProvider = "data-default")
    public void test(
        String roman,
        int excepted
    ) {
        Assert.assertEquals(romanToInteger.romanToInt(roman), excepted);
    }
}
