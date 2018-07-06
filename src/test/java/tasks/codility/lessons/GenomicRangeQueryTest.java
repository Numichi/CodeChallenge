package tasks.codility.lessons;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GenomicRangeQueryTest {
    private GenomicRangeQuery GenomicRangeQuery;
    
    @BeforeClass
    public void setUpBeforeClass() {
        GenomicRangeQuery = new GenomicRangeQuery();
    }
    
    @DataProvider(name = "default")
    public static Object[][] dataProvider() {
        return new Object[][] {
            {
                "CAGCCTA",
                new int[] {
                    2,
                    5,
                    0
                },
                new int[] {
                    4,
                    5,
                    6
                },
                new int[] {
                    2,
                    4,
                    1
                }
            },
            };
    }
    
    @Test(dataProvider = "default")
    public void testDefault(
        String N,
        int[] P,
        int[] Q,
        int[] expected
    ) {
        Assert.assertEquals(GenomicRangeQuery.solution(N, P, Q), expected);
    }
}