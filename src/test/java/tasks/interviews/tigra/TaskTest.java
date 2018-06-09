package tasks.interviews.tigra;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TaskTest
{
    public void test(IList list)
    {
        Assert.assertSame(list.find("a"), null);
        Assert.assertSame(list.find("b"), null);
        Assert.assertSame(list.find("c"), null);
        Assert.assertSame(list.find("d"), null);
        Assert.assertSame(list.find("e"), null);

        Assert.assertEquals(list.all(), new String[]{});

        list.add("a");
        Assert.assertEquals(list.all(), new String[]{"a"});

        list.add("b");
        Assert.assertEquals(list.all(), new String[]{"a", "b"});

        list.add("c");
        Assert.assertEquals(list.all(), new String[]{"a", "b", "c"});

        list.add("d");
        Assert.assertEquals(list.all(), new String[]{"a", "b", "c", "d"});

        list.add("e");
        Assert.assertEquals(list.all(), new String[]{"a", "b", "c", "d", "e"});

        Assert.assertEquals(list.find("a").value(), "a");
        Assert.assertEquals(list.find("b").value(), "b");
        Assert.assertEquals(list.find("c").value(), "c");
        Assert.assertEquals(list.find("d").value(), "d");
        Assert.assertEquals(list.find("e").value(), "e");

        Assert.assertEquals(list.all(), new String[]{"a", "b", "c", "d", "e"});

        list.delete(list.find("b"));
        Assert.assertEquals(list.all(), new String[]{"a", "c", "d", "e"});

        list.delete(list.find("d"));
        Assert.assertEquals(list.all(), new String[]{"a", "c", "e"});

        list.delete(list.find("e"));
        Assert.assertEquals(list.all(), new String[]{"a", "c"});

        list.delete(list.find("a"));
        Assert.assertEquals(list.all(), new String[]{"c"});

        list.delete(list.find("c"));
        Assert.assertEquals(list.all(), new String[]{});
    }

    @Test
    public void noRefList() {
        test(new NoRefLinkedList());
    }

    @Test
    public void singleList() {
        test(new SingleLinkedList());
    }

    @Test
    public void doubleList() {
        test(new DoubleLinkedList());
    }
}
