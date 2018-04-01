package LeetCode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfListTest
{
    @Test
    public void test()
    {
        RemoveNthNodeFromEndOfList s = new RemoveNthNodeFromEndOfList();
        ListNode<Integer> node = new ListNode<>();
        List<Data> tests = new ArrayList<>();
        tests.add(new Data(1, node.factory(1, 2, 3, 4, 5), 2, node.factory(1, 2, 3, 5)));
        tests.add(new Data(2, node.factory(1, 2, 3, 4, 5), 3, node.factory(1, 2, 4, 5)));
        tests.add(new Data(3, node.factory(1, 2, 3, 4, 5), 4, node.factory(1, 3, 4, 5)));
        tests.add(new Data(4, node.factory(1, 2, 3, 4, 5), 5, node.factory(2, 3, 4, 5)));
        tests.add(new Data(5, node.factory(1), 1, null));
        
        for(Data d : tests) {
            Assert.assertTrue(node.checkNullable(s.removeNthFromEnd(d.input, d.param), d.except));
        }
    }
    
    private class Data
    {
        public ListNode<Integer> input;
        public int               param;
        public int               version;
        public ListNode<Integer> except;
    
        public Data(int v, ListNode<Integer> i, int p, ListNode<Integer> e)
        {
            version = v;
            input = i;
            param = p;
            except = e;
        }
    }
}
