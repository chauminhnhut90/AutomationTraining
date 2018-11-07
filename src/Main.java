import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;
import org.testng.collections.Lists;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) {
        TestNG testNG = new TestNG();

        List<String> suites = Lists.newArrayList();
        suites.add("./suites/testng.xml");
        testNG.setTestSuites(suites);
        testNG.run();

    }

}
