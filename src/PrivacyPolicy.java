import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicy {

    @FindBy(xpath = "//h1")
    public WebElement privacypolicy;


    WebDriver driver;

    public PrivacyPolicy (WebDriver driver5) {

        driver = driver5;
        //tuc la dang dung pageobject va page home
        PageFactory.initElements(driver, this);
    }

    public String get_title() {
        return privacypolicy.getText();

    }
}
