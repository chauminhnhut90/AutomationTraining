import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

    @FindBy(xpath = "//select")
    public WebElement languageselect;


    @FindBy(xpath = "//input[@placeholder='USERNAME']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//span[text()='Sign-In']")
    public WebElement login;

    @FindBy(xpath ="//span[text()='About Us']")
    public WebElement aboutus ;

    @FindBy(xpath = "//span[text()='Betting Rules']")
    public WebElement bettingrule;

    @FindBy(xpath = "//span[text()='Privacy Policy']")
    public WebElement privacypolicy;

    @FindBy(xpath = "//span[text()='Responsible Gambling']")
    public WebElement responsiblegambling;

    WebDriver driver;

    //khoi tao

    public LoginPage(WebDriver driver1) {

        driver = driver1;
        PageFactory.initElements(driver, this);
    }

    //navigate to login page
    public void NavigatTo() {
        driver.get("https://stag.7sports.co/");
    }

    //Select language
    public void selectlanguage() {
        // WebElement languageselect = ((ChromeDriver) driver).findElementByXPath("//select");
        Select select = new Select(languageselect);
        select.selectByValue("enGB");
    }

    public void enter_username(String user) {
        // find element
        // WebElement element = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='USERNAME']");
        //Do action
       // username.sendKeys("salem0000000"); gang cung
        username.sendKeys(user);

    }

    public void enter_password(String pass) {
        // WebElement password = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='PASSWORD']");
        //password.sendKeys("123456"); day la gang cung
        password.sendKeys(pass);
    }

    public void click_login() {
       // WebElement okbtn = ((ChromeDriver) driver).findElementByXPath("//span[text()='Sign-In']");
        login.click();
    }

    public void click_aboutus(){
//        WebElement aboutus = ((ChromeDriver) driver).findElementByXPath("//span[text()='About Us']");
        aboutus.click();
    }

    public void click_bettingrules(){

        bettingrule.click();
    }

    public void click_privacypolicy(){
        privacypolicy.click();
    }

    public void click_responsiblegambling(){
        responsiblegambling.click();
    }
}
