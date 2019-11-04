import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SimulateBuying {
    static WebDriver driver;

    @Before
    static void browserLaunch() {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");
    }

    @Test
    static void testing() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");
        WebElement inputField = driver.findElement(By.xpath("//*[@placeholder=\"Search\"]"));
        inputField.click();
        inputField.sendKeys("Blouse");
        WebElement inputSubmit = driver.findElement(By.xpath("//*[@name=\"submit_search\"]"));
        inputSubmit.click();
        WebElement listMode = driver.findElement(By.cssSelector("i.icon-th-list"));
        listMode.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement clientChoice = driver.findElement(By.xpath("//*[@src=\"http://automationpractice.com/img/p/8/8-small_default.jpg\"]"));
        js.executeScript("arguments[0].scrollIntoView();", clientChoice);
        clientChoice.click();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement scrollToElement = driver.findElement(By.xpath("//*[@class=\"top-hr\"]"));
        js1.executeScript("arguments[0].scrollIntoView();", scrollToElement);
        WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
        addToCartButton.click();
        WebElement proceedToCheckout = driver.findElement(By.cssSelector("a.btn.btn-default.button.button-medium>span"));
        Wait wait = new FluentWait(driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(proceedToCheckout));
        proceedToCheckout.click();
        WebElement increaseGoodsQuantityButton = driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_3_13_0_0\"]"));
        increaseGoodsQuantityButton.click();
        WebElement factualTotal = driver.findElement(By.xpath("//*[@id=\"total_product_price_3_13_0\"]"));
        wait.until(org.openqa.selenium.support.ui.ExpectedConditions
                .textToBePresentInElement(factualTotal, "$52.00"));
        String actualTotal = new String(factualTotal.getText());
        String expectedTotal = new String("$52.00");
        System.out.println("The 'Total' value displays correctly : " + actualTotal.equals(expectedTotal));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        WebElement scrollToElement1 = driver.findElement(By.xpath("//*[@class='navigation_page']"));
        js2.executeScript("arguments[0].scrollIntoView();", scrollToElement1);
        WebElement factualTotalProducts = driver.findElement(By.xpath("//*[@id='total_product']"));
        String actualTotalProducts = new String(factualTotalProducts.getText());
        String expectedTotalProducts = new String("$52.00");
        System.out.println("The 'Total products' value displays correctly : " + actualTotalProducts.equals(expectedTotalProducts));
        WebElement factualTotalShipping = driver.findElement(By.xpath("//*[@id='total_shipping']"));
        String actualTotalShipping = new String(factualTotalShipping.getText());
        String expectedTotalShipping = new String("$2.00");
        System.out.println("The 'Total shipping' value displays correctly : " + actualTotalShipping.equals(expectedTotalShipping));
        WebElement factualTotalWithShipping = driver.findElement(By.xpath("//*[@id='total_price_without_tax']"));
        String actualTotalWithShipping = new String(factualTotalWithShipping.getText());
        String expectedTotalWithShipping = new String("$54.00");
        System.out.println("The 'Total with shipping' value displays correctly : " + actualTotalWithShipping.equals(expectedTotalWithShipping));
        WebElement factualTax = driver.findElement(By.xpath("//*[@id='total_tax']"));
        String actualTax = new String(factualTax.getText());
        String expectedTax = new String("$0.00");
        System.out.println("The 'Tax' value displays correctly : " + actualTax.equals(expectedTax));
        WebElement factualTotalPrice = driver.findElement(By.xpath("//*[@id='total_price']"));
        String actualTotalPrice = new String(factualTotalPrice.getText());
        String expectedTotalPrice = new String("$54.00");
        System.out.println("The 'TOTAL' value displays correctly : " + actualTotalPrice.equals(expectedTotalPrice));
        WebElement trashIcon = driver.findElement(By.xpath("//*[@class='icon-trash']"));
        trashIcon.click();
        driver.navigate().refresh();
        WebElement checkCart = driver.findElement(By.xpath("//*[@class='ajax_cart_no_product']"));
        String resultOfChecking = checkCart.getText();
        System.out.println("\n" + "The cart is : " + resultOfChecking);
    }
    @After

    static void browserFinish() {
        driver.quit();
    }
    public static void main(String[] args) {
        browserLaunch();
        testing();
        browserFinish();
    }
}

