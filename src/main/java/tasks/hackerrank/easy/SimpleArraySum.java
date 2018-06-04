package tasks.hackerrank.easy;

class SimpleArraySum {
    int simpleArraySum(int[] arr) {
        int result = 0;

        if(arr != null) {
            for(int i : arr) {
                result += i;
            }
        }

        return result;
    }
}
