package easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidParenthesesTest
{
    @Test
    public void test()
    {
        ValidParentheses s = new ValidParentheses();
        
        Assert.assertTrue(s.isValid("()"));
        Assert.assertTrue(s.isValid("[]"));
        Assert.assertTrue(s.isValid("{}"));
        Assert.assertTrue(s.isValid("({})"));
        Assert.assertTrue(s.isValid("[({})]"));
        Assert.assertTrue(s.isValid("{[()]()}"));
        
        Assert.assertFalse(s.isValid("{]"));
        Assert.assertFalse(s.isValid("[}"));
        Assert.assertFalse(s.isValid("[["));
        Assert.assertFalse(s.isValid("([)]"));
    }
}
