import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class TestNGScript {
    private String userName = "vip0000000";
    private String passWord = "123456";
    private LoginPage loginPage;
    private HomePage homePage;
    private AboutUs aboutUs;
    private BettingRules bettingRules;
    private PrivacyPolicy privacyPolicy;
    private ResponsibleGambling responsibleGambling;

    @BeforeTest
    public void setUp() {

        this.loginPage = new LoginPage();
        this.homePage = new HomePage();
        this.aboutUs = new AboutUs();
        this.loginPage.go();
        this.loginPage.changeLanguage();
        this.bettingRules = new BettingRules();
        this.privacyPolicy = new PrivacyPolicy();
        this.responsibleGambling = new ResponsibleGambling();
    }


    @Test()
    public void verifyAboutUsPage() {

        loginPage.goToAbout();
        homePage.switchToNewWindow();
        boolean isAboutUSPage = aboutUs.isAboutUSPage();
        System.out.printf("[TestNGScript][verifyAboutUsPage]" + isAboutUSPage);
        Assert.assertTrue(isAboutUSPage, "[TestNGScript][verifyAboutUsPage] Test with failure");

    }

    @Test()
    public void verifyBettingRulePage() {
        loginPage.goToBettingRules();
        homePage.switchToNewWindow();
        bettingRules.isBettingRulesPage();
        boolean isBettingRules = bettingRules.isBettingRulesPage();
        System.out.println("[TestNGScript][verifyBettingRulePage]" + isBettingRules);

        Assert.assertTrue(isBettingRules, "[TestNGScript][verifyBettingRulePage] Test with failure");
    }

    @Test()
    public void verifyPrivacyPolicyPage() {
        loginPage.goToPrivacyPolicy();
        homePage.switchToNewWindow();
        privacyPolicy.isPrivacyPolicy();
        boolean isPrivacyPolicy = privacyPolicy.isPrivacyPolicy();
        System.out.println("[TestNGScript][Privacy Policy]" + isPrivacyPolicy);
        Assert.assertTrue(isPrivacyPolicy, "fail");
    }

    @Test()
    public void verifyResponsibleGamblingPage() {
        loginPage.goToResponsibleGambling();
        homePage.switchToNewWindow();
        responsibleGambling.isResponsibleGamblingPage();
        boolean isResponsibleGambling = responsibleGambling.isResponsibleGamblingPage();
        System.out.println("verifyResponsibleGamblingPage: " + isResponsibleGambling);
        Assert.assertTrue(isResponsibleGambling, "fail");
        WebDriverSingleton.getInstance().getDriver().close();

    }

    @Test(enabled = false)
    public void login() {
        //Login

        loginPage.login(userName, passWord);
    }

    //
    @Test(enabled = false)
    public void bet() {

        //        Take a Bet
//        loginPage.login(userName, passWord);
        homePage.clickOdd();
        homePage.enterStake();
        homePage.clickPlace();
        homePage.printTicket();
        homePage.findTicketID();
        String id3 = homePage.findTicketID();
        String[] info = homePage.printTicket();

        //Go to Bet List
        homePage.goToBetList();
        homePage.switchToNewWindow();
        homePage.findticketIDBL(id3);
        homePage.printChoiceBetList(info);
    }


    @AfterTest
    public void tearDown() {
        System.out.printf("[closeChrome]");
        WebDriverSingleton.getInstance().getDriver().quit();
    }

}
