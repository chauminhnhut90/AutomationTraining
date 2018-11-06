import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BettingRule {

    @FindBy(xpath = "//h1")
    public WebElement bettingrule;


    WebDriver driver;

    public BettingRule (WebDriver driver4) {

        driver = driver4;
        //tuc la dang dung pageobject va page home
        PageFactory.initElements(driver, this);
    }

    public String get_title() {
        return bettingrule.getText();

    }


}
