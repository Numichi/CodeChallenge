package tasks.leetcode.easy;

import lib.node.ListNode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import lib.node.NodeSupport;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedListsTest {
    private MergeTwoSortedLists mergeTwoSortedLists;
    
    @BeforeMethod
    public void setUpBeforeMethod() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }
    
    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {
                NodeSupport.listFactory(1, 2, 4),
                NodeSupport.listFactory(1, 3, 4),
                Arrays.asList(1, 1, 2, 3, 4, 4)
            },
            {
                NodeSupport.listFactory(1, 1, 2, 6),
                NodeSupport.listFactory(1, 1, 4),
                Arrays.asList(1, 1, 1, 1, 2, 4, 6)
            },
            {
                NodeSupport.listFactory(5),
                NodeSupport.listFactory(1, 2, 4),
                Arrays.asList(1, 2, 4, 5)
            },
            };
    }
    
    @Test(dataProvider = "data-default")
    public void test(
        ListNode<Integer> p1,
        ListNode<Integer> p2,
        List<Integer> excepted
    ) {
        Assert.assertEquals(NodeSupport.toList(mergeTwoSortedLists.mergeTwoLists(p1, p2)), excepted);
    }
}
