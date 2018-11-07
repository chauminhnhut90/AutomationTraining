import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {

    private static WebDriverSingleton instance;

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    private WebDriverSingleton() {
        System.setProperty("webdriver.chrome.driver", "/Users/Nhan/Documents/chromedriver");

        // Create new chrome drive (after this below code, a chrome will be created)
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static WebDriverSingleton getInstance() {
        if (instance == null) {
            instance = new WebDriverSingleton();
        }
        return instance;
    }

}
