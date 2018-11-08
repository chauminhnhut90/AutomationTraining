import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/huy/Desktop/autohuy/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Login login1 = new Login(driver);
        login1.Goto();
        login1.Changelang();
        login1.clickAbout();
        //driver.getWindowHandles();
        // count tabs
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        About aboutUsPage = new About(driver);

        String title = aboutUsPage.gettitle();
        boolean result = title.equals("About Us");
        Assert.assertTrue("About don't display",result);

        // login1.enUserName()
        // login1.enPassword();
        // login1.clickLogin();
        //Homepage home1 = new Homepage(driver);
        //home1.clickOdd();
        //home1.enstake();
        //home1.clickPlacebet();

//        driver.get("https://stag.7sports.co/login");
//
//        //change language
//        WebElement elementselect = ((ChromeDriver) driver).findElementByXPath("//select");
//        Select select = new Select(elementselect);
//        select.selectByValue("enGB");
//
//
////tagname header,input
//        WebElement element = ((ChromeDriver) driver).findElementByXPath("//input [@placeholder='USERNAME']");
//        element.sendKeys("huy0011222");
//
//        WebElement element2 = ((ChromeDriver) driver).findElementByXPath("//input [@placeholder='PASSWORD']");
//        element2.sendKeys("123456789");
//
//
//        WebElement element3 = ((ChromeDriver) driver).findElementByXPath("//span[text()='Sign-In']");
////        element3.click();
////        try {
////            Thread.sleep(10000);
////        } catch (Exception ex) {
////        }
//
//// step 1 : click on odd ==== //*[@id="app"]/div/div/div/div[1]/main/div/div/div/div[2]/div/div[2]/div[2]/div/table/tbody[1]/tr[2]/td[4]/div/div/div/div/a
//        WebElement oddelementl = ((ChromeDriver) driver).findElementByXPath("//a[contains(@class,'text-nowrap periodName_0 betSideName_0')]");
//        oddelementl.click();
//        //Step 2" Enter stake
//        WebElement Stakebox = ((ChromeDriver) driver).findElementByXPath("//input [@id=\"stakeTicket\"]");
//        Stakebox.sendKeys("10");
//
//        WebElement Placebet = ((ChromeDriver) driver).findElementByXPath("//div[@id='existTicket'][not(@class='hide')]//span[text()=\"Place bet\"]");
//
//
//        Placebet.click();
//
//        try {
//            Thread.sleep(10000);
//        } catch (Exception ex) {
//        }
//        driver.quit();
    }
}
