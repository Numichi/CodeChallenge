package LeetCode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestSubstringWithoutRepeatingCharactersTest
{
    @Test
    public void test()
    {
        LongestSubstringWithoutRepeatingCharacters task = new LongestSubstringWithoutRepeatingCharacters();
        Assert.assertEquals(task.lengthOfLongestSubstring("abcabcbb"),  3);
        Assert.assertEquals(task.lengthOfLongestSubstring("bbbbb"), 1);
        Assert.assertEquals(task.lengthOfLongestSubstring("pwwkew"), 3);
    }
}
