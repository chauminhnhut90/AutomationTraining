package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicyPage {
    WebDriver driver;

    @FindBy(xpath = "//h1[text()='Privacy Policy']")
    public WebElement PrivacyPolicyTitle;

    public PrivacyPolicyPage(WebDriver driver1){
        driver = driver1;
        PageFactory.initElements(driver,this);
    }

    public String getPrivacyPolicyTitle(){
        return PrivacyPolicyTitle.getText();
    }
}
