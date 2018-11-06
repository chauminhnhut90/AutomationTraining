import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class HomePage {

    @FindBy(xpath = "//a[contains(@class, 'periodName_0 betSideName_1')]")
    public WebElement odd;

    @FindBy(xpath = "//input[@id='stakeTicket']")
    public WebElement staketxt;

    @FindBy(xpath = "//div[@id='existTicket'][not(@class='hide')]//span[text()='Place bet']")
    public WebElement placebet;

    WebDriver driver;

    public HomePage(WebDriver driver2) {

        driver = driver2;
        //tuc la dang dung pageobject va page home
        PageFactory.initElements(driver, this);
    }

    public void click_odd() {

        // Select oddpage
        odd.click();
    }


    public void enter_stake() {

        staketxt.sendKeys("10");
    }


    public void click_placebet() {

        placebet.click();
    }


}
