import org.junit.Ignore;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
public class TestNGScript {


    @Ignore
    @Test(priority =3, enabled = false)
    public void verifyAboutUsPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/WebdriverChrome/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage loginpage = new LoginPage(driver);
        loginpage.NavigatTo();
        loginpage.selectlanguage();

        try {
            Thread.sleep(2000);
        } catch (Exception ex) {

        }

        loginpage.click_aboutus();

        //focus vao popup hien ra
        List<String> tabs = new ArrayList<>(driver.getWindowHandles()); //lay danh sach cua so
        driver.switchTo().window(tabs.get(1)); //chuyen qua cua so can lam (0) la cua so truoc,

        // Check About us text
        AboutUs aboutUs = new AboutUs(driver);
        String title = aboutUs.get_title();

        boolean result = title.equals("About Us");
        driver.quit();
        Assert.assertTrue(result, "Do not display About Us title");
    }

    //thay doan nay bang doan pro hon o phia tren

    // Assert.assertTrue(!result, "Do not display About Us title");
//        if (title.equals("About Us")) {
//            System.out.print(true);
//        } else {
//            System.out.print(false);
//        }

    // AboutUs aboutUs = new AboutUs(driver);

    //driver.get("https://stag.7sports.co/");
    @Ignore
    @Test(priority = 2, enabled = false)
    public void verifyBettingRulePage() {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/WebdriverChrome/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage loginpage = new LoginPage(driver);
        loginpage.NavigatTo();
        loginpage.selectlanguage();

        try {
            Thread.sleep(2000);
        } catch (Exception ex) {

        }

        loginpage.click_bettingrules();

        //focus vao popup hien ra
        List<String> tabs = new ArrayList<>(driver.getWindowHandles()); //lay danh sach cua so
        driver.switchTo().window(tabs.get(1)); //chuyen qua cua so can lam (0) la cua so truoc,

        // Check About us textBettingRule
        BettingRule bettingRule = new BettingRule(driver);
        String title = bettingRule.get_title();

        boolean result = title.equals("Betting Rules");
        driver.quit();
        Assert.assertTrue(result, "Do not display Betting  title");


    }

    @Ignore //the purpose is to skip running this case
    @Test(priority = 1, enabled = false)
    public void verifyPrivacyPolicyPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/WebdriverChrome/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage loginpage = new LoginPage(driver);
        loginpage.NavigatTo();
        loginpage.selectlanguage();

        try {
            Thread.sleep(2000);
        } catch (Exception ex) {

        }

        loginpage.click_privacypolicy();

        //focus vao popup hien ra
        List<String> tabs = new ArrayList<>(driver.getWindowHandles()); //lay danh sach cua so
        driver.switchTo().window(tabs.get(1)); //chuyen qua cua so can lam (0) la cua so truoc,

        // Check About us textBettingRule
        PrivacyPolicy privacypolicy = new PrivacyPolicy(driver);
        String title = privacypolicy.get_title();

        boolean result = title.equals("Privacy Policy");
        driver.quit();
        Assert.assertTrue(result, "Do not display Privacy Policy  title");


    }

    @Ignore
    @Test (enabled = false)
    //muon chay song song, tao 1 folder suites trong file trong o dia, copy suite code dang vo file xml
    //@Test(enabled = false) ko cho chay 1 case
    //@Test(priority = 0) uu tien chay truoc
    //Day dung cho test NG, can verify gi viet vo day
    public void verifyResponsibleGamblingPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/WebdriverChrome/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage loginpage = new LoginPage(driver);
        loginpage.NavigatTo();
        loginpage.selectlanguage();

        try {
            Thread.sleep(2000);
        } catch (Exception ex) {

        }

        loginpage.click_responsiblegambling();

        //focus vao popup hien ra
        List<String> tabs = new ArrayList<>(driver.getWindowHandles()); //lay danh sach cua so
        driver.switchTo().window(tabs.get(1)); //chuyen qua cua so can lam (0) la cua so truoc,

        // Check About us textBettingRule
        ResponsibleGambling responsiblegambling = new ResponsibleGambling(driver);
        String title = responsiblegambling.get_title();

        boolean result = title.equals("Responsible Gaming");
        driver.quit();
        Assert.assertTrue(result, "Do not display Responsible Gaming title");


    }

    @Test (dataProvider = "test1")
    public void verifyLogin (String username, String password){

        System.out.println(username + ";" + password);

        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/WebdriverChrome/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Navigate to login page
        LoginPage loginPage = new LoginPage(driver);
        loginPage.NavigatTo();
        loginPage.selectlanguage();
        loginPage.enter_username(username);
        loginPage.enter_password(password);
        loginPage.click_login();
        //Enter Username and Password

        //Click Login
        
    }


    @DataProvider(name = "test1", parallel = true)
    public Object[][] createData1() {
        return new Object[][] {
                { "Salem0000001", "123456" },
                { "Salem0000001", "123456"},
                { "Salem0000001", "123456" },
                { "Salem0000001", "123456"},
//                { "Salem0000001", ""},
//                { "", ""},
//                { "", "123456"},
        };
    }

}
