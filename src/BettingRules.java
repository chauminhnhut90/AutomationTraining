import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BettingRules {

        WebDriver driver;

        @FindBy(xpath = "//span[text()=\"Betting Rules\"]")
        public WebElement title;


        public BettingRules(WebDriver driver2) {
            this.driver = driver2;
            PageFactory.initElements(driver2, this);
        }

        public String gettitle3 (){
            return title.getText();
        }



}
