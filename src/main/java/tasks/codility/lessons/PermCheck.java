package tasks.codility.lessons;

import java.util.Arrays;

class PermCheck {
    int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return 0;
            }
        }
        return 1;
    }
}
