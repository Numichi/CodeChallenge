package tasks.codility.lessons;

/**
 * Detected time complexity:
 * O(1)
 */
class FrogJmp {
    int solution(int X, int Y, int D) {
        if(X == Y) {
            return 0;
        }

        return (int) Math.ceil((Y - X) / (double) D);
    }
}
