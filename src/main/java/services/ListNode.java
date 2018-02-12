package services;

public class ListNode<T>
{
    public T val;
    
    public ListNode<T> next;
    
    public ListNode(T x)
    {
        val = x;
    }
    
    public ListNode()
    {}
    
    public ListNode<T> factory(T... params)
    {
        ListNode<T> var1 = new ListNode<>();
        ListNode<T> var2 = var1;
        
        for(T item : params) {
            var2.next = new ListNode<>(item);
            var2 = var2.next;
        }
        
        return var1.next;
    }
    
    public boolean check(ListNode<T> var1, ListNode<T> var2)
    {
        ListNode<T> temp1;
        ListNode<T> temp2;
        
        while(var1 != null && var2 != null && var1.val == var2.val) {
            temp1 = var1.next;
            temp2 = var2.next;
            
            if((temp1 == null && temp2 != null) || (temp1 != null && temp2 == null)) {
                return false;
            }
            
            var1 = temp1;
            var2 = temp2;
            
            if(var1 == null) {
                return true;
            }
        }
        
        return false;
    }
}