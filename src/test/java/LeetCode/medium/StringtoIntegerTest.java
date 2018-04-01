package LeetCode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringtoIntegerTest
{
    @Test
    public void test()
    {
        StringtoInteger s = new StringtoInteger();
        Assert.assertEquals(s.myAtoi("+-2"), 0);
        Assert.assertEquals(s.myAtoi("2147483648"), Integer.MAX_VALUE);
        Assert.assertEquals(s.myAtoi("-2147483649"), Integer.MIN_VALUE);
        Assert.assertEquals(s.myAtoi("  +4 123"), 4);
        Assert.assertEquals(s.myAtoi("   - 321"), 0);
        Assert.assertEquals(s.myAtoi("    010"), 10);
        Assert.assertEquals(s.myAtoi("-a2147483"), 0);
        Assert.assertEquals(s.myAtoi(" b11228552307"), 0);
        Assert.assertEquals(s.myAtoi("     b11228552307"), 0);
        Assert.assertEquals(s.myAtoi("b11228552307"), 0);
        Assert.assertEquals(s.myAtoi("9223372036854775809"), Integer.MAX_VALUE);
    }
}
