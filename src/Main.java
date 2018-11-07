package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestNG;
import src.HomePage;
import src.LoginAgentPage;
import src.LoginPage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        TestNG testNG = new TestNG();

        List<String> suites = new ArrayList<>();
        suites.add("./suites/testng.xml");
        testNG.setTestSuites(suites);

        testNG.run();

//        loginpage.InputUsername();
//        loginpage.InputPassword();
//        loginpage.ClickSignIn();
//
//        HomePage homepage = new HomePage(driver);
//        homepage.SelectOdd();
//        homepage.InputSteak();
//        homepage.ClickPlaceBet();


        //Agent site
//        LoginAgentPage loginAgent = new LoginAgentPage(driver);
//        loginAgent.Login();
//
//        AgentModulesPage modulesMenu = new AgentModulesPage(driver);
//        modulesMenu.ClickModulesMenu();
//        modulesMenu.openMaintenancePage();
//        modulesMenu.selectSportsbookType();
//        modulesMenu.selecteBetLiveCasinoType();
//        modulesMenu.selectP2PlayType();
//        modulesMenu.selectAllMaintenanceTypes();
    }
}
