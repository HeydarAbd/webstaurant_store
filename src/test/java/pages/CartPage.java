package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage {
    WebDriver driver;

    public CartPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

}
