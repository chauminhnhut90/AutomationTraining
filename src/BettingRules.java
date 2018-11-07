import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class BettingRules {

    //    @FindBy(xpath = "")
    //    public WebElement ;

    @FindBy(xpath = "//h1")
    public  WebElement bettingRulesTitle;


    //khoi tao
    public BettingRules() {
        WebDriver driver = WebDriverSingleton.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    public String verifyBettingRulesPage(){
         String actualResult = bettingRulesTitle.getText();
         return actualResult;
    }
    public boolean isBettingRulesPage(){
        String expectedResult = "Betting Rules";
        System.out.printf(verifyBettingRulesPage());
        return verifyBettingRulesPage().equals(expectedResult);
    }



}
