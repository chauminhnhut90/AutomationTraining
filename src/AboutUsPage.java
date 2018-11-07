package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPage {
    WebDriver driver;
    @FindBy(xpath = "//h1[text()='About Us']")
    public WebElement AboutUsPageTitle;

    public AboutUsPage(WebDriver driver1){
        driver=driver1;
        PageFactory.initElements(driver,this);
    }

    public String getAboutUsTitle(){
        return AboutUsPageTitle.getText();
    }
}
