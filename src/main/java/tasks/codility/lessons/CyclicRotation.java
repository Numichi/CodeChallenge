package tasks.codility.lessons;

class CyclicRotation {
    int[] solution(int[] A, int K) {
        if(A == null) {
            throw new NullPointerException();
        }

        if(A.length == 0) {
            return A;
        }

        K = K % A.length;
        if(K == 0) {
            return A;
        }

        for(int i = 0; i < K; i++) {
            int temp1;
            int temp2 = A[0];
            for(int j = 0; j < A.length; j++) {
                int k = (j + 1) % A.length;
                temp1 = A[k];
                A[k] = temp2;
                temp2 = temp1;
            }
        }

        return A;
    }
}
