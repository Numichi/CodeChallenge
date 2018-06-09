package lib.node;

public class DoubleListNode<V> {
    private DoubleListNode<V> left;
    private DoubleListNode<V> right;
    private V value;

    public DoubleListNode<V> getLeft() {
        return left;
    }

    public void setLeft(DoubleListNode<V> left) {
        this.left = left;
    }

    public DoubleListNode<V> getRight() {
        return right;
    }

    public void setRight(DoubleListNode<V> right) {
        this.right = right;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
