package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PermCheckTest {
    private PermCheck PermCheck;

    @BeforeClass
    public void setUpBeforeClass() {
        PermCheck = new PermCheck();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {new int[] {4, 1, 3, 2}, 1},
            {new int[] {4, 1, 3}, 0},
            {new int[] {1, 2}, 1},
            {new int[] {2, 3}, 0},
            {new int[] {}, 1}, // ?
        };
    }

    @Test(dataProvider = "default")
    public void testDefault(int[] perm, int expected) {
        Assert.assertEquals(PermCheck.solution(perm), expected);
    }
}