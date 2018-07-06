package tasks.leetcode.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongestCommonPrefixTest {
    private LongestCommonPrefix longestCommonPrefix;

    @BeforeClass
    public void setUpBeforeClass() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @DataProvider(name = "data-default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                new String[] {"a"},
                "a"
            },
            {
                new String[] {
                    "aa",
                    "a"
                },
                "a"
            },
            {
                new String[] {
                    "aaa",
                    "aa",
                    "aaa"
                },
                "aa"
            },
            {
                new String[] {
                    "aaaa",
                    "aaaa",
                    "aaaa"
                },
                "aaaa"
            },
            {
                new String[] {
                    "b",
                    "a"
                },
                ""
            },
            {
                new String[] {
                    "aaba",
                    "aaab",
                    "aaaa"
                },
                "aa"
            },
            };
    }


    @Test(dataProvider = "data-default")
    public void test(
        String[] input,
        String expected
    ) {
        Assert.assertEquals(longestCommonPrefix.longestCommonPrefix(input), expected);
    }
}
