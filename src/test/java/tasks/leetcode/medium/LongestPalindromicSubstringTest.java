package tasks.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongestPalindromicSubstringTest {
    private LongestPalindromicSubstring longestPalindromicSubstring;

    @BeforeClass
    public void setUpBeforeClass() {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {
                "bab",
                "bab"
            },
            {
                "abbc",
                "bb"
            },
            {
                "aa",
                "aa"
            },
            {
                "aaa",
                "aaa"
            },
            {
                "a",
                "a"
            },
            {
                "abcda",
                "a"
            },
            {
                "aaabaaaa",
                "aaabaaa"
            },
            {
                "aaaaa",
                "aaaaa"
            },
            {
                "aaaaaa",
                "aaaaaa"
            },
            {
                "",
                ""
            },
            {
                "tattarrattat",
                "tattarrattat"
            },
            };
    }

    @Test(dataProvider = "data-default")
    public void test(
        String input,
        String expected
    ) {
        Assert.assertEquals(longestPalindromicSubstring.longestPalindrome(input), expected);
    }
}
