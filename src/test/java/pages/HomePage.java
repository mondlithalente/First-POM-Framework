package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


// In this class we keep everything we need and do in our Login Page of the system
public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[text()='Login']")
    WebElement loginButton;

    // Here we're creating a constructor that says "make me a home page that works with this browser"
    // Initializing the WebDriver so we can also be able to work with it in this HomePage
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginButton(){
            loginButton.click();
    }
}
