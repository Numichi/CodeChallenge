package tasks.leetcode.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PalindromeNumberTest
{
    private PalindromeNumber palindromeNumber;

    @BeforeClass
    public void setUpBeforeClass() {
        palindromeNumber = new PalindromeNumber();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {1111, true},
            {12334, false},
            {543212345, true},
            {11213, false},
            {1, true},
        };
    }

    @Test(dataProvider = "data-default")
    public void test(int index, boolean excepted) {
        Assert.assertEquals(palindromeNumber.isPalindrome(index), excepted);
    }
}
