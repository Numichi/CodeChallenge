package tasks.hackerrank.easy;

class AVeryBigSum {
    long aVeryBigSum(long[] ar) {
        long result = 0;

        if(ar != null) {
            for (long x : ar) {
                result += x;
            }
        }

        return result;
    }
}
