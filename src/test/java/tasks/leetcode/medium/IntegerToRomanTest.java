package tasks.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerToRomanTest
{
    @Test
    public void test()
    {
        IntegerToRoman s = new IntegerToRoman();
    
        Assert.assertEquals(s.intToRoman(11), "XI");
        Assert.assertEquals(s.intToRoman(10), "X");
    }
}
