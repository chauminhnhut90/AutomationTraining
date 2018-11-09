import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class testNGScript {

    @Test (enabled = false)
    public void verifyAboutUsPage() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/huy/Desktop/autohuy/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Login login1 = new Login(driver);
        login1.Goto();
        login1.Changelang();
        login1.clickAbout();

        driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        About aboutUsPage = new About(driver);

        String title = aboutUsPage.gettitle();
        boolean result = title.equals("About Us");
        Assert.assertTrue("About don't display", result);
    }

    @Test (enabled = false)
    public void verifyResponsibleGambling() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/huy/Desktop/autohuy/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Login login1 = new Login(driver);
        login1.Goto();
        login1.Changelang();
        login1.clickResponsibleGambling();
        driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        About aboutUsPage = new About(driver);
        BettingRules bettingRules = new BettingRules(driver);
        ResponsibleGambling responsibleGambling = new ResponsibleGambling(driver);
        String title = responsibleGambling.getitle1();
        boolean result = title.equals("Responsible Gambling");
        Assert.assertTrue("Responsible Gaming don't display", result);


    }

    @Test (enabled = false)
    public void verifyPrivacyPolicy() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/huy/Desktop/autohuy/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Login login1 = new Login(driver);
        login1.Goto();
        login1.Changelang();
        login1.clickPrivacyPolicy();
        //driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        About aboutUsPage = new About(driver);
        BettingRules bettingRules = new BettingRules(driver);
        ResponsibleGambling responsibleGambling = new ResponsibleGambling(driver);
        PrivacyPolicy privacyPolicy = new PrivacyPolicy(driver);


        String title = privacyPolicy.gettitle2();
        boolean result = title.equals("Privacy Policy");
        Assert.assertTrue("Privacy Policy don't display", result);


    }

   @Test (enabled = false)
    public void verifyBettingRules() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/huy/Desktop/autohuy/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Login login1 = new Login(driver);
        login1.Goto();
        login1.Changelang();
        login1.clickBettingRules();
        driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        About aboutUsPage = new About(driver);
        BettingRules bettingRules = new BettingRules(driver);
        ResponsibleGambling responsibleGambling = new ResponsibleGambling(driver);
        PrivacyPolicy privacyPolicy = new PrivacyPolicy(driver);


        String title = bettingRules.gettitle3();
        boolean result = title.equals("Betting Rules");
        Assert.assertTrue("Betting Rules don't display", result);

    }

    @Test(dataProvider = "test1")
    public void verifyLogin(String userName, String passWord) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/huy/Desktop/autohuy/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(userName + ":" + passWord);
        // B1: Navigate to login page
        Login loginpage = new Login(driver);
        loginpage.Goto();
        loginpage.Changelang();
        // B2: Enter user name.
        loginpage.enUserName(userName);
        loginpage.enPassword(passWord);
        // B3: Click login button

        loginpage.clickLogin();

    }

    @DataProvider(name = "test1" , parallel = true)
    public Object[][] createData1() {
        return new Object[][]{
                {"huy0122333", "12345678"},
                {"huy0122444", "12345678"},
        };
    }

}
