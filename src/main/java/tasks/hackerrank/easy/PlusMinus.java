package tasks.hackerrank.easy;

class PlusMinus {
    double[] plusMinus(int[] arr) {
        double[] result = new double[] {
            0.0,
            0.0,
            0.0
        };
        
        for (int i : arr) {
            if (i > 0) {
                result[0]++;
            } else if (i < 0) {
                result[1]++;
            } else {
                result[2]++;
            }
        }
        
        result[0] /= arr.length;
        result[1] /= arr.length;
        result[2] /= arr.length;
        
        return result;
    }
}
