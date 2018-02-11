package medium;

import medium.LongestSubstringWithoutRepeatingCharacters.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestSubstringWithoutRepeatingCharactersTest
{
    @Test
    public void test()
    {
        Solution task = new Solution();
        Assert.assertEquals(task.lengthOfLongestSubstring("abcabcbb"),  3);
        Assert.assertEquals(task.lengthOfLongestSubstring("bbbbb"), 1);
        Assert.assertEquals(task.lengthOfLongestSubstring("pwwkew"), 3);
    }
}
