package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//select")
    public WebElement selectLang;

    @FindBy(xpath = "//input[@placeholder='USERNAME']")
    public WebElement usernameTxt;

    @FindBy(xpath = "//input[@placeholder='PASSWORD']")
    public WebElement passwordTxt;

    @FindBy(xpath = "//span[text()='Sign-In']")
    public WebElement LoginBtn;

    @FindBy(xpath = "//span[text()='About Us']")
    public WebElement AboutUsLink;

    @FindBy(xpath = "//span[text()='Betting Rules']")
    public WebElement BettingRuleLink;

    @FindBy(xpath = "//span[text()='Privacy Policy']")
    public WebElement PrivacyPolicyLink;

    @FindBy(xpath = "//span[text()='Responsible Gambling']")
    public WebElement ResponsibleGamblingLink;

    public LoginPage(WebDriver driver1){
        driver=driver1;
        PageFactory.initElements(driver,this);
    }

    public void goTo() {
        driver.get("http://stag.7sports.co/");
    }

    public void SelectLang(){
        Select lang = new Select(selectLang);
        lang.selectByValue("enGB");
    }

    public void InputUsername(){
        usernameTxt.sendKeys("anh30000000");
    }

    public void InputPassword(){
        passwordTxt.sendKeys("789987");
    }

    public void ClickSignIn(){
        LoginBtn.click();
    }

    public void clickAboutUs(){
        AboutUsLink.click();
    }

    public void clickBettingRuleLink(){
        BettingRuleLink.click();
    }

    public void clickPrivacyPolicyLink(){
        PrivacyPolicyLink.click();
    }

    public void clickResponsibleGamblingLink(){
        ResponsibleGamblingLink.click();
    }
}
