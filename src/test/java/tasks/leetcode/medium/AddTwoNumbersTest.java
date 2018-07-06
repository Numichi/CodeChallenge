package tasks.leetcode.medium;

import lib.node.ListNode;
import lib.node.NodeSupport;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class AddTwoNumbersTest {
    private AddTwoNumbers addTwoNumbers;

    @BeforeClass
    public void setUpBeforeClass() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {
                NodeSupport.listFactory(1, 2, 3),
                NodeSupport.listFactory(1, 2, 3),
                Arrays.asList(2, 4, 6)
            },
            {
                NodeSupport.listFactory(0, 2),
                NodeSupport.listFactory(1, 8, 3),
                Arrays.asList(1, 0, 4)
            },
            };
    }

    @Test(dataProvider = "data-default")
    public void test(
        ListNode<Integer> p1,
        ListNode<Integer> p2,
        List<Integer> excepted
    ) {
        Assert.assertEquals(NodeSupport.toList(addTwoNumbers.addTwoNumbers(p1, p2)), excepted);
    }
}
