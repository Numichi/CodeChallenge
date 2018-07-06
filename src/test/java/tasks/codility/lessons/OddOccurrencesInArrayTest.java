package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray oddOccurrencesInArray;

    @BeforeClass
    public void setUpBeforeClass() {
        oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                new int[] {
                    1,
                    2,
                    3,
                    4,
                    1,
                    2,
                    4
                },
                3
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    2,
                    3
                },
                1
            },
            {
                new int[] {
                    1,
                    2,
                    3,
                    1,
                    3
                },
                2
            },
            {
                new int[] {
                    2,
                    1,
                    3,
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
        Assert.assertEquals(oddOccurrencesInArray.solution(arr), expected);
    }
}
