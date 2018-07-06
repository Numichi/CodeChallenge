package tasks.interviews.tigra;

public class SingleLinkedList implements IList {
    private SingleLinkedListNode single = null;
    private int count = 0;

    @Override
    public void add(String s) {
        if (single == null) {
            single = new SingleLinkedListNode(s);
        } else {
            SingleLinkedListNode head = single;

            while (head.getNext() != null) {
                head = head.getNext();
            }

            head.setNext(new SingleLinkedListNode(s));
        }

        count++;
    }

    @Override
    public IListNode find(String i) {
        IListNode ret = null;
        SingleLinkedListNode head = single;

        while (head != null && !head.value().equals(i)) {
            head = head.getNext();
        }

        if (head != null) {
            ret = head;
        }

        return ret;
    }

    @Override
    public void delete(IListNode node) {
        if (node == null || single == null) {
            return;
        }

        if (single == node) {
            single = single.getNext();
            count--;
        } else {
            SingleLinkedListNode head = single;

            while (head != null && head.getNext() != node) {
                head = head.getNext();
            }

            if (head != null && head.getNext() == node) {
                head.setNext(head.getNext().getNext());
                count--;
            }
        }
    }

    @Override
    public String[] all() {
        int i = 0;
        String[] arr = new String[count];

        SingleLinkedListNode head = single;
        while (head != null) {
            arr[i++] = head.value();
            head = head.getNext();
        }

        return arr;
    }
}
