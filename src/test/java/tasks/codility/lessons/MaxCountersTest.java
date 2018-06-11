package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MaxCountersTest {
    private MaxCounters MaxCounters;

    @BeforeClass
    public void setUpBeforeClass() {
        MaxCounters = new MaxCounters();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {5, new int[] { 3, 4, 4, 6, 1, 4, 4 }, new int[] { 3, 2, 2, 4, 2 } },
            {3, new int[] { 3, 4, 4, 4, 1, 4, 4 }, new int[] { 2, 2, 2 } },
        };
    }

    @Test(dataProvider = "default")
    public void testDefault(int N, int[] A, int[] expected) {
        Assert.assertEquals(MaxCounters.solution(N, A), expected);
    }
}