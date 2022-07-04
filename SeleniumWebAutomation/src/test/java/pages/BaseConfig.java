package pages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseConfig {
    WebDriver driver;

    @BeforeSuite
    public WebDriver getDriver()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay.ravindran\\Downloads\\SeleniumWebAutomation\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    @AfterSuite
    public void tearDown()
    {
        if(driver!=null)
        {
            driver.close();
            driver.quit();
        }
    }
    public WebDriver getWebDriver(){
        if(driver==null)
        {
            getDriver();
        }
        return driver;
    }
}
