package tasks.interviews.epam;

import lib.node.TreeNode;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeepNumberTest {
    private DeepNumber deepNumber;
    
    @BeforeTest
    public void init() {
        deepNumber = new DeepNumber();
    }
    
    @DataProvider(name = "data-default")
    public Object[][] dataDefault() {
        return new Object[][] {
            {
                null,
                0
            },
            {
                new TreeNode(),
                1
            },
            {
                deepElement2(),
                2
            },
            {
                deepElement3(),
                3
            },
            {
                deepElement4(),
                4
            },
            {
                deepElement5(),
                5
            },
            {
                deepBinary3433(),
                4
            },
            {
                deepBinary3436(),
                6
            },
            };
    }
    
    @Test(dataProvider = "data-default")
    public void test(
        TreeNode<Void> node,
        int expected
    ) {
        Assert.assertEquals(deepNumber.getMaxDeep(node), expected);
    }
    
    private TreeNode deepElement2() {
        TreeNode<Void> root = new TreeNode<>();
        root.setRightChild(new TreeNode<>());
        return root;
    }
    
    
    private TreeNode<Void> deepElement3() {
        TreeNode<Void> root = new TreeNode<>();
        root.setRightChild(new TreeNode<>());
        root.getRightChild().setRightChild(new TreeNode<>());
        return root;
    }
    
    private TreeNode<Void> deepElement4() {
        TreeNode<Void> root = new TreeNode<>();
        root.setRightChild(new TreeNode<>());
        root.getRightChild().setRightChild(new TreeNode<>());
        root.getRightChild().getRightChild().setRightChild(new TreeNode<>());
        return root;
    }
    
    private TreeNode<Void> deepElement5() {
        TreeNode<Void> root = new TreeNode<>();
        root.setRightChild(new TreeNode<>());
        root.getRightChild().setRightChild(new TreeNode<>());
        root.getRightChild().getRightChild().setRightChild(new TreeNode<>());
        root.getRightChild().getRightChild().getRightChild().setRightChild(new TreeNode<>());
        return root;
    }
    
    //      *
    //     / \
    //    /   \
    //   *     *
    //  / \   / \
    // *   * *   *
    //      \
    //       *
    private TreeNode<Void> deepBinary3433() {
        TreeNode<Void> root = new TreeNode<>();
        
        root.setRightChild(new TreeNode<>());
        root.setLeftChild(new TreeNode<>());
        
        root.getRightChild().setRightChild(new TreeNode<>());
        root.getRightChild().setLeftChild(new TreeNode<>());
        root.getLeftChild().setRightChild(new TreeNode<>());
        root.getLeftChild().setLeftChild(new TreeNode<>());
        
        root.getLeftChild().getRightChild().setRightChild(new TreeNode<>());
        
        return root;
    }
    
    //      *
    //     / \
    //    /   \
    //   *     *
    //  / \   / \
    // *   * *   *
    //    /       \
    //   *         *
    //            /
    //           *
    //            \
    //             *
    private TreeNode<Void> deepBinary3436() {
        TreeNode<Void> root = new TreeNode<>();
        root.setRightChild(new TreeNode<>());
        root.setLeftChild(new TreeNode<>());
        
        root.getRightChild().setRightChild(new TreeNode<>());
        root.getRightChild().setLeftChild(new TreeNode<>());
        root.getLeftChild().setRightChild(new TreeNode<>());
        root.getLeftChild().setLeftChild(new TreeNode<>());
        
        root.getLeftChild().getRightChild().setLeftChild(new TreeNode<>());
        
        root.getRightChild().getRightChild().setRightChild(new TreeNode<>());
        root.getRightChild().getRightChild().getRightChild().setLeftChild(new TreeNode<>());
        root.getRightChild().getRightChild().getRightChild().getLeftChild().setRightChild(new TreeNode<>());
        
        return root;
    }
}
