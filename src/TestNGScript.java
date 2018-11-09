package src;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestNGScript {

    @Ignore
    @Test(priority = 4)
    public void checkAboutUsPage(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kolabs1808002\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Member site
        LoginPage loginpage = new LoginPage(driver);
        loginpage.goTo();
        loginpage.SelectLang();
        loginpage.clickAboutUs();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        String title = aboutUsPage.getAboutUsTitle();

        boolean result = title.equals("About Us");
        driver.quit();
        Assert.assertTrue(result, "CANNOT launch About Us Title");
    }

    @Ignore
    @Test(priority = 3)
    public void checkBettingRulesPage(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kolabs1808002\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Member site
        LoginPage loginpage = new LoginPage(driver);
        loginpage.goTo();
        loginpage.SelectLang();
        loginpage.clickBettingRuleLink();

        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));

        BettingRulesPage bettingRulesPage = new BettingRulesPage(driver);
        String pageTitle = bettingRulesPage.getBettingRulesTitle();

        boolean result = pageTitle.equals("Betting Rules");
        driver.quit();
        Assert.assertTrue(result, "CANNOT launch Betting Rules page");
    }

    @Ignore
    @Test(priority = 2)
    public void checkPrivacyPolicyPage(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kolabs1808002\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Member site
        LoginPage loginpage = new LoginPage(driver);
        loginpage.goTo();
        loginpage.SelectLang();
        loginpage.clickPrivacyPolicyLink();

        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));

        PrivacyPolicyPage privacyPolicyPage = new PrivacyPolicyPage(driver);
        String pageTitle = privacyPolicyPage.getPrivacyPolicyTitle();

        boolean result = pageTitle.equals("Privacy Policy");
        driver.quit();
        Assert.assertTrue(result, "CANNOT launch Privacy Policy page");
    }

    @Ignore
    @Test(priority = 1)
    public void checkResponsibleGamblingPage(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kolabs1808002\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Member site
        LoginPage loginpage = new LoginPage(driver);
        loginpage.goTo();
        loginpage.SelectLang();
        loginpage.clickResponsibleGamblingLink();

        List<String> windowslist = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowslist.get(1));

        ResponsibleGamblingPage responsibleGamblingPage = new ResponsibleGamblingPage(driver);
        String pageTitle = responsibleGamblingPage.getResponsibleGamblingTitle();

        boolean result = pageTitle.equals("Responsible Gaming");
        driver.quit();
        Assert.assertTrue(result, "CANNOT launch Responsible Gaming page");
    }

    @Test(dataProvider = "test1")
    public void Login(String userName, String passWord){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kolabs1808002\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        System.out.println(userName + ":" + passWord);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.SelectLang();
        loginPage.InputUsername(userName);
        loginPage.InputPassword(passWord);
        loginPage.ClickSignIn();
    }

    @DataProvider(name = "test1", parallel = true)
    public Object[][] createData1() {
        return new Object[][] {
                { "anh30000000", "789987" },
                { "anh50000000", "12345678" },
        };
    }
}
