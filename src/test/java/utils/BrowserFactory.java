package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// In this class we are going to control the browser, like initializing and
// other basic stuff that starts the browser (It's like our @BeforeMethod and @AfterMethod)
public class BrowserFactory {

    // Static webdriver method that can be called anywhere
    // without having to be instantiated
    static WebDriver driver ;

    // This method will be used to launch the browser
    public static WebDriver launchBrowser(String browserName, String url){

        // So basically here the WebDriver will look at the browserName ignoring
        // the cases, and will use the url to launch that specific browser
        // if the browser is not specified, it will launch Edge by default
        if(browserName.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("fireFox")){
            driver = new FirefoxDriver();
        }
        else{
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);

        return  driver;
    }
}
