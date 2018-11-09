package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    @FindBy(xpath = "//select")
    public WebElement elementSelect;

    @FindBy(xpath = "//input[@placeholder='USERNAME']")
    public WebElement user;

    @FindBy(xpath = "//input[@placeholder='PASSWORD']")
    public WebElement pass;

    @FindBy(xpath = "//span[text()='Sign-In']")
    public WebElement lgbtn;

    @FindBy(xpath ="//span[text()='About Us']" )
    public WebElement about;

    @FindBy(xpath ="//span[text()='Betting Rules']")
    public WebElement betting;

    @FindBy(xpath = "//span[text()='Privacy Policy']")
    public  WebElement privacy;

    @FindBy(xpath ="//span[text()='Responsible Gambling']")
    public WebElement responsible;

    WebDriver driver;

    public LoginPage(WebDriver driver1) {
        driver = driver1;
        PageFactory.initElements(driver,this);
    }

    public void goTo() {
        driver.get("http://stag.7sports.co");
    }

    public void selectlanguage() {
       // WebElement elementSelect = ((ChromeDriver) driver).findElementByXPath("//select");
        Select select = new Select(elementSelect);
        select.selectByValue("enGB");
    }


    public void enterUser( String userName) {
       // WebElement user = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='USERNAME']");
        user.sendKeys(userName);

    }


    public void enterPass( String pWord){
      //  WebElement pass= ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='PASSWORD']");
        pass.sendKeys(pWord);

    }


    public void clickLogin(){
       // WebElement lgbtn=((ChromeDriver) driver).findElementByXPath("//span[text()='Sign-In']");
        lgbtn.click();

    }

    public void clickabout() {
        about.click();
    }

    public void clickbettingrule() {
       betting.click();
    }

    public  void clickprivacy(){
        privacy.click();
    }

    public void clickresponsible(){
        responsible.click();
    }

}

