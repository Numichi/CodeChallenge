package tasks.hackerrank.medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ClimbingTheLeaderboard
{
    /**
     * @param s global scores
     * @param a alice's scores
     */
    int[] climbingLeaderboard(int[] s, int[] a)
    {
        int[] ranks = new int[a.length];
        List<Integer> list = IntStream.of(s).boxed().distinct().collect(Collectors.toList());

        int listLength = list.size() - 1;
        int listIndex = 0;

        for(int i = 0; i < a.length; i++) {
            if(listLength == 0) {
                ranks[i] = 1;
            }

            while (listIndex < listLength && list.get(listIndex) > a[i]) {
                listIndex++;
            }

            while (listIndex > 0 && list.get(listIndex) < a[i]) {
                listIndex--;
            }

            if(list.get(listIndex) > a[i]) {
                ranks[i] = listIndex + 2;
            } else {
                ranks[i] = listIndex + 1;
            }
        }

        return ranks;
    }
}
