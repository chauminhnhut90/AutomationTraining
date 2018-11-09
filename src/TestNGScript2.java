import org.junit.Ignore;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
@Ignore
public class TestNGScript2 {

    @Test
    public void verifyPrivatePolicyPage() {
        System.out.println("verifyPrivatePolicyPage: " + Thread.currentThread().getId());

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

    @Test
    public void verifyResponsibleGamblingPage() {
        System.out.println("verifyResponsibleGamblingPage: " + Thread.currentThread().getId());

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

}
