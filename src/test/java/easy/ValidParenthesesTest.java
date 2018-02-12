package easy;

import easy.ValidParentheses.Solution;
import jdk.Exported;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

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
