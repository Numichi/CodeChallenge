package medium.AddTwoNumbers;


//import org.jetbrains.annotations.Contract;

public class Solution
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode startHelper = new ListNode(0);
        ListNode current = startHelper;

        int carry = 0;
        int a;
        int b;
        int sum;

        while(l1 != null || l2 != null) {
            a = (l1 != null) ? l1.val : 0;
            b = (l2 != null) ? l2.val : 0;

            sum = a + b + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            l1 = this.next(l1);
            l2 = this.next(l2);
        }

        if(carry > 0) {
            current.next = new ListNode(carry);
        }

        return startHelper.next;
    }

    //@Contract(value = "null -> null", pure = true)
    private ListNode next(ListNode node)
    {
        if(node != null) {
            return node.next;
        }

        return null;
    }
}
