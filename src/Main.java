import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) {

        // SetUp Chrome drive Path
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Documents/KolabsLLC/chromedriver");

        // Create new chrome drive (after this below code, a chrome will be created)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600, 900));

        // Navigate chrome to this address
        driver.get("http://stag.7sports.co");

        // Change language
        WebElement elementSelect = ((ChromeDriver) driver).findElementByXPath("//select");
        Select select = new Select(elementSelect);
        select.selectByValue("enGB");

        /*
         * 2 important step when working with selenium
         *
         * + Find Element
         * + Do action on element that was found
         *
         * */

        // Find element UserName

        // TagName: <input, <header, <div
        // WebElement userName = ((ChromeDriver) driver).findElementByTagName("input");

        // Classname: <div class="container">
        // WebElement userName = ((ChromeDriver) driver).findElementByClassName("container");

        // Name <din name="referrer">
        // WebElement userName = ((ChromeDriver) driver).findElementByName("referrer");

        WebElement userName = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='USERNAME']");

        // Do action on element Username
        userName.sendKeys("qcAA02000");


        WebElement passWord = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='PASSWORD']");
        passWord.sendKeys("12345678");

        WebElement login = ((ChromeDriver) driver).findElementByXPath("//span[text()='Sign-In']");
        login.click();
    }
}
