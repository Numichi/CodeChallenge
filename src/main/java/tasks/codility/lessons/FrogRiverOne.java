package tasks.codility.lessons;

import java.util.HashSet;
import java.util.Set;

/**
 * Detected time complexity:
 * O(N)
 */
class FrogRiverOne {
    int solution(
        int X,
        int[] A
    ) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= X; i++) {
            set.add(i);
        }
        
        for (int i = 0; i < A.length; i++) {
            set.remove(A[i]);
            if (set.isEmpty()) {
                return i;
            }
        }
        return -1;
    }
}
