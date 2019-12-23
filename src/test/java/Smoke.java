import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class Smoke {
    WebDriver driver;

    @BeforeMethod
    static void browserStart() {
//        WebDriver driver = new ChromeDriver(); I commented on this line to avoid the launch of a browser.

    }

    @Test
    void positiveScenarios() {
        System.out.println("The smoke tests with positive scenarios were finished without any fail.");
    }

    @Test
    void negativeScenarios() {
        System.out.println("The smoke tests with negative scenarios were finished without any fail.");
    }

    @Test
    void featureScenario() {
        System.out.println("The smoke testing for new feature was completed successfully.");
    }

    @Test
    void specialScenario() {
        System.out.println("The smoke tests with some special scenario were failed.");
    }


    @AfterMethod
    void browserFinish() {
//        driver.quit(); I commented on this line to avoid a displaying of errors in a stack trace.
    }

}
