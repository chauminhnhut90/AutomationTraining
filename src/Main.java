import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kolabs1808002\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://7stag.win68.net/");

        WebElement UserNameTxt = ((ChromeDriver) driver).findElementById("txtusername");
        UserNameTxt.sendKeys("anh5");

        WebElement PasswordTxt = ((ChromeDriver) driver).findElementById("txtpassword");
        PasswordTxt.sendKeys("789987");

        WebElement LoginButton = ((ChromeDriver) driver).findElementByXPath("/html/body/div/div/div/div/form/fieldset/button");
        LoginButton.click();
        
    }
}
