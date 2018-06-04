package lib.node;

public class Node {
    private Node left;
    private Node right;
    private Node parent;
    
    public Node getLeft() {
        return left;
    }
    
    public void setLeft(Node left) {
        this.left = left;
    }
    
    public Node getRight() {
        return right;
    }
    
    public void setRight(Node right) {
        this.right = right;
    }
    
    public Node getParent() {
        return parent;
    }
    
    public void setParent(Node parent) {
        this.parent = parent;
    }
}
