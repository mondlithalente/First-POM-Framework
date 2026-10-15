package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {

    WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        Thread.sleep(2000);
    }

    @Test
    public void clickLoginButton(){
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")).click();
    }

    @Test(dependsOnMethods = {"clickLoginButton"})
    public void enterUsername(){
        driver.findElement(By.id("login-email")).sendKeys("Bongza123@gmail.com");
    }

    @Test(dependsOnMethods = {"enterUsername"})
    public void enterPassword(){
        driver.findElement(By.id("login-password")).sendKeys("Test1234?");
    }

    @Test(dependsOnMethods = {"enterPassword"})
    public void clickSubmitButton() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(1500);
    }

    @Test(dependsOnMethods = {"clickSubmitButton"})
    public void expandDropDown() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button")).click();

        Thread.sleep(1500); // Here I just tried to slow it down a little since the animation of the drop-down was still loading on the web
        // Therefore the element becomes readily available for the next method to find it
        // Before this fix the clickLearningMaterials test method would not pass because of 'element not interactable' error
    }

    @Test(dependsOnMethods = {"expandDropDown"})
    public void clickLearningMaterials() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")).click();
        Thread.sleep(1200);
    }

    @Test(dependsOnMethods = {"clickLearningMaterials"})
    public void openWebAutomationBasicForm() throws InterruptedException {
        driver.findElement(By.id("tab-btn-password")).click();
        Thread.sleep(1100);
    }

    @Test(dependsOnMethods = {"openWebAutomationBasicForm"})
    public void enterName() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("Mondli Mpurwana");
        Thread.sleep(1100);
    }

    @Test(dependsOnMethods = {"enterName"})
    public void enterEmail() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("mpurwanamondli@gmail.com");
        Thread.sleep(1100);
    }

    @Test(dependsOnMethods = {"enterEmail"})
    public void enterAge() throws InterruptedException {
        driver.findElement(By.id("age")).sendKeys("20");
        Thread.sleep(1100);
    }

    @Test(dependsOnMethods = {"enterAge"})
    public void selectGender() throws InterruptedException {

        driver.findElement(By.id("gender")).sendKeys("Male");
        Thread.sleep(1100);
    }

    @Test(dependsOnMethods = {"selectGender"})
    public void selectCountry() throws InterruptedException {

        driver.findElement(By.id("country")).sendKeys("South Africa");
        Thread.sleep(1100);
    }

    @Test(dependsOnMethods = {"selectCountry"})
    public void selectExperience() throws InterruptedException {
        driver.findElement(By.id("experience")).sendKeys("Intermediate (2-5 years)");
        Thread.sleep(1100);
    }

    @Test(dependsOnMethods = {"selectExperience"})
    public void selectSkills() throws InterruptedException {
        driver.findElement(By.id("skill-javascript")).click();
        driver.findElement(By.id("skill-selenium")).click();
        Thread.sleep(1100);
    }

    @Test(dependsOnMethods = {"selectSkills"})
    public void addComment() throws InterruptedException {
        driver.findElement(By.id("comments")).sendKeys("Are Testers really the bearers of bad news?");

        Thread.sleep(1200);
    }

    @Test(dependsOnMethods = {"addComment"})
    public void tickTerms() throws InterruptedException {
        driver.findElement(By.id("terms")).click();
        Thread.sleep(1100);
    }

    @Test(dependsOnMethods = {"tickTerms"})
    public void clickSubmitForm() throws InterruptedException {
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(4500); //Even here I got the 'element click intercepted' error on the clickSubmissionButton test method
        // So I had to wait a bit longer until the notification that blocked the submission button is removed
    }

    @Test(dependsOnMethods = {"clickSubmitForm"})
    public void clickSubmissionButton() throws InterruptedException {
        driver.findElement(By.id("submissions-toggle-btn")).click();
        Thread.sleep(1100);
    }
    @Test(dependsOnMethods = {"clickSubmissionButton"})
    public void viewSubmission(){
        driver.findElement(By.id("view-submission-0")).click();
    }

    @AfterTest
    public void closeTest(){
        driver.quit();
    }


}
