package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class ResponsibleGaming {

    @FindBy(xpath ="//span[text()='Responsible Gambling']")
    public WebElement Responsible_title;

    WebDriver driver;
    public ResponsibleGaming(WebDriver driver1) {
        driver = driver1;
        PageFactory.initElements(driver,this);
    }

    public  String getResponsibleTitle(){ return Responsible_title.getText();}

}
