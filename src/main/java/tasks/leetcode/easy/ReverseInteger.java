package tasks.leetcode.easy;

public class ReverseInteger
{
    public int reverse(int x)
    {
        boolean negative = false;
        boolean notFirst = false;
        long reverse = 0L;

        if(x < 0) {
            negative = true;
            x *= -1;
        }

        while(0 < x) {
            if(notFirst) {
                reverse *= 10;
            } else {
                notFirst = true;
            }

            reverse += x % 10;
            x /= 10;
        }

        if(negative) {
            reverse *= -1;
        }

        try {
            return Math.toIntExact(reverse);
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
