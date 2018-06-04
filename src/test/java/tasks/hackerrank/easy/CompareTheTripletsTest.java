package tasks.hackerrank.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CompareTheTripletsTest {
    private CompareTheTriplets compareTheTriplets;

    @BeforeClass
    public void setUpBeforeTest() {
        compareTheTriplets = new CompareTheTriplets();
    }

    @Test
    public void solveTest() {
        Assert.assertEquals(
            new int[]{0, 0},
            compareTheTriplets.solve(
                new int[]{1, 2, 3, 4, 5},
                new int[]{1, 2, 3, 4, 5}
            )
        );

        Assert.assertEquals(
            new int[]{0, 5},
            compareTheTriplets.solve(
                new int[]{1, 2, 3, 4, 5},
                new int[]{2, 3, 4, 5, 6}
            )
        );

        Assert.assertEquals(
            new int[]{3, 2},
            compareTheTriplets.solve(
                new int[]{100, 99, 98, 4, 5},
                new int[]{2, 3, 4, 5, 6}
            )
        );
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void solveNullableVer1Test() {
        Assert.assertEquals(
            new int[]{3, 2},
            compareTheTriplets.solve(
                null,
                new int[]{2, 3, 4, 5, 6}
            )
        );
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void solveNullableVer2Test() {
        Assert.assertEquals(
            new int[]{3, 2},
            compareTheTriplets.solve(
                null,
                null
            )
        );
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void solveLengthProblemTest() {
        Assert.assertEquals(
            new int[]{3, 2},
            compareTheTriplets.solve(
                new int[]{2, 3, 4, 5, 6, 7},
                new int[]{2, 3, 4, 5, 6}
            )
        );
    }
}
