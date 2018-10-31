import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.rmi.CORBA.Util;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        // SetUp Chrome drive Path
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Documents/KolabsLLC/chromedriver");

        // Create new chrome drive (after this below code, a chrome will be created)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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
        userName.sendKeys("qcAA03000");


        WebElement passWord = ((ChromeDriver) driver).findElementByXPath("//input[@placeholder='PASSWORD']");
        passWord.sendKeys("12345678");

        WebElement login = ((ChromeDriver) driver).findElementByXPath("//span[text()='Sign-In']");
        login.click();

        try {
            Thread.sleep(10000);
        }catch (Exception ex){}

        // Step1: Click on ODD
        WebElement oddElement = ((ChromeDriver) driver).findElementByXPath("//a[contains(@class,'periodName_0 betSideName_0')]");
        oddElement.click();

        // Step2: Enter Stake
        WebElement stakeElement = ((ChromeDriver) driver).findElementById("stakeTicket");
        stakeElement.sendKeys("10");

        // Step3: Cick Place Bet
        WebElement placbetElement = ((ChromeDriver) driver).findElementByXPath("//div[@id='existTicket'][not(@class='hide')]//span[text()='Place bet']");
        placbetElement.click();


        // More step: Close Alert popup
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();
        System.exit(1);
    }
}
