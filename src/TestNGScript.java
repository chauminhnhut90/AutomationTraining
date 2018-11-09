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

    @Test(enabled = false)
    public void verifyAboutUsPage() {
        // SetUp Chrome drive Path
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Documents/KolabsLLC/chromedriver");

        // Create new chrome drive (after this below code, a chrome will be created)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // B1: navigate to lognPage
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.selectLanguage();

        // B2: Click on About Us button
        loginPage.clickAboutUs();

        // B3: Check About US test display

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        AboutUsPage page = new AboutUsPage(driver);
        String title = page.getTitle();
        boolean result = title.equals("About Us");
        driver.quit();
        Assert.assertTrue(result, "Do not display ABOUT US title");
    }

    @Test(enabled = false)
    public void verifyBettingRulesPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Documents/KolabsLLC/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.selectLanguage();
        loginPage.clickBettingRules();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        BettingRulesPage page = new BettingRulesPage(driver);
        String title = page.getTitle();
        boolean result = title.equals("Betting Rules");
        driver.quit();
        Assert.assertTrue(result, "Do not display BETTING RULES title");
    }

    @Test(enabled = false)
    public void verifyPrivatePolicyPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Documents/KolabsLLC/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.selectLanguage();
        loginPage.clickPrivatePolicy();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        PrivatePolicyPage page = new PrivatePolicyPage(driver);
        String title = page.getTitle();
        boolean result = title.equals("Privacy Policy");
        driver.quit();
        Assert.assertTrue(result, "Do not display PRIVATE POLICY title");
    }

    @Test(enabled = false)
    public void verifyResponsibleGamblingPage() {

        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Documents/KolabsLLC/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.selectLanguage();
        loginPage.clickResponsibleGambling();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        ResponsibleGamblingPage page = new ResponsibleGamblingPage(driver);
        String title = page.getTitle();
        boolean result = title.equals("Responsible Gaming");
        driver.quit();
        Assert.assertTrue(result, "Do not display RESPONSIBLE GAMING title");
    }

    @Test(dataProvider = "test1")
    public void verifyLogin(String userName, String passWord) {
        System.out.println(userName + " : " + passWord);

        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Documents/KolabsLLC/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // B1: Navigate to login page
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.selectLanguage();
        loginPage.enterUserName(userName);
        loginPage.enterPW(passWord);
        loginPage.clickLogin();

        // B2: Enter User, PW

        // B3: Click login button
    }

    @DataProvider(name = "test1", parallel = true)
    public Object[][] createData1() {
        return new Object[][]{
                {"qcAA02000", "12345678"},
                {"qcAA03000", "12345678"},
                {"qcAA02000", "12345678"}
        };
    }


}
