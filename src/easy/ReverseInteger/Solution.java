package easy.ReverseInteger;

class Solution
{
    public int reverse(int x)
    {
        boolean negative = false;
        boolean first = true;
        long reverse = 0L;

        if(x < 0) {
            negative = true;
            x *= -1;
        }

        while(0 < x) {
            if(first) {
                reverse *= 10;
                first = false;
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
