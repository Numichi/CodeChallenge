package interviews.epam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class CountSortedNumbers
{
    List<Integer> task(int... input)
    {
        Map<Integer, Integer> tm = new TreeMap<>();
        for (int i : input) {
            tm.merge(i, 1, (a, b) -> a + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : tm.entrySet()) {
            list.add(e.getValue());
        }

        return list;
    }
}
