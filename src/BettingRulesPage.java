import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BettingRulesPage {

    @FindBy(tagName = "h1")
    public WebElement title;

    WebDriver driver;

    // Khoi tao
    public BettingRulesPage(WebDriver driver1) {
        driver = driver1;
        PageFactory.initElements(driver, this);
    }

    public String getTitle(){
        return title.getText();
    }

}
