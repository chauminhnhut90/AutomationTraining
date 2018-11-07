import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class AboutUs {

    //    @FindBy(xpath = "")
    //    public WebElement ;

    @FindBy(xpath = "//h1")
    public static WebElement aboutPage;


    //khoi tao
    public AboutUs() {
        WebDriver webDriver = WebDriverSingleton.getInstance().getDriver();
        PageFactory.initElements(webDriver, this);
    }

    public String aboutPage() {
//        Switch to windown 1
//    List<String> tabs =new ArrayList<>(driver.getWindowHandles());
//    driver.switchTo().window(tabs.get(1));
        WebDriver webDriver = WebDriverSingleton.getInstance().getDriver();
        webDriver.manage().window().setSize(new Dimension(1600, 900));
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String aboutus1 = aboutPage.getText();
        System.out.println(aboutus1);
        return aboutus1;
    }

    public boolean isAboutUSPage() {

        String expectedResult = "About Us";
        String actualResult = aboutPage();
        return expectedResult.equals(actualResult);
    }


}
