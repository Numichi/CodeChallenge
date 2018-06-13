package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountDivTest {
    private CountDiv CountDiv;

    @BeforeClass
    public void setUpBeforeClass() {
        CountDiv = new CountDiv();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {7, 11, 3, 1},
            {6, 11, 2, 3},
            {6, 11, 7, 1},
            {6, 13, 3, 3},
            {3, 13, 3, 4},
            {0, 0, 11, 1},
            {1, 1, 11, 0},
            {10, 10, 5, 1},
            {10, 10, 7, 0},
            {10, 10, 20, 0},
        };
    }

    @Test(dataProvider = "default")
    public void testDefault(int A, int B, int K, int expected) {
        Assert.assertEquals(CountDiv.solution(A, B, K), expected);
    }
}