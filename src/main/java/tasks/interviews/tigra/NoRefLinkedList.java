package tasks.interviews.tigra;

import java.util.ArrayList;
import java.util.List;

public class NoRefLinkedList implements IList {
    private List<IListNode> list = new ArrayList<>();

    @Override
    public void add(String s) {
        list.add(new NoRefLinkedListNode(s));
    }

    @Override
    public IListNode find(String s) {
        for (IListNode node : list) {
            if (node.value().equals(s)) {
                return node;
            }
        }

        return null;
    }

    @Override
    public void delete(IListNode node) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == node) {
                list.remove(i);
            }
        }
    }

    @Override
    public String[] all() {
        String[] arr = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).value();
        }

        return arr;
    }
}
