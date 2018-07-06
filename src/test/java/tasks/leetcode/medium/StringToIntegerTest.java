package tasks.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringToIntegerTest {
    private StringtoInteger stringtoInteger;

    @BeforeClass
    public void setUpBeforeClass() {
        stringtoInteger = new StringtoInteger();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {
                "+-2",
                0
            },
            {
                "2147483648",
                Integer.MAX_VALUE
            },
            {
                "-2147483649",
                Integer.MIN_VALUE
            },
            {
                "  +4 123",
                4
            },
            {
                "   - 321",
                0
            },
            {
                "    010",
                10
            },
            {
                "-a2147483",
                0
            },
            {
                " b11228552307",
                0
            },
            {
                "     b11228552307",
                0
            },
            {
                "b11228552307",
                0
            },
            {
                "9223372036854775809",
                Integer.MAX_VALUE
            },
            };
    }

    @Test(dataProvider = "data-default")
    public void test(
        String input,
        int expected
    ) {
        Assert.assertEquals(stringtoInteger.myAtoi(input), expected);
    }
}
