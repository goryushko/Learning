//завдання з реестрації переробити використовуючи патерн білдер

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Registration {
    //I declare all final attributes I needed.
    private final String emailAddress;
    private final String firstName;
    private final String lastName;
    private final String password;
    private final String address;
    private final String city;
    private final String postalCode;
    private final String mobilePhone;
    private final String alias;

    private Registration(RegistrationBuilder builder) {
        this.emailAddress = builder.emailAddress;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.password = builder.password;
        this.address = builder.address;
        this.city = builder.city;
        this.postalCode = builder.postalCode;
        this.mobilePhone = builder.mobilePhone;
        this.alias = builder.alias;
    }

    //Here only are the getters to provide immutability.
    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public String toString() {
        return "Registration: " + this.emailAddress + "," + this.firstName + "," + this.lastName + "," + this.password + ","
                + this.address + "," + this.city + "," + this.postalCode + "," + this.mobilePhone + this.alias;
    }

    public static class RegistrationBuilder {
        private String alias;
        private String emailAddress;
        private String firstName;
        private String lastName;
        private String password;
        private String address;
        private String city;
        private String postalCode;
        private String mobilePhone;

        public RegistrationBuilder(String firstName) {
            this.firstName = firstName;
        }

        public RegistrationBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public RegistrationBuilder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public RegistrationBuilder alias(String alias) {
            this.alias = alias;
            return this;
        }

        public RegistrationBuilder password(String password) {
            this.password = password;
            return this;
        }

        public RegistrationBuilder address(String address) {
            this.address = address;
            return this;
        }

        public RegistrationBuilder city(String city) {
            this.city = city;
            return this;
        }

        public RegistrationBuilder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public RegistrationBuilder mobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        public Registration build() {
            Registration registration = new Registration(this);
            validateRegistrationObject(registration);
            return registration;
        }

        private void validateRegistrationObject(Registration registration) {
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();

        Registration registrationNewUser = new RegistrationBuilder("John")
                .lastName("Doe")
                .emailAddress("habsolute.cyanid7@dewajudi999.com")
                .alias("Man")
                .password("11111")
                .address("Street")
                .city("City")
                .postalCode("00000")
                .mobilePhone("+3800000000")
                .build();
        WebElement signIn = driver.findElement(By.xpath("//div [@class=\"header_user_info\"]"));
        signIn.click();
        WebElement emailAddress = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        emailAddress.sendKeys(registrationNewUser.emailAddress);
        WebElement createAnAccountButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
        createAnAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement firstName = driver.findElement(By.cssSelector("#customer_firstname"));
        firstName.click();
        firstName.sendKeys(registrationNewUser.firstName);
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        lastName.click();
        lastName.sendKeys(registrationNewUser.lastName);
        WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        password.sendKeys(registrationNewUser.password);
        WebElement address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        address.sendKeys(registrationNewUser.address);
        WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        city.sendKeys(registrationNewUser.city);
        WebElement postalCode = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
        postalCode.sendKeys(registrationNewUser.postalCode);
        WebElement mobilePhone = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
        mobilePhone.sendKeys(registrationNewUser.mobilePhone);
        WebElement alias = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
        alias.clear();
        alias.sendKeys(registrationNewUser.alias);
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
        registerButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement alert = driver.findElement(By.cssSelector("#center_column > div > p"));
        String alertMessage = alert.getText();
        System.out.println("The text of the alert is: " + alertMessage);
        driver.close();
    }
}


