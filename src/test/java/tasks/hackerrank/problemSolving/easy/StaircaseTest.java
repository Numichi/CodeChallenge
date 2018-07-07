package tasks.hackerrank.problemSolving.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StaircaseTest {
    private Staircase staircase;

    @BeforeClass
    public void setUpBeforeClass() {
        staircase = new Staircase();
    }

    @DataProvider(name = "data-default")
    public static Object[][] dataProviderDefault() {
        return new Object[][] {
            {
                2,
                new String[] {
                    " #",
                    "##",
                    }
            },
            {
                4,
                new String[] {
                    "   #",
                    "  ##",
                    " ###",
                    "####",
                    }
            },
            {
                6,
                new String[] {
                    "     #",
                    "    ##",
                    "   ###",
                    "  ####",
                    " #####",
                    "######",
                    }
            },
            {
                10,
                new String[] {
                    "         #",
                    "        ##",
                    "       ###",
                    "      ####",
                    "     #####",
                    "    ######",
                    "   #######",
                    "  ########",
                    " #########",
                    "##########",
                    }
            }
        };
    }

    @Test(dataProvider = "data-default")
    public void staircaseTest(
        int input,
        String[] excepted
    ) {
        Assert.assertEquals(staircase.staircase(input), excepted);
    }
}
