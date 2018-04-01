package leetcode.easy;

//import org.jetbrains.annotations.Contract;

import utils.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists
{
    public ListNode<Integer> mergeTwoLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        List<Integer> list = new ArrayList<>();
        
        while(l1 != null || l2 != null) {
            if(l1 != null) {
                list.add(l1.val);
                l1 = l1.next;
            }
            if(l2 != null) {
                list.add(l2.val);
                l2 = l2.next;
            }
        }
    
        Collections.sort(list);
    
        ListNode<Integer> root = new ListNode<>();
        ListNode<Integer> point = root;
        
        for(int item : list) {
            point.next = new ListNode<>();
            point.next.val = item;
            point = point.next;
        }
        
        return root.next;
    }
}
