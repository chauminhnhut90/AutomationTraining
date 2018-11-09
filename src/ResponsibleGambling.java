import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResponsibleGambling {
    WebDriver driver;

    @FindBy(xpath = "//span[text()=\"Responsible Gambling\"]")
    public WebElement title;


    public ResponsibleGambling(WebDriver driver4) {
        this.driver = driver4;
        PageFactory.initElements(driver4, this);
    }


    public String getitle1(){
        return title.getText();
    }



}
