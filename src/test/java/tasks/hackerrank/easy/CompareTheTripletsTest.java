package tasks.hackerrank.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CompareTheTripletsTest {
    private CompareTheTriplets compareTheTriplets;

    @BeforeClass
    public void setUpBeforeTest() {
        compareTheTriplets = new CompareTheTriplets();
    }

    @DataProvider(name = "data-default")
    public static Object[][] dataProviderDefault() {
        return new Object[][] {
            {
                new int[] {
                    1,
                    2,
                    3,
                    4,
                    5
                },
                new int[] {
                    1,
                    2,
                    3,
                    4,
                    5
                },
                new int[] {
                    0,
                    0
                }
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4,
                    5
                },
                new int[] {
                    2,
                    3,
                    4,
                    5,
                    6
                },
                new int[] {
                    0,
                    5
                }
            },
            {
                new int[] {
                    100,
                    99,
                    98,
                    4,
                    5
                },
                new int[] {
                    2,
                    3,
                    4,
                    5,
                    6
                },
                new int[] {
                    3,
                    2
                }
            },
            };
    }

    @DataProvider(name = "data-with-null")
    public static Object[][] dataProviderWithNull() {
        return new Object[][] {
            {
                null,
                new int[] {
                    2,
                    3,
                    4,
                    5,
                    6
                },
                new int[] {
                    3,
                    2
                }
            },
            {
                new int[] {
                    2,
                    3,
                    4,
                    5,
                    6
                },
                null,
                new int[] {
                    3,
                    2
                }
            },
            {
                null,
                null,
                new int[] {
                    3,
                    2
                }
            },
            };
    }

    @DataProvider(name = "data-with-array-index")
    public static Object[][] dataProviderWithArrayIndex() {
        return new Object[][] {
            {
                new int[] {
                    1,
                    2,
                    3,
                    4,
                    5,
                    6,
                    7,
                    8
                },
                new int[] {
                    2,
                    3,
                    4,
                    5,
                    6
                },
                new int[] {
                    0,
                    5
                }
            },
            {
                new int[] {
                    100,
                    99,
                    98,
                    4,
                    5
                },
                new int[] {
                    2,
                    3,
                    4,
                    5,
                    6,
                    7,
                    8,
                    9,
                    10
                },
                new int[] {
                    3,
                    2
                }
            },
            };
    }

    private void test(
        int[] p1,
        int[] p2,
        int[] expected
    ) {
        Assert.assertEquals(compareTheTriplets.solve(p1, p2), expected);
    }

    @Test(dataProvider = "data-default")
    public void solveTest(
        int[] p1,
        int[] p2,
        int[] expected
    ) {
        test(p1, p2, expected);
    }

    @Test(dataProvider = "data-with-null", expectedExceptions = NullPointerException.class)
    public void solveNullableTest(
        int[] p1,
        int[] p2,
        int[] expected
    ) {
        test(p1, p2, expected);
    }

    @Test(dataProvider = "data-with-array-index", expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void solveLengthProblemTest(
        int[] p1,
        int[] p2,
        int[] expected
    ) {
        test(p1, p2, expected);
    }
}
