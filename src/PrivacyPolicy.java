import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicy {

    //    @FindBy(xpath = "")
    //    public WebElement ;

    @FindBy(xpath = "//h1")
    public  WebElement titlePrivacyPlolicy;


    //khoi tao
    public PrivacyPolicy() {
        WebDriver driver = WebDriverSingleton.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    public String verifyPrivacyPolicy(){
         String actualResult =titlePrivacyPlolicy.getText();
         return actualResult;
    }
    public boolean isPrivacyPolicy(){
        String expectedResult = "Privacy Policy";
        System.out.printf(verifyPrivacyPolicy());
        return verifyPrivacyPolicy().equals(expectedResult);
    }



}
