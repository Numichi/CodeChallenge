package medium.AddTwoNumbers;

public class ListNode
{
    int val;

    ListNode next;

    public ListNode(int x)
    {
        val = x;
    }
    
    public ListNode setNext(ListNode next)
    {
        this.next = next;
        
        return this;
    }
    
    public ListNode getNext()
    {
        return next;
    }
    
    public int getValue()
    {
        return val;
    }
}