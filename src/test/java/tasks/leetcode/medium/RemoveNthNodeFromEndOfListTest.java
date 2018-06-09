package tasks.leetcode.medium;

import lib.node.ListNode;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import lib.node.NodeSupport;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfListTest {
    private RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList;

    @BeforeClass
    public void setUpBeforeClass() {
        removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            { NodeSupport.listFactory(1, 2, 3, 4, 5), 2, NodeSupport.listFactory(1, 2, 3, 5) },
            { NodeSupport.listFactory(1, 2, 3, 4, 5), 3, NodeSupport.listFactory(1, 2, 4, 5) },
            { NodeSupport.listFactory(1, 2, 3, 4, 5), 4, NodeSupport.listFactory(1, 3, 4, 5) },
            { NodeSupport.listFactory(1, 2, 3, 4, 5), 5, NodeSupport.listFactory(2, 3, 4, 5) },
            { NodeSupport.listFactory(1), 1, null },
        };
    }

    @Test(dataProvider = "data-default")
    public void test(ListNode<Integer> input, int param, ListNode<Integer> exceptedListNode) {
        List<Integer> excepted = NodeSupport.toList(exceptedListNode);
        List<Integer> actual = NodeSupport.toList(removeNthNodeFromEndOfList.removeNthFromEnd(input, param));
        Assert.assertEquals(excepted, actual);
    }
}
