package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BettingRulesPage {
    WebDriver driver;

    @FindBy(xpath = "//h1[text()='Betting Rules']")
    public WebElement BettingRulesTitle;

    public BettingRulesPage (WebDriver driver1){
        driver = driver1;
        PageFactory.initElements(driver,this);
    }

    public String getBettingRulesTitle(){
        return BettingRulesTitle.getText();
    }
}
