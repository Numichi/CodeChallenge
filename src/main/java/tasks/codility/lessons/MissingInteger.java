package tasks.codility.lessons;

import java.util.*;

/**
 * Detected time complexity:
 * O(N) or O(N * log(N))
 */
class MissingInteger {
    int solution(int[] A) {
        Set<Integer> collect = new HashSet<>();
        for(int i = 1; i <= A.length; i++) {
            collect.add(i);
        }
        for(int i : A) {
            collect.remove(i);
        }
        if(!collect.isEmpty()) {
            return collect.iterator().next();
        }
        return A.length + 1;
    }
}
