package tasks.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
    private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @BeforeClass
    public void setUpBeforeClass() {
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {
                "abcabcbb",
                3
            },
            {
                "bbbbb",
                1
            },
            {
                "pwwkew",
                3
            },
            };
    }

    @Test(dataProvider = "data-default")
    public void test(
        String input,
        int excepted
    ) {
        Assert.assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input), excepted);
    }
}
