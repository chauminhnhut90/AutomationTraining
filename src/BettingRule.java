package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BettingRule {

    @FindBy(xpath ="//span[text()='Betting Rules']")
    public WebElement Betting_title;

    WebDriver driver;
    public BettingRule(WebDriver driver1) {
        driver = driver1;
        PageFactory.initElements(driver,this);
    }

    public String getBettingTitle() {return Betting_title.getText();}
}
