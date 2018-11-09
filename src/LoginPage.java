import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

    @FindBy(xpath = "//select")
    public WebElement elementSelect;

    @FindBy(xpath = "//input[@placeholder='USERNAME']")
    public WebElement userName;

    @FindBy(xpath = "//input[@placeholder='PASSWORD']")
    public WebElement passWord;

    @FindBy(xpath = "//span[text()='Sign-In']")
    public WebElement login;

    @FindBy(xpath = "//span[text()='About Us']")
    public WebElement aboutUs;

    @FindBy(xpath = "//span[text()='Betting Rules']")
    public WebElement bettingRules;

    @FindBy(xpath = "//span[text()='Privacy Policy']")
    public WebElement privatePolicy;

    @FindBy(xpath = "//span[text()='Responsible Gambling']")
    public WebElement responsibleGambling;

    WebDriver driver;

    // Khoi tao
    public LoginPage(WebDriver driver1) {
        driver = driver1;
        PageFactory.initElements(driver, this);
    }

    // Navigate to login page
    public void goTo() {
        driver.get("http://stag.7sports.co/login");
    }

    public void selectLanguage() {
        Select select = new Select(elementSelect);
        select.selectByValue("enGB");
    }

    public void enterUserName(String user) {
        userName.sendKeys(user);
    }

    public void enterPW(String pw) {
        passWord.sendKeys(pw);
    }

    public void clickLogin() {
        login.click();
    }

    public void clickAboutUs(){
        aboutUs.click();
    }

    public void clickBettingRules(){
        bettingRules.click();
    }

    public void clickPrivatePolicy(){
        privatePolicy.click();
    }

    public void clickResponsibleGambling(){
        responsibleGambling.click();
    }
}
