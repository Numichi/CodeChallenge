package tasks.codility.lessons;

/**
 * Detected time complexity:
 * O(N)
 */
public class PassingCars {
    public int solution(int[] A) {
        int result = 0;
        int inc = 0;
        final double limit = Math.pow(10, 9);

        for(int i : A) {
            if(i == 0) {
                inc++;
            } else {
                result += inc;
                if(limit < result || result < 0) {
                    return -1;
                }
            }
        }

        return result;
    }
}
