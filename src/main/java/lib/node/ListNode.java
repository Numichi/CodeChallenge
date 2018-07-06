package lib.node;

public class ListNode<V> {
    private ListNode<V> next = null;
    private V value = null;
    
    public ListNode() {
        // nothing
    }
    
    public ListNode(V value) {
        this.value = value;
    }
    
    public ListNode<V> getNext() {
        return next;
    }
    
    public void setNext(ListNode<V> next) {
        this.next = next;
    }
    
    public V getValue() {
        return value;
    }
    
    public void setValue(V value) {
        this.value = value;
    }
}
