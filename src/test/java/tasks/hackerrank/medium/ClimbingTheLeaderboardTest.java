package tasks.hackerrank.medium;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClimbingTheLeaderboardTest {
    private ClimbingTheLeaderboard climbingTheLeaderboard;
    
    @BeforeTest
    public void init() {
        climbingTheLeaderboard = new ClimbingTheLeaderboard();
    }
    
    @DataProvider(name = "data-default")
    public static Object[][] dataProviderDefault() {
        return new Object[][] {
            {
                new int[] {
                    100,
                    100,
                    50,
                    40,
                    40,
                    20,
                    10
                },
                new int[] {
                    5,
                    25,
                    50,
                    120
                },
                new int[] {
                    6,
                    4,
                    2,
                    1
                }
            }
        };
    }
    
    @Test(dataProvider = "data-default")
    public void test(
        int[] p1,
        int[] p2,
        int[] excepted
    ) {
        Assert.assertEquals(climbingTheLeaderboard.climbingLeaderboard(p1, p2), excepted);
    }
}
