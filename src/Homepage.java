import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    @FindBy(xpath = "//a[contains(@class,'text-nowrap periodName_0 betSideName_0')]")
    public WebElement oddelement1;

    @FindBy (xpath = "//input [@id=\"stakeTicket\"]")
    public WebElement Stakebox;

    @FindBy (xpath = "//div[@id='existTicket'][not(@class='hide')]//span[text()=\"Place bet\"]")
    public WebElement Placebet;


    WebDriver driver;

    public Homepage(WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver1, this);

    }

    public void clickOdd() {
       // WebElement oddelementl = ((ChromeDriver) driver).findElementByXPath("//a[contains(@class,'text-nowrap periodName_0 betSideName_0')]");
        oddelement1.click();
    }

    public void enstake() {
       // WebElement Stakebox = ((ChromeDriver) driver).findElementByXPath("//input [@id=\"stakeTicket\"]");
        Stakebox.sendKeys("10");
    }

    public void clickPlacebet() {
        //WebElement Placebet = ((ChromeDriver) driver).findElementByXPath("//div[@id='existTicket'][not(@class='hide')]//span[text()=\"Place bet\"]");
        Placebet.click();

        try {
            Thread.sleep(10000);
        } catch (Exception ex) {
        }
    }
}