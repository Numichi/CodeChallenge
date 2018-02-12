package medium.AddTwoNumbers;

//import org.jetbrains.annotations.Contract;

import services.ListNode;

public class Solution
{
    public ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2)
    {
        ListNode<Integer> startHelper = new ListNode<>(0);
        ListNode<Integer> current = startHelper;

        int carry = 0;
        int a;
        int b;
        int sum;

        while(l1 != null || l2 != null) {
            a = (l1 != null) ? l1.val : 0;
            b = (l2 != null) ? l2.val : 0;

            sum = a + b + carry;
            carry = sum / 10;
            current.next = new ListNode<>(sum % 10);
            current = current.next;

            l1 = this.next(l1);
            l2 = this.next(l2);
        }

        if(carry > 0) {
            current.next = new ListNode<>(carry);
        }

        return startHelper.next;
    }

    //@Contract(value = "null -> null", pure = true)
    private ListNode<Integer> next(ListNode<Integer> node)
    {
        if(node != null) {
            return node.next;
        }

        return null;
    }
}
