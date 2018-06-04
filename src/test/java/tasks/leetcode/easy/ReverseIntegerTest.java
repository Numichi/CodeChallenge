package tasks.leetcode.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseIntegerTest
{
    @Test
    public void test() {
        int[][] arr = {
            {1111, 1111},
            {1222, 2221},
            {-1222, -2221},
            {123456, 654321},
            {-123456, -654321},
            {1111111119, 0},
        };

        ReverseInteger s = new ReverseInteger();
        for(int[] item : arr) {
            Assert.assertEquals(
                s.reverse(item[0]),
                item[1]
            );
        }
    }
}
