package tasks.leetcode.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidParenthesesTest {
    private ValidParentheses validParentheses;

    @BeforeClass
    public void setUpBeforeClass() {
        validParentheses = new ValidParentheses();
    }

    @DataProvider(name = "valid")
    public Object[][] dataProviderValid() {
        return new Object[][] {
            { "()" },
            { "[]" },
            { "{}" },
            { "({})" },
            { "[({})]" },
            { "{[()]()}" },
        };
    }

    @DataProvider(name = "invalid")
    public Object[][] dataProviderInvalid() {
        return new Object[][] {
            {"{]"},
            {"[}"},
            {"[["},
            {"([)]"},
        };
    }

    @Test(dataProvider = "valid")
    public void testValid(String string) {
        Assert.assertTrue(validParentheses.isValid(string));
    }

    @Test(dataProvider = "invalid")
    public void testInvalid(String string) {
        Assert.assertFalse(validParentheses.isValid(string));
    }
}
