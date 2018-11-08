import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Login {
    @FindBy(xpath = "//select")
    public WebElement elementselect;

    @FindBy(xpath = "//input [@placeholder='USERNAME']")
    public WebElement element1;

    @FindBy(xpath = "//input [@placeholder='PASSWORD']")
    public WebElement element2;

    @FindBy(xpath = "//span[text()='Sign-In']")
    public WebElement element3;

    @FindBy(xpath = "//span[text()=\"About Us\"]")
    public WebElement element4;


    WebDriver driver;

    public Login(WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver1, this);

    }

    public void Goto() {
        this.driver.get("https://stag.7sports.co/login");
    }

    public void Changelang() {
        //WebElement elementselect = ((ChromeDriver) driver).findElementByXPath("//select");
        Select select = new Select(elementselect);
        select.selectByValue("enGB");
    }

    public void enUserName() {
        //  WebElement element1 = ((ChromeDriver) driver).findElementByXPath("//input [@placeholder='USERNAME']");
        element1.sendKeys("huy0011222");
    }

    public void enPassword() {
        //  WebElement element2 = ((ChromeDriver) driver).findElementByXPath("//input [@placeholder='PASSWORD']");
        element2.sendKeys("123456789");
    }

    // Tim` About

    public void clickAbout() {
        //  WebElement element2 = ((ChromeDriver) driver).findElementByXPath("//input [@placeholder='PASSWORD']");
        element4.click();
    }


    public void clickLogin() {
        // WebElement element3 = ((ChromeDriver) driver).findElementByXPath("//span[text()='Sign-In']");
        element3.click();
        try {
            Thread.sleep(10000);
        } catch (Exception ex) {
        }
    }
}