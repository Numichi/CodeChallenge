package tasks.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfAPhoneNumberTest {
    private LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber;

    @BeforeClass
    public void setUpBeforeClass() {
        letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {
                "2",
                Arrays.asList("a", "b", "c")
            },
            {
                "23",
                Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
            },
            {
                "234",
                Arrays.asList(
                    "adh", "adg", "adi", "aeh", "aeg", "aei", "afh", "afg", "afi",
                    "bdh", "bdg", "bdi", "beh", "beg", "bei", "bfh", "bfg", "bfi",
                    "cdh", "cdg", "cdi", "ceh", "ceg", "cei", "cfh", "cfg", "cfi"
                )
            },
        };
    }

    @Test(dataProvider = "data-default")
    public void test(String numbers, List<String> excepted) {
        Assert.assertEquals(letterCombinationsOfAPhoneNumber.letterCombinations(numbers), excepted);
    }
}
