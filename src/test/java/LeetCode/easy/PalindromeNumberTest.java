package LeetCode.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeNumberTest
{
    @Test
    public void test() {
        Object[][] arr = {
            {1111, true},
            {12334, false},
            {543212345, true},
            {11213, false},
            {1, true},
        };

        PalindromeNumber s = new PalindromeNumber();
        for(Object[] item : arr) {
            Assert.assertEquals(
                s.isPalindrome((int) item[0]),
                (boolean) item[1],
                "[" + Integer.toString((int) item[0]) + "]"
            );
        }
    }
}
