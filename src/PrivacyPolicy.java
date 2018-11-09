import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicy {
    WebDriver driver;

    @FindBy(xpath = "//span[text()=\"Privacy Policy\"]")
    public WebElement title;


    public PrivacyPolicy(WebDriver driver3) {
        this.driver = driver3;
        PageFactory.initElements(driver3, this);
    }


        public String gettitle2 (){
            return title.getText();
        }

}