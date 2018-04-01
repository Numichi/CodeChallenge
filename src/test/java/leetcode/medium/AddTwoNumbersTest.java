package leetcode.medium;

import utils.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTwoNumbersTest
{
    @Test
    public void test()
    {
        AddTwoNumbers s = new AddTwoNumbers();
        ListNode<Integer> ln = new ListNode<>();
        
        Assert.assertTrue(ln.check(s.addTwoNumbers(ln.factory(1, 2, 3), ln.factory(1, 2, 3)),
                                   ln.factory(2, 4, 6)));
        
        Assert.assertTrue(ln.check(s.addTwoNumbers(ln.factory(0, 2, 0), ln.factory(1, 8, 3)),
                                   ln.factory(1, 0, 4)));
    }
}
