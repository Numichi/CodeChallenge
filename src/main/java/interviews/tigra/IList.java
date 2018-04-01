package interviews.tigra;

/**
 * Implement methods
 */
public interface IList
{
    public void add(String s);
    public IListNode find(String i);
    public void delete(IListNode node);
    public String[] all();
}
