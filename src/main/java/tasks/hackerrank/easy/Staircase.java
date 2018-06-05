package tasks.hackerrank.easy;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Staircase {
    String[] staircase(int n) {
        String[] result = new String[n];

        for(int i = 0; i < n; i++) {
            result[i] = IntStream.range(0, n - 1 - i).mapToObj(x -> " ").collect(Collectors.joining(""));
            result[i] += IntStream.range(0, i + 1).mapToObj(x -> "#").collect(Collectors.joining(""));
        }

        return result;
    }
}
