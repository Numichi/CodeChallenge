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
    
    public boolean checkNullable(ListNode<T> var1, ListNode<T> var2)
    {
        return checkNullable(var1, var2, true);
    }
    
    public boolean checkNullable(ListNode<T> var1, ListNode<T> var2, boolean lookValue)
    {
        return var1 == null && var2 == null || check(var1, var2, lookValue);
    }
    
    public boolean check(ListNode<T> var1, ListNode<T> var2)
    {
        return check(var1, var2, true);
    }
    
    public boolean check(ListNode<T> var1, ListNode<T> var2, boolean lookValue)
    {
        ListNode<T> temp1;
        ListNode<T> temp2;
        
        while(var1 != null && var2 != null && (!lookValue || var1.val == var2.val)) {
            temp1 = var1.next;
            temp2 = var2.next;
            
            // XOR
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