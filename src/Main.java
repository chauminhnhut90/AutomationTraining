import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        // SetUp Chrome drive Path
        System.setProperty("webdriver.chrome.driver","/Users/macbook/Documents/KolabsLLC/chromedriver");

        // Create new chrome drive (after this below code, a chrome will be created)
        WebDriver driver = new ChromeDriver();

        // Navigate chrome to this address
        // driver.get("http://dev.7sports.co");

        /*
        * 2 important step when working with selenium
        *
        * + Find Element
        * + Do action on element that was found
        *
        * */

        // Find element UserName
        WebElement userName = ((ChromeDriver) driver).findElementById("username");

        // Do action on element Username
        // userName.sendKeys("titeo");


        WebElement passWord = ((ChromeDriver) driver).findElementById("password");
        passWord.sendKeys("123123");

        WebElement login = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"app\"]/div/div/section/div/div/div/a/span");
        login.click();
    }
}
