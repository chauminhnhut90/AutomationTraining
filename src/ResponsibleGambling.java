import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResponsibleGambling {

    //    @FindBy(xpath = "")
    //    public WebElement ;

    @FindBy(xpath = "//h1")
    public  WebElement bettingRulesTitle;


    //khoi tao
    public ResponsibleGambling() {
        WebDriver driver = WebDriverSingleton.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    public String verifyResponsibleGambling(){
         String actualResult = bettingRulesTitle.getText();
         return actualResult;
    }
    public boolean isResponsibleGamblingPage(){
        String expectedResult = "Responsible Gaming";
        System.out.printf(verifyResponsibleGambling());
        return verifyResponsibleGambling().equals(expectedResult);
    }



}
