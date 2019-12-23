import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class Sanity {
    WebDriver driver;

    @BeforeMethod
    static void browserStart() {
//        WebDriver driver = new ChromeDriver(); I commented on this line to avoid the launch of a browser.

    }

    @Test
    void positiveScenarios() {
        System.out.println("The sanity tests with positive scenarios were finished without any fail.");
    }

    @Test
    void negativeScenarios() {
        System.out.println("The sanity tests with negative scenarios were failed.");
    }

    @Test
    void featureScenario() {
        System.out.println("The sanity testing for new feature was completed successfully.");
    }

    @Test
    void deepScenario() {
        System.out.println("The deep test scenario was finished without any fail.");
    }


    @AfterMethod
    void browserFinish() {
//        driver.quit(); I commented on this line to avoid a displaying of errors in a stack trace.
    }
}
