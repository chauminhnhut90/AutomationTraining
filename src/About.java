import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class About {
    WebDriver driver;

    @FindBy(xpath = "//h1[text()=\"About Us\"]")
    public WebElement title;


    public About(WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver1, this);
    }

    public String gettitle (){
        return title.getText();
    }

}
