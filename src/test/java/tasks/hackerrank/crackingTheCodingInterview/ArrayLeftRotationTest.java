package tasks.hackerrank.crackingTheCodingInterview;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayLeftRotationTest {
    private ArrayLeftRotation arrayLeftRotation;
    @DataProvider(name = "default")
    public static Object[][] dataProviderDefault() {
        return new Object[][] {
            {new int[] {1, 2, 3, 4, 5}, 2, new int[] {3, 4, 5, 1, 2}},
            {new int[] {1, 2, 3, 4, 5}, 5, new int[] {1, 2, 3, 4, 5}},
            {new int[] {1, 2, 3, 4, 5}, 4, new int[] {5, 1, 2, 3, 4}},
            };
    }
    @BeforeClass
    public void setUpBeforeTest() {
        arrayLeftRotation = new ArrayLeftRotation();
    }
    @Test(dataProvider = "default")
    public void test(
        int[] in,
        int param,
        int[] except
    ) {
        Assert.assertEquals(arrayLeftRotation.rotLeft(in, param), except);
    }
}