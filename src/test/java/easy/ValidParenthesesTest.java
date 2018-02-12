package easy;

import easy.ValidParentheses.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidParenthesesTest
{
    @Test
    public void test()
    {
        Solution s = new Solution();
        
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
