package tasks.codility.lessons;

import java.util.HashSet;
import java.util.Set;

/**
 * Detected time complexity:
 * O(N)
 */
class FrogRiverOne {
    int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= X; i++) {
            set.add(i);
        }

        int i = 0;
        while(i < A.length) {
            set.remove(A[i]);
            if(set.isEmpty()) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
