package medium;

import medium.AddTwoNumbers.Solution;
import medium.AddTwoNumbers.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddTwoNumbersTest
{
    @Test
    public void test()
    {
        Solution s = new Solution();
        
        Assert.assertTrue(this.check(s.addTwoNumbers(this.setter(1, 2, 3), this.setter(1, 2, 3)),
                                     this.setter(2, 4, 6)));
        
        Assert.assertTrue(this.check(s.addTwoNumbers(this.setter(0, 2, 0), this.setter(1, 8, 3)),
                                     this.setter(1, 0, 4)));
    }
    
    private ListNode setter(int... arr)
    {
        ListNode var1 = new ListNode(0);
        ListNode var2 = var1;
        
        for(int item : arr) {
            var2 = var2.setNext(new ListNode(item)).getNext();
        }
        
        return var1.getNext();
    }
    
    private boolean check(ListNode var1, ListNode var2)
    {
        while(var1 != null && var2 != null && var1.getValue() == var2.getValue()) {
            if(this.xor(var1.getNext() == null, var2.getNext() == null)) {
                return false;
            }
            
            var1 = var1.getNext();
            var2 = var2.getNext();
            
            if(var1 == null && var2 == null) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean xor(boolean x, boolean y)
    {
        return (!x && y) || (x && !y);
    }
}
