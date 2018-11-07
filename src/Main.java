import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;
import org.testng.collections.Lists;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        TestNG testNG = new TestNG();

        List<String> suites = Lists.newArrayList();
        suites.add("./suites/testng.xml");
        //dau cham la thu muc hien hanh->folder suites->testng.xml
        testNG.setTestSuites(suites);
        testNG.run();


//        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/WebdriverChrome/chromedriver");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().setSize(new Dimension(1600, 900));
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        LoginPage loginpage = new LoginPage(driver);
//        loginpage.NavigatTo();
//        loginpage.selectlanguage();
//
//        try {
//            Thread.sleep(2000);
//        }catch (Exception ex){
//
//        }
//
//        loginpage.click_aboutus();
//
//        //focus vao popup hien ra
//        List<String> tabs = new ArrayList<>(driver.getWindowHandles()); //lay danh sach cua so
//        driver.switchTo().window(tabs.get(1)); //chuyen qua cua so can lam (0) la cua so truoc,
//
//        // Check About us text
//        AboutUs aboutUs = new AboutUs(driver);
//        String title = aboutUs.get_title();
//        if (title.equals("About Us")){
//            System.out.print(true);
//        }else {
//            System.out.print(false);
//        }

        // AboutUs aboutUs = new AboutUs(driver);

        //driver.get("https://stag.7sports.co/");


//        //find element
//        WebElement element = ((ChromeDriver) driver).findElementById("username");
//        //Do action
//        element.sendKeys("0000000");
//
//        WebElement password = ((ChromeDriver) driver).findElementById("password");
//        password.sendKeys("12345678");
//
//         WebElement okbtn = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"app\"]/div/div/section/div/div/div/a/span");
//        okbtn.click();

        //Click About Us

        //WebElement aboutus = ((ChromeDriver) driver).findElementByXPath("//span[text()='About Us']");
        //aboutus.click();

        //Verify 'About Us'

    }
}
