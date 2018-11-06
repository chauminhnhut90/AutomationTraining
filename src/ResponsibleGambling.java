import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResponsibleGambling {
    @FindBy(xpath = "//h1")
    public WebElement responsiblegambling;


    WebDriver driver;

    public ResponsibleGambling (WebDriver driver6) {

        driver = driver6;
        //tuc la dang dung pageobject va page home
        PageFactory.initElements(driver, this);
    }

    public String get_title() {
        return responsiblegambling.getText();

    }
}
