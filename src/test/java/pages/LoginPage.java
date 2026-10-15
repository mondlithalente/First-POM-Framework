package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "login-email")
    WebElement usernameField;

    @FindBy(id = "login-password")
    WebElement passwordField;

    @FindBy(id = "login-submit")
    WebElement submitButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        usernameField.sendKeys("Bongza123@gmail.com");
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

}
