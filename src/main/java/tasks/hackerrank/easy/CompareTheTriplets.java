package tasks.hackerrank.easy;

class CompareTheTriplets {
    int[] solve(int[] a, int[] b) {
        System.out.println(10);
        if(a == null || b == null) {
            throw new NullPointerException();
        }

        if(a.length != b.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int[] result = new int[2];

        for(int i = 0; i < a.length; i++) {
            if(a[i] > b[i]) {
                result[0]++;
            } else if(a[i] < b[i]) {
                result[1]++;
            }
        }

        return result;
    }
}
