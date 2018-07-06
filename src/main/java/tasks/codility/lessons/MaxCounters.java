package tasks.codility.lessons;

/**
 * Detected time complexity:
 * O(N + M)
 */
class MaxCounters {
    int[] solution(
        int N,
        int[] A
    ) {
        final int result[] = new int[N];
        int max = 0;
        int save = 0;
        
        for (int a : A) {
            if (a == N + 1) {
                save = max;
            } else {
                int p = a - 1;
                if (result[p] < save) {
                    result[p] = save + 1;
                } else {
                    result[p]++;
                }
                if (result[p] > max) {
                    max = result[p];
                }
            }
        }
        
        for (int i = 0; i < result.length; i++) {
            if (result[i] < save) {
                result[i] = save;
            }
        }
        
        return result;
    }
}
