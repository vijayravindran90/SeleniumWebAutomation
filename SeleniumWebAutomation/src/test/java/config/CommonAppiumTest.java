package config;

import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
public class CommonAppiumTest {
    public WebDriver driver;

    Logger logger = Logger.getLogger(CommonAppiumTest.class);
    public CommonAppiumTest(WebDriver driver)
    {
        this.driver = driver;
    }
    public void waitForPageToLoad(WebElement id) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(id));
    }
    public void sendKeys(String id, String keys)
    {
        WebElement el = driver.findElement(By.id(id));
        el.sendKeys(keys);
    }
}
