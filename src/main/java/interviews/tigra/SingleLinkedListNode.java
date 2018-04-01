package interviews.tigra;

public class SingleLinkedListNode extends AbstractListNode implements IListNode
{
    private SingleLinkedListNode next;

    public SingleLinkedListNode(String s)
    {
        value = s;
    }

    public SingleLinkedListNode getNext()
    {
        return next;
    }

    public void setNext(SingleLinkedListNode next)
    {
        this.next = next;
    }
}
