package tasks.hackerrank.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StaircaseTest {
    private Staircase staircase;

    @BeforeClass
    public void setUpBeforeClass() {
        staircase = new Staircase();
    }

    @Test
    public void staircaseTest() {
        String[] expect = new String[]{
            " #",
            "##",
        };
        Assert.assertEquals(expect, staircase.staircase(2));

        expect = new String[]{
            "   #",
            "  ##",
            " ###",
            "####",
        };
        Assert.assertEquals(expect, staircase.staircase(4));

        expect = new String[]{
            "     #",
            "    ##",
            "   ###",
            "  ####",
            " #####",
            "######",
        };
        Assert.assertEquals(expect, staircase.staircase(6));

        expect = new String[]{
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
        };
        Assert.assertEquals(expect, staircase.staircase(10));
    }
}
