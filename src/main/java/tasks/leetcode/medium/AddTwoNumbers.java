package tasks.leetcode.medium;

import lib.node.ListNode;

class AddTwoNumbers {
    ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> root = new ListNode<>(0);
        ListNode<Integer> current = root;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int a = (l1 != null) ? l1.getValue() : 0;
            int b = (l2 != null) ? l2.getValue() : 0;
            int sum = a + b + carry;
            carry = sum / 10;
            current.setNext(new ListNode<>(sum % 10));
            current = current.getNext();
            l1 = l1 != null ? l1.getNext() : null;
            l2 = l2 != null ? l2.getNext() : null;
        }
        if (carry > 0) {
            current.setNext(new ListNode<>(carry));
        }
        return root.getNext();
    }
}
