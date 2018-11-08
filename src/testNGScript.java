import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class testNGScript {

    @Test

    public void verifyAboutUsPage (){

        System.setProperty("webdriver.chrome.driver", "C:/Users/huy/Desktop/autohuy/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Login login1 = new Login(driver);
        login1.Goto();
        login1.Changelang();
        login1.clickAbout();
        //driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        About aboutUsPage = new About(driver);

        String title = aboutUsPage.gettitle();
        boolean result = title.equals("About Us");
        Assert.assertTrue("About don't display",!result);




    }
}
