package tasks.interviews.tigra;

public class DoubleLinkedList implements IList {
    private DoubleLinkedListNode head = null;
    private DoubleLinkedListNode tail = null;
    private int count = 0;

    @Override
    public void add(String s) {
        if (tail == null) {
            tail = new DoubleLinkedListNode(s, null);
            head = tail;
        } else {
            tail = new DoubleLinkedListNode(s, tail);
        }

        count++;
    }

    @Override
    public IListNode find(String i) {
        IListNode ret = null;
        DoubleLinkedListNode h = head;

        while (h != null && !h.value().equals(i)) {
            h = h.getNext();
        }

        if (h != null) {
            ret = h;
        }

        return ret;
    }

    @Override
    public void delete(IListNode node) {
        if (node == null || head == null) {
            return;
        }

        if (head == node) {
            head = head.getNext();
            if (head != null) {
                head.setPre(null);
            } else {
                tail = null;
            }

            count--;
        } else if (tail == node) {
            tail = tail.getPre();
            tail.setNext(null);

            count--;
        } else {
            DoubleLinkedListNode h = head;

            while (h != tail && h != node) {
                h = h.getNext();
            }

            if (h != tail) {
                h.getPre().setNext(h.getNext());
                h.getNext().setPre(h.getPre());
                count--;
            }
        }
    }

    @Override
    public String[] all() {
        int i = 0;
        String[] arr = new String[count];

        DoubleLinkedListNode h = head;
        while (h != null) {
            arr[i++] = h.value();
            h = h.getNext();
        }

        return arr;
    }
}
