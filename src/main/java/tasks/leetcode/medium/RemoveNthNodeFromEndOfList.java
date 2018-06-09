package tasks.leetcode.medium;

import lib.node.ListNode;

class RemoveNthNodeFromEndOfList {
    ListNode<Integer> removeNthFromEnd(ListNode<Integer> head, int n) {
        ListNode<Integer> result = new ListNode<>(0);
        ListNode<Integer> current = result;
        while (head != null) {
            if (!found(head, n)) {
                current.setNext(new ListNode<>(head.getValue()));
                current = current.getNext();
            }
            head = head.getNext();
        }
        return result.getNext();
    }

    private boolean found(ListNode<Integer> input, int n) {
        ListNode<Integer> current = input;
        try {
            for (int i = 0; i < n - 1; i++) {
                current = current.getNext();
            }
            if (current.getNext() == null) {
                return true;
            }
        } catch (NullPointerException e) {
            // nothing
        }
        return false;
    }
}
