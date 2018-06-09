package lib.node;

import java.util.ArrayList;
import java.util.List;

public abstract class NodeSupport {
    @SafeVarargs
    public static <T> ListNode<T> listFactory(T... params) {
        ListNode<T> root = new ListNode<>();
        ListNode<T> current = root;
        for (T item : params) {
            ListNode<T> temp = new ListNode<>();
            temp.setValue(item);
            current.setNext(temp);
            current = temp;
        }
        return root.getNext();
    }

    @SafeVarargs
    public static <T> DoubleListNode<T> doubleFactory(T... params) {
        DoubleListNode<T> root = new DoubleListNode<>();
        DoubleListNode<T> current = root;
        for (int i = 0; i < params.length; i++) {
            DoubleListNode<T> temp = new DoubleListNode<>();
            temp.setValue(params[i]);
            current.setRight(temp);
            if (0 < i) {
                temp.setLeft(current);
            }
            current = temp;
        }
        return root.getRight();
    }

    public static <T> List<T> toList(ListNode<T> node) {
        List<T> result = new ArrayList<>();
        while (node != null) {
            result.add(node.getValue());
            node = node.getNext();
        }
        return result;
    }

    public static <T> List<T> toList(DoubleListNode<T> node) {
        List<T> result = new ArrayList<>();
        while (node != null) {
            result.add(node.getValue());
            node = node.getRight();
        }
        return result;
    }
}