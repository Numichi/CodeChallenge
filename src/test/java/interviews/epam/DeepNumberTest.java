package interviews.epam;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Node;

public class DeepNumberTest {
    DeepNumber deepNumber;
    
    @BeforeTest
    public void init() {
        deepNumber = new DeepNumber();
    }
    
    @Test
    public void test1() {
        Assert.assertEquals(deepNumber.getMaxDeep(null), 0);
        Assert.assertEquals(deepNumber.getMaxDeep(new Node()), 1);
    }
    
    @Test
    public void test2() {
        Node root = new Node();
        root.setRight(new Node());
        Assert.assertEquals(deepNumber.getMaxDeep(root), 2);
    
        root.setLeft(new Node());
        Assert.assertEquals(deepNumber.getMaxDeep(root), 2);
        
        root.getRight().setRight(new Node());
        Assert.assertEquals(deepNumber.getMaxDeep(root), 3);
    
        root.getRight().getRight().setRight(new Node());
        Assert.assertEquals(deepNumber.getMaxDeep(root), 4);
    }
    
    @Test
    public void test3() {
        Node root = new Node();
        
        root.setRight(new Node());
        root.getRight().setRight(new Node());
        
        root.setLeft(new Node());
        root.getLeft().setLeft(new Node());
        root.getLeft().setRight(new Node());
        
        root.getLeft().getRight().setLeft(new Node());
        root.getLeft().getRight().setRight(new Node());
        
        root.getLeft().getRight().getRight().setLeft(new Node());
        
        Assert.assertEquals(deepNumber.getMaxDeep(root), 5);
        Assert.assertEquals(deepNumber.getMaxDeep(root.getLeft()), 4);
        Assert.assertEquals(deepNumber.getMaxDeep(root.getLeft().getLeft()), 1);
        Assert.assertEquals(deepNumber.getMaxDeep(root.getLeft().getLeft().getRight()), 0);
    }
}
