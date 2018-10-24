import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\Setup Automation\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://qa.7sports.co");
        driver.manage().window().maximize();

       WebElement Language= ((ChromeDriver) driver).findElementByXPath("//*[@id=\"app\"]/div/div/section/div/div/div/div[1]/select");
        Select dropdown= new Select(Language);
        dropdown.selectByVisibleText("English");

        //Find element & do action
        WebElement user= ((ChromeDriver) driver).findElementById("username");
        user.sendKeys("QAGIANG001");

        WebElement pass= ((ChromeDriver) driver).findElementById("password");
        pass.sendKeys("123456");

        WebElement lgbtn=((ChromeDriver) driver).findElementByXPath("//*[@id=\"app\"]/div/div/section/div/div/div/a/span");
        lgbtn.click();







    }
}
