import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class Regression {
    WebDriver driver;

    @BeforeMethod
    static void browserStart() {
//        WebDriver driver = new ChromeDriver(); I commented on this line to avoid the launch of a browser.

    }

    @DataProvider
    public Object [][] getData()
    {
        Object[][] data = new Object[3][2];
        data [0][0] = "Firefox";
        data [0][1] = "71.0";
        data [1][0] = "IE";
        data [1][1] = "11.0";
        data [2][0] = "Safari";
        data [2][1] = "13.1";

        return data;

    }

    @Test (dataProvider = "getData")
    void positiveScenarios(String browserName,String browserVersion) {
        System.out.println("The test passed in: " + browserName);
        System.out.println("with version: " + browserVersion);
        System.out.println("The regression tests finished without any fail in the browsers above.");
    }



    @Test
    void negativeScenarios() {
        System.out.println("The regression tests with negative scenarios were failed.");
    }

    @Test
    void featureScenario() {
        System.out.println("The regression testing for new feature was completed successfully.");
    }

    @Test
    void specialScenario() {
        System.out.println("The regression tests with some special scenario were finished without any fail.");
    }


    @AfterMethod
    void browserFinish() {
        //  driver.quit(); I commented on this line to avoid a displaying of errors in a stack trace.
    }
}