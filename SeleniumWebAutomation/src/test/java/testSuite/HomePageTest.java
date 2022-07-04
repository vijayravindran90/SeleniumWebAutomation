package testSuite;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.BaseConfig;
public class HomePageTest extends BaseConfig {

    @Test
    public void launchAmazonApp()
    {
        new HomePage(new BaseConfig().getDriver()).clickOnSearchBar();
    }
}
