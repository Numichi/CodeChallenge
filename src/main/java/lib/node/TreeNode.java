package lib.node;

public class TreeNode<V> {
    private TreeNode<V> parent = null;
    private TreeNode<V> leftChild = null;
    private TreeNode<V> rightChild = null;
    private V value;

    public TreeNode<V> getParent() {
        return parent;
    }

    public void setParent(TreeNode<V> parent) {
        this.parent = parent;
    }

    public TreeNode<V> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<V> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<V> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<V> rightChild) {
        this.rightChild = rightChild;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
