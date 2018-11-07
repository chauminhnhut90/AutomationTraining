package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResponsibleGamblingPage {
    WebDriver driver;

    @FindBy(xpath = "//h1[text()='Responsible Gaming']")
    public WebElement ResponsibleGamingPageTitle;

    public ResponsibleGamblingPage(WebDriver driver1){
        driver = driver1;
        PageFactory.initElements(driver,this);
    }

    public String getResponsibleGamblingTitle(){
        return ResponsibleGamingPageTitle.getText();
    }
}
