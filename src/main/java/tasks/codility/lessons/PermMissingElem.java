package tasks.codility.lessons;

import java.util.Arrays;

/**
 * Detected time complexity:
 * O(N) or O(N * log(N))
 */
class PermMissingElem {
    int solution(int[] A) {
        Arrays.sort(A);

        int i = 1;

        while (i <= A.length) {
            if(A[i - 1] != i) {
                break;
            }
            i++;
        }

        return i;
    }
}
