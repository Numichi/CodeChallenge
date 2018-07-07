package tasks.hackerrank.problemSolving.medium;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JavaRegexTest {
    
    private JavaRegex javaRegex;
    @DataProvider(name = "default")
    public static Object[][] dataProviderDefault() {
        return new Object[][] {
            {
                "000.12.12.034",
                true
            },
            {
                "121.234.12.12",
                true
            },
            {
                "23.45.12.56",
                true
            },
            {
                "00.12.123.123123.123",
                false
            },
            {
                "122.23",
                false
            },
            {
                "Hello.IP",
                false
            },
            {
                "12.12.12.12",
                true
            },
            {
                "13.13.13.112",
                true
            },
            {
                "VUUT.12.12",
                false
            },
            {
                "111.111.11.111",
                true
            },
            {
                "1.1.1.1.1.1.1",
                false
            },
            {
                ".....",
                false
            },
            {
                "0.0.0.0",
                true
            },
            {
                "25",
                false
            },
            {
                "259.259.259.259",
                false
            },
            {
                "266.266.266.266",
                false
            },
            {
                "266.266.266.266",
                false
            },
            {
                "1...1..1..1",
                false
            },
            
            {
                "255.0.255.0",
                true
            },
            
            {
                "00000.000000.0000000.00001",
                false
            },
            
            {
                "0023.0012.0012.0034",
                false
            },
            };
    }
    @BeforeTest
    public void init() {
        javaRegex = new JavaRegex();
    }
    
    @Test(dataProvider = "default")
    public void test(
        String str,
        boolean bool
    ) {
        Assert.assertEquals(str.matches(javaRegex.pattern), bool);
    }
}
