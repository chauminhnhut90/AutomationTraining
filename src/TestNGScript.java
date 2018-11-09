package src;

import org.junit.Ignore;
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

    @Test (enabled = false)
    public void verifyAboutUsPage(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\Setup Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //   driver.get("http://stag.7sports.co");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //tìm & đợi trong 30s

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.selectlanguage();
        loginPage.clickabout();
        List<String> tabs= new ArrayList<>(driver.getWindowHandles());// list all tabs
        driver.switchTo().window(tabs.get(1));


        AboutUs aboutuspage = new AboutUs(driver);
        String title = aboutuspage.getTitle();
        boolean result=title.equals("About Us");
        driver.quit();
        Assert.assertTrue(result,"Do not display About Us title");


    }


    @Test (enabled = false )
    public void verifyBettingRule(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\Setup Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //   driver.get("http://stag.7sports.co");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //tìm & đợi trong 30s

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.selectlanguage();
        loginPage.clickbettingrule();
        List<String> tabs= new ArrayList<>(driver.getWindowHandles());// list all tabs
        driver.switchTo().window(tabs.get(1));


        BettingRule bettingRule = new BettingRule(driver);
        String Betting_title = bettingRule.getBettingTitle();
        boolean result=Betting_title.equals("Betting Rules");
        driver.quit();
        Assert.assertTrue(result,"Do not display Betting Rules title");


    }


    @Test (enabled = false)
    public void verifyPrivacyPolicy(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\Setup Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //   driver.get("http://stag.7sports.co");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //tìm & đợi trong 30s

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.selectlanguage();
        loginPage.clickprivacy();
        List<String> tabs= new ArrayList<>(driver.getWindowHandles());// list all tabs
        driver.switchTo().window(tabs.get(1));


        PrivacyPolicy  privacyPolicy = new PrivacyPolicy(driver);
        String Privacy_title = privacyPolicy.getPrivacyTitle();
        boolean result=Privacy_title.equals("Privacy Policy");
        driver.quit();
        Assert.assertTrue(result,"Do not display Privacy Policy title");


    }


    @Test (enabled = false )
    public void verifyResponsibleGambling(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\Setup Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //   driver.get("http://stag.7sports.co");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //tìm & đợi trong 30s

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.selectlanguage();
        loginPage.clickresponsible();
        List<String> tabs= new ArrayList<>(driver.getWindowHandles());// list all tabs
        driver.switchTo().window(tabs.get(1));


        ResponsibleGaming  responsibleGaming = new ResponsibleGaming(driver);
        String Responsible_title = responsibleGaming.getResponsibleTitle();
        boolean result=Responsible_title.equals("Responsible Gambling");
        driver.quit();
        Assert.assertTrue(result,"Do not display Responsible Gaming title");


    }


    @Test(dataProvider = "test1")
    public void verifyLogin( String userName, String passWord){

    System.out.println(userName + ":" + passWord);
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\Setup Automation\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    //   driver.get("http://stag.7sports.co");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //tìm & đợi trong 30s

    //B1: Navigate to Login page
     LoginPage loginPage = new LoginPage(driver);
     loginPage.goTo();
     loginPage.selectlanguage();
     loginPage.enterUser(userName);
     loginPage.enterPass(passWord);
     loginPage.clickLogin();


    // B2: Enter User/Pass

    //B3: Click Login


    }

    @DataProvider(name = "test1",parallel = true)
    public Object[][] createData1() {
        return new Object[][] {
                { "QCGIANG003", "654321"},
                { "QCGIANG001", "123456"},
        };
    }



}
