package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import utils.BrowserFactory;

// In this class we are linking up everything that we have created
// in our framework. This class will store everything for us so that
// whenever we need something from any other class, we can just inherit
// all the stuff we need from this class. (Acts as a placeholder of our tools).
public class Base {

    // So here is just like saying the Base class must launch the browser now that we have provided everything
    final WebDriver driver = BrowserFactory.launchBrowser("Chome","https://ndosisimplifiedautomation.vercel.app/");

    //
    // Also this is more like initialized so that we can be able to call and access what we need from the Home Page accessing it
    // From out LoginTests class
    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
}
