package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAgentPage {
    WebDriver driver;
    @FindBy(id = "txtusername")
    public WebElement usernametxt;

    @FindBy(id = "txtpassword")
    public WebElement passwordtxt;

    @FindBy(xpath = "//button[@key='k_login_button_login']")
    public WebElement LoginButton;

    public LoginAgentPage(WebDriver driver1){
        driver=driver1;
        PageFactory.initElements(driver,this);
    }

    public void Login(){
        driver.get("http://7qa.win68.net/");
        usernametxt.sendKeys("CashAdminAnh");
        passwordtxt.sendKeys("789987");
        LoginButton.click();
    }
}
