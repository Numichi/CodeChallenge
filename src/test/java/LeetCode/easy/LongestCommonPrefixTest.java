package LeetCode.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestCommonPrefixTest
{
    @Test
    public void test() {
        String[][] q = {
            {"a"},
            {"aa", "a"},
            {"aaa", "aa", "aaa"},
            {"aaaa", "aaaa", "aaaa"},
            {"b", "a"},
            {"aaba", "aaab", "aaaa"},
        };

        String[] a = {
            "a",
            "a",
            "aa",
            "aaaa",
            "",
            "aa",
        };

        LongestCommonPrefix s = new LongestCommonPrefix();
        for(int i = 0; i < a.length; i++) {
            Assert.assertEquals(s.longestCommonPrefix(q[i]), a[i]);
        }
    }
}
