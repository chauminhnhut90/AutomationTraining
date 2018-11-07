import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    //    @FindBy(xpath = "")
    //    public WebElement ;
    @FindBy(xpath = "//select")
    public WebElement elementSelect;

    @FindBy(xpath = "//input[@placeholder = 'USERNAME']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@placeholder='PASSWORD']")
    public WebElement inPutPassWord;

    @FindBy(linkText = "Sign-In")
    public WebElement btnLogin;

    @FindBy(linkText = "About Us")
    public static WebElement about;

    @FindBy(linkText = "Betting Rules")
    public static WebElement bettingRules;

    @FindBy(linkText = "Privacy Policy")
    public static WebElement privacyPolicy;

    @FindBy(linkText = "Responsible Gambling")
    public static WebElement responsibleGambling;

    //khoi tao
    public LoginPage() {
        WebDriver driver = WebDriverSingleton.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    public void go() {


        // Navigate chrome to this address
        WebDriverSingleton.getInstance().getDriver().get("https://stag.7sports.co");
    }


    public void changeLanguage() {

        Select select = new Select(elementSelect);
        select.selectByValue("enGB");

    }
    public void goToAbout() {
        about.click();
    }

    public void goToBettingRules() {
        bettingRules.click();
    }

    public void goToPrivacyPolicy(){
        privacyPolicy.click();
    }

    public void goToResponsibleGambling(){
        responsibleGambling.click();
    }


    public void enterUserNAme(String userName) {
        inputUserName.sendKeys(userName);
    }

    public void enterPassword(String passWord) {
        inPutPassWord.sendKeys(passWord);

    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void login(String username, String password){
        enterUserNAme(username);
        enterPassword(password);
        clickLogin();
    }
}
