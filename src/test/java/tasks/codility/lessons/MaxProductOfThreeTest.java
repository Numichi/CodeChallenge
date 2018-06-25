package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MaxProductOfThreeTest {
    private MaxProductOfThree MaxProductOfThree;

    @BeforeClass
    public void setUpBeforeClass() {
        MaxProductOfThree = new MaxProductOfThree();
    }

    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
        };
    }

    @Test(dataProvider = "default")
    public void testDefault(int expected) {
        Assert.assertEquals(MaxProductOfThree.solution(), expected);
    }
}