package LeetCode.medium;

public class ContainerWithMostWater
{
    public int maxArea(int[] height)
    {
        int Lp = 0;
        int Rp = height.length - 1;
        int max = 0;
        int xL;
        int yL;
        
        while(Lp < Rp) {
            yL = Math.min(height[Lp], height[Rp]);
            xL = Rp - Lp;
            max = Math.max(max, xL * yL);
            
            if(height[Lp] < height[Rp]) {
                Lp++;
            } else {
                Rp--;
            }
        }
        
        return max;
    }
}
