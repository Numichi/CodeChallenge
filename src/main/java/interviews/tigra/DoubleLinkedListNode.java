package interviews.tigra;

public class DoubleLinkedListNode extends AbstractListNode implements IListNode
{
    private DoubleLinkedListNode next;
    private DoubleLinkedListNode pre;

    public DoubleLinkedListNode(String s, DoubleLinkedListNode pre)
    {
        if(pre != null) {
            pre.setNext(this);
        }

        this.pre = pre;
        value = s;
    }

    public DoubleLinkedListNode getNext()
    {
        return next;
    }

    public void setNext(DoubleLinkedListNode next)
    {
        this.next = next;
    }

    public DoubleLinkedListNode getPre()
    {
        return pre;
    }

    public void setPre(DoubleLinkedListNode pre)
    {
        this.pre = pre;
    }
}
