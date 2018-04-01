package LeetCode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestPalindromicSubstringTest
{
    @Test
    public void test()
    {
        LongestPalindromicSubstring s = new LongestPalindromicSubstring();
        Assert.assertEquals(s.longestPalindrome("bab"), "bab");
        Assert.assertEquals(s.longestPalindrome("abbc"), "bb");
        Assert.assertEquals(s.longestPalindrome("aa"), "aa");
        Assert.assertEquals(s.longestPalindrome("aaa"), "aaa");
        Assert.assertEquals(s.longestPalindrome("a"), "a");
        Assert.assertEquals(s.longestPalindrome("abcda"), "a");
        Assert.assertEquals(s.longestPalindrome("aaabaaaa"), "aaabaaa");
        Assert.assertEquals(s.longestPalindrome("aaaaa"), "aaaaa");
        Assert.assertEquals(s.longestPalindrome("aaaaaa"), "aaaaaa");
        Assert.assertEquals(s.longestPalindrome(""), "");
        Assert.assertEquals(s.longestPalindrome("tattarrattat"), "tattarrattat");
    }
}
