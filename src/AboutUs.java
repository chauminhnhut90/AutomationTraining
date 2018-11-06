import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {

    @FindBy(xpath = "//h1")
    public WebElement aboutus;


    WebDriver driver;

    public AboutUs(WebDriver driver3) {

        driver = driver3;
        //tuc la dang dung pageobject va page home
        PageFactory.initElements(driver, this);
    }

    public String get_title() {
        return aboutus.getText();

    }


}






