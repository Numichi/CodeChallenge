package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CyclicRotationTest {
    private CyclicRotation cyclicRotation;

    @BeforeClass
    public void setUpBeforeClass() {
        cyclicRotation = new CyclicRotation();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                new int[] {},
                0,
                new int[] {}
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4
                },
                0,
                new int[] {
                    1,
                    2,
                    3,
                    4
                }
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4
                },
                4,
                new int[] {
                    1,
                    2,
                    3,
                    4
                }
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4
                },
                1,
                new int[] {
                    4,
                    1,
                    2,
                    3
                }
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4
                },
                2,
                new int[] {
                    3,
                    4,
                    1,
                    2
                }
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    4
                },
                3,
                new int[] {
                    2,
                    3,
                    4,
                    1
                }
            },
            };
    }

    @DataProvider(name = "null")
    public static Object[][] dataProviderNull() {
        return new Object[][] {
            {
                null,
                0,
                new int[] {}
            },
            };
    }

    @Test(dataProvider = "default")
    public void testDefault(
        int[] arr,
        int cyc,
        int[] expected
    ) {
        Assert.assertEquals(cyclicRotation.solution(arr, cyc), expected);
    }

    @Test(dataProvider = "null", expectedExceptions = NullPointerException.class)
    public void testNull(
        int[] arr,
        int cyc,
        int[] expected
    ) {
        Assert.assertEquals(cyclicRotation.solution(arr, cyc), expected);
    }
}
