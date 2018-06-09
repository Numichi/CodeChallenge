package tasks.codility.challenges;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Not solution, because: O(n^(3*log(n)) or O(n^4)
 */
class Zinc2018v1 {
    int solution(int[] A) {
        if (A.length < 3) {
            return 0;
        }

        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i + 1; j < A.length - 1; j++) {
                for (int k = j + 1; k < A.length; k++) {
                    result.add(Objects.hash(A[i], A[j], A[k]));
                }
            }
        }

        return result.size();
    }
}
