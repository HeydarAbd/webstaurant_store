package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage {
    WebDriver driver;

    public CartPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"main\"]/div[3]/form/div/div[1]/div/a")
    public WebElement emptyCartButton;

    @FindBy(xpath = "//*[@id=\"td\"]/div[6]/div/div/div/div[3]/button[1]")
    public WebElement emptyCartOnPopUp;

}
