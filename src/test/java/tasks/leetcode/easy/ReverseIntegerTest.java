package tasks.leetcode.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReverseIntegerTest {
    private ReverseInteger reverseInteger;

    @BeforeClass
    public void setUpBeforeClass() {
        reverseInteger = new ReverseInteger();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            { 1111, 1111 },
            { 1222, 2221 },
            { -1222, -2221 },
            { 123456, 654321 },
            { -123456, -654321 },
            { 1111111119, 0 },
        };
    }

    @Test(dataProvider = "data-default")
    public void test(int p, int excepted) {
        Assert.assertEquals(reverseInteger.reverse(p), excepted);
    }
}
