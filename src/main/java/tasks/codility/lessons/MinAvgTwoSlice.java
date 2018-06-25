package tasks.codility.lessons;

public class MinAvgTwoSlice {
    private int result;
    private double min;

    public int solution(int[] A) {
        if(A.length < 2) {
            return 0;
        }

        int Q = A.length - 1;
        int[] cache = new int[Q];
        min = Double.MAX_VALUE;
        result = A.length;

        int sum = A[Q];
        for(int i = Q - 1; 0 <= i; i--) {
            sum += A[i];
            cache[i] = sum;
            result(sum, i, Q);
        }

        for(int i = Q - 1; 0 < i; i--) {
            int sub = A[i + 1];
            for(int j = 0; j < i; j++) {
                cache[j] -= sub;
                result(sum, j, i);
            }
        }

        return result;
    }

    private void result(int sum, int P, int Q) {
        double temp = ((double) sum) / (Q - P + 1);
        if(temp < min) {
            min = temp;
            result = P;
        }
    }
}
