import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//a[contains(@class,'periodName_0 betSideName_0')]")
    public WebElement oddElement;

    @FindBy(id = "stakeTicket")
    public WebElement stakeElement;

    @FindBy(xpath = "//div[@id='existTicket'][not(@class='hide')]//span[text()='Place bet']")
    public WebElement placbetElement;

    WebDriver driver;

    // Khoi tao
    public HomePage(WebDriver driver1) {
        driver = driver1;
        PageFactory.initElements(driver, this);
    }

    public void clickOdd() {
        // Step1: Click on ODD
        oddElement.click();
    }

    public void enterStake() {
        // Step2: Enter Stake
        stakeElement.sendKeys("10");
    }


    public void clickPlacebet() {
        // Step3: Cick Place Bet
        placbetElement.click();
    }
}
