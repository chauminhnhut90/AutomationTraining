package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicy {

    @FindBy(xpath = "//span[text()='Privacy Policy']")
    public WebElement Privacy_title;

    WebDriver driver;
    public PrivacyPolicy(WebDriver driver1) {
        driver = driver1;
        PageFactory.initElements(driver,this);
    }

    public  String getPrivacyTitle(){return Privacy_title.getText();}
}
