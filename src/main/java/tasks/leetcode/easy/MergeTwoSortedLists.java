package tasks.leetcode.easy;

import lib.node.ListNode;

class MergeTwoSortedLists {
    private ListNode<Integer> head = new ListNode<>();
    private ListNode<Integer> list = head;
    private ListNode<Integer> l1;
    private ListNode<Integer> l2;

    ListNode<Integer> mergeTwoLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        this.l1 = l1;
        this.l2 = l2;

        while (this.l1 != null || this.l1 != null) {
            if (this.l1 != null && this.l2 != null) {
                notNulls();
            } else {
                anyNull();
            }
        }

        return head.getNext();
    }

    private void anyNull() {
        if(l1 == null) {
            addElement(l2.getValue());
            l2 = l2.getNext();
        } else {
            addElement(l1.getValue());
            l1 = l1.getNext();
        }
    }

    private void notNulls() {
        int v1 = l1.getValue();
        int v2 = l2.getValue();

        if (v1 == v2) {
            addElement(v1);
            addElement(v1);
            l2 = l2.getNext();
            l1 = l1.getNext();
        } else if (v1 < v2) {
            addElement(v1);
            l1 = l1.getNext();
        } else {
            addElement(v2);
            l2 = l2.getNext();
        }
    }

    private void addElement(int value) {
        list.setNext(new ListNode<>(value));
        list = list.getNext();
    }
}
