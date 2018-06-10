package tasks.codility.lessons;

/**
 * Detected time complexity:
 * O(N)
 */
class TapeEquilibrium {
    int solution(int[] A) {
        int rightPath = 0;
        int leftPath = 0;
        int minimal = Integer.MAX_VALUE;

        for (int a : A) {
            rightPath += a;
        }

        for(int P = 1; P < A.length; P++) {
            leftPath += A[P - 1];
            rightPath -= A[P - 1];
            int diff = Math.abs(leftPath - rightPath);
            minimal = diff < minimal ? diff : minimal;
        }

        return minimal;
    }
}
