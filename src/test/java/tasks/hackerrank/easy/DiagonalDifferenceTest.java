package tasks.hackerrank.easy;

import exception.NotSquareMatrixException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DiagonalDifferenceTest {
    private DiagonalDifference diagonalDifference;

    @BeforeClass
    public void setUpBeforeTest() {
        diagonalDifference = new DiagonalDifference();
    }

    @Test
    public void diagonalDifferenceTest() throws NotSquareMatrixException {
        int[][] matrix = new int[][] {
            {11, 2, 4},
            {4, 5, 6},
            {10, 8, -12}
        };

        Assert.assertEquals(15, diagonalDifference.diagonalDifference(matrix));
    }

    @Test(expectedExceptions =  NotSquareMatrixException.class)
    public void diagonalDifferenceWithNotSquareMatrixExceptionTest() throws NotSquareMatrixException {
        int[][] matrix = new int[][] {
            {11, 2, 4},
            {4, 5, 6, 6},
            {10, 8, -12}
        };

        Assert.assertEquals(0, diagonalDifference.diagonalDifference(matrix));
    }

    @Test(expectedExceptions =  NullPointerException.class)
    public void diagonalDifferenceWithNullPointerExceptionTest() throws NotSquareMatrixException {
        Assert.assertEquals(0, diagonalDifference.diagonalDifference(null));
    }
}
