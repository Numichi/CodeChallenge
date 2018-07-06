package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PermMissingElemTestTest {
    private PermMissingElem PermMissingElem;

    @BeforeClass
    public void setUpBeforeClass() {
        PermMissingElem = new PermMissingElem();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                new int[] {
                    2,
                    3,
                    1,
                    5
                },
                4
            },
            {
                new int[] {},
                1
            },
            {
                new int[] {2},
                1
            },
            {
                new int[] {1},
                2
            },
            {
                new int[] {
                    1,
                    2
                },
                3
            },
            };
    }

    @Test(dataProvider = "default")
    public void testDefault(
        int[] arr,
        int expected
    ) {
        Assert.assertEquals(PermMissingElem.solution(arr), expected);
    }
}