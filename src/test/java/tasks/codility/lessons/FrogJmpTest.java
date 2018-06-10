package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FrogJmpTest {
    private FrogJmp FrogJmp;

    @BeforeClass
    public void setUpBeforeClass() {
        FrogJmp = new FrogJmp();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {10, 85, 30},
        };
    }

    @Test(dataProvider = "default")
    public void testDefault(int from, int to, int range) {
        Assert.assertEquals(FrogJmp.solution(from, to, range), 3);
    }
}