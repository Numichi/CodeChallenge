package LeetCode.medium;

import utils.ListNode;

public class RemoveNthNodeFromEndOfList
{
    public ListNode<Integer> removeNthFromEnd(ListNode<Integer> head, int n) {
        ListNode<Integer> result = new ListNode<>(0);
        ListNode<Integer> current = result;
        
        while(head != null) {
            if(!found(head, n)) {
                current.next = new ListNode<>(head.val);
                current = current.next;
            }
    
            head = head.next;
        }
        
        return result.next;
    }
    
    private boolean found(ListNode<Integer> input, int n)
    {
        ListNode<Integer> current = input;
        
        try {
            for(int i = 0; i < n - 1; i++) {
                current = current.next;
            }
            
            if(current.next == null) {
                return true;
            }
        } catch(NullPointerException e) {
        }
    
        return false;
    }
}
