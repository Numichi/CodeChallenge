package easy;

import easy.MergeTwoSortedLists.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.ListNode;

public class MergeTwoSortedListsTest
{
    @Test
    public void test()
    {
        Solution s = new Solution();
        ListNode<Integer> LinkedList1 = new ListNode<>();
        ListNode<Integer> LinkedList2;
        ListNode<Integer> LinkedListExpect;
        
        LinkedList1 = LinkedList1.factory(1, 2, 4);
        LinkedList2 = LinkedList1.factory(1, 3, 4);
        LinkedListExpect = LinkedList1.factory(1, 1, 2, 3, 4, 4);
        Assert.assertTrue(LinkedList1.check(s.mergeTwoLists(LinkedList1, LinkedList2), LinkedListExpect));
    
        LinkedList1 = LinkedList1.factory(1, 1, 2, 6);
        LinkedList2 = LinkedList1.factory(1, 1, 4);
        LinkedListExpect = LinkedList1.factory(1, 1, 1, 1, 2, 4, 6);
        Assert.assertTrue(LinkedList1.check(s.mergeTwoLists(LinkedList1, LinkedList2), LinkedListExpect));
    
        LinkedList1 = LinkedList1.factory(5);
        LinkedList2 = LinkedList1.factory(1, 2, 4);
        LinkedListExpect = LinkedList1.factory(1, 2, 4, 5);
        Assert.assertTrue(LinkedList1.check(s.mergeTwoLists(LinkedList1, LinkedList2), LinkedListExpect));
    }
}
