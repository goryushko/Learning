import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebdriverExample {
    @Test
    public void runDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        WebElement signIn = driver.findElement(By.xpath("//div [@class=\"header_user_info\"]"));
        signIn.click();
        WebElement emailAddress = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        emailAddress.sendKeys("habsolute.cyanid7@dewajudi999.com");
        WebElement createAnAccountButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
        createAnAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement firstName = driver.findElement(By.cssSelector("#customer_firstname"));
        //firstName.click();
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        lastName.click();
        lastName.sendKeys("Doe");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        password.sendKeys("11111");
        WebElement address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        address.sendKeys("Street");
        WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        city.sendKeys("City");
        WebElement postalCode = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
        postalCode.sendKeys("00000");
        WebElement mobilePhone = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
        mobilePhone.sendKeys("+3800000000");
        WebElement alias = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
        alias.clear();
        alias.sendKeys("Man");
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
        registerButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement alert = driver.findElement(By.cssSelector("#center_column > div > p"));
        String alertMessage = alert.getText();
        System.out.println("The text of the alert is: " + alertMessage);
        driver.close();

    }
}
