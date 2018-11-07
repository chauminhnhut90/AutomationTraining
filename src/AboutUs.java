package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {
    @FindBy(xpath = "//h1[text()='About Us']")
    public WebElement title;

    WebDriver driver;
    public AboutUs(WebDriver driver1) {
        driver = driver1;
        PageFactory.initElements(driver,this);
    }

    public String getTitle(){
            return title.getText();
    }
}
