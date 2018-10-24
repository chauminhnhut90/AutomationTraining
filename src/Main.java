import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/huy/Desktop/auto/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa.7sports.co/login");

        WebElement element = ((ChromeDriver) driver).findElementById("username1");
        element.sendKeys("huy30011222");

        WebElement element2 = ((ChromeDriver) driver).findElementById("password");
        element2.sendKeys("123456789");


        WebElement element3 = ((ChromeDriver) driver).findElementByXPath("//*[@id='app']/div/div/section/div/div/div/a/span");
        element3.click();


    }
}
