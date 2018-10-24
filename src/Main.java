import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/WebdriverChrome/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://stag.7sports.co/");

        //find element
        WebElement element = ((ChromeDriver) driver).findElementById("username");
        //Do action
        element.sendKeys("top0000000");

        WebElement password = ((ChromeDriver) driver).findElementById("password");
        password.sendKeys("123456");

        //find
        WebElement okbtn = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"app\"]/div/div/section/div/div/div/a/span");
        okbtn.click();

    }
}
