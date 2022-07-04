package pages;

import config.CommonAppiumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;
import pageObjectRepository.HomePageObjectRepository;
public class HomePage extends CommonAppiumTest
{
    HomePageObjectRepository homePageObjectRepository = new HomePageObjectRepository();


    public HomePage(WebDriver driver) {
        super(driver);
    }
    public HomePage clickOnSearchBar(){
        driver.get("https://www.amazon.com/");
       driver.findElement(By.id("twotabsearchtextbox")).click();
       sendKeys("twotabsearchtextbox","Shoes");
        return this;
    }
}
