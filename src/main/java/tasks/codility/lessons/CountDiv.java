package tasks.codility.lessons;

/**
 * Detected time complexity:
 * O(1)
 */
class CountDiv {
    int solution(
        int A,
        int B,
        int K
    ) {
        int elements = B - A + 1;
        int mod = A % K;
        if (0 < mod) {
            elements -= K - mod;
        }
        return (int) Math.ceil(elements / (double) K);
    }
}
