package tasks.hackerrank.problemSolving.easy;

import exception.NotSquareMatrixException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DiagonalDifferenceTest {
    private DiagonalDifference diagonalDifference;

    @BeforeClass
    public void setUpBeforeTest() {
        diagonalDifference = new DiagonalDifference();
    }

    @DataProvider(name = "data-default")
    public static Object[][] dataProviderDefault() {
        return new Object[][] {
            {
                new int[][] {
                    {
                        11,
                        2,
                        4
                    },
                    {
                        4,
                        5,
                        6
                    },
                    {
                        10,
                        8,
                        -12
                    }
                },
                15
            },
            };
    }

    @DataProvider(name = "data-NotSquareMatrixException")
    public static Object[][] dataProviderWithNotSquareMatrixException() {
        return new Object[][] {
            {
                new int[][] {
                    {
                        11,
                        2,
                        4
                    },
                    {
                        4,
                        5,
                        6,
                        6
                    },
                    {
                        10,
                        8,
                        -12
                    }
                },
                0
            },
            {
                new int[][] {
                    {
                        11,
                        2,
                        4
                    },
                    {
                        4,
                        5,
                        6,
                        6
                    },
                    {
                        10,
                        8,
                        -12
                    },
                    {
                        10,
                        8,
                        -12
                    },
                    {
                        10,
                        8,
                        -12
                    },
                    {
                        10,
                        8,
                        -12
                    }
                },
                0
            },
            };
    }

    @DataProvider(name = "data-NullPointerException")
    public static Object[][] dataProviderWithNullPointerException() {
        return new Object[][] {
            {
                null,
                0
            }
        };
    }

    @Test(dataProvider = "data-default")
    public void diagonalDifferenceTest(
        int[][] matrix,
        int excepted
    ) throws NotSquareMatrixException {
        Assert.assertEquals(diagonalDifference.diagonalDifference(matrix), excepted);
    }

    @Test(dataProvider = "data-NotSquareMatrixException", expectedExceptions = NotSquareMatrixException.class)
    public void diagonalDifferenceWithNotSquareMatrixExceptionTest(
        int[][] matrix,
        int excepted
    ) throws NotSquareMatrixException {
        Assert.assertEquals(diagonalDifference.diagonalDifference(matrix), excepted);
    }

    @Test(dataProvider = "data-NullPointerException", expectedExceptions = NullPointerException.class)
    public void diagonalDifferenceWithNullPointerExceptionTest(
        int[][] matrix,
        int excepted
    ) throws NotSquareMatrixException {
        Assert.assertEquals(diagonalDifference.diagonalDifference(matrix), excepted);
    }
}
