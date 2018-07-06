package tasks.other;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RealDivTest {
    private RealDiv RealDiv;
    
    @BeforeMethod
    public void setUpBeforeMethod() {
        RealDiv = new RealDiv();
    }
    
    @DataProvider(name = "default")
    public Object[][] dataProvider() {
        return new Object[][] {
            {
                35,
                new HashSet<>(Arrays.asList(5, 7))
            },
            {
                12,
                new HashSet<>(Arrays.asList(2, 3, 4, 6))
            },
            {
                45,
                new HashSet<>(Arrays.asList(3, 5, 9, 15))
            }
        };
    }
    
    @Test(dataProvider = "default")
    public void test(
        int value,
        Set<Integer> expected
    ) {
        Assert.assertEquals(RealDiv.solution(value), expected);
    }
}
