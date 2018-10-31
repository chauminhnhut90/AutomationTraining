import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        // SetUp Chrome drive Path
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Documents/KolabsLLC/chromedriver");

        // Create new chrome drive (after this below code, a chrome will be created)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.selectLanguage();
        loginPage.enterUserName();
        loginPage.enterPW();
        loginPage.clickLogin();

        HomePage homePage = new HomePage(driver);
        homePage.clickOdd();
        homePage.enterStake();
        homePage.clickPlacebet();
    }
}
