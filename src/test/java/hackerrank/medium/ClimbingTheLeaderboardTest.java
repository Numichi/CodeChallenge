package hackerrank.medium;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClimbingTheLeaderboardTest
{
    private ClimbingTheLeaderboard obj;

    @BeforeTest
    public void init()
    {
        obj = new ClimbingTheLeaderboard();
    }

    @Test
    public void test()
    {
        Assert.assertEquals(
            obj.climbingLeaderboard(
                new int[] {100, 100, 50, 40, 40, 20, 10},
                new int[] {5, 25, 50, 120}
            ),
            new int[] {6, 4, 2, 1}
        );
    }
}
