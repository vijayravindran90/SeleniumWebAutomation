package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePageObjectRepository {

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBar;
}
