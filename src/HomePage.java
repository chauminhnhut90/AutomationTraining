import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class HomePage {

    @FindBy(xpath = "//a[contains(@class,'periodName_0 betSideName_1')]")
    public WebElement odd;

    @FindBy(id = "stakeTicket")
    public WebElement stake;

    @FindBy(xpath = "//div[@id='existTicket'][not(@class='hide')]//span[text()='Place bet']")
    public WebElement placeBet;

    @FindBy(xpath = "//div[contains(@class,'pendingBet__content')]/div[contains(@class,'ticketSummary')][1]")
    public WebElement ticket;

    @FindBy(xpath = "//div[@class='pendingBet__content']/div[contains(@class,'ticketSummary')][1]//span[@class='code__number ']")
    public WebElement idBetslip;

    @FindBy(linkText = "Bet List")
    public WebElement betlist;

    @FindBy(xpath = "//table[contains(@class,'table-popup table_betList')]//td[contains(@class,'text-center')][2]//b[contains(@class,'text-blue-dark')]")
    public WebElement idBetList;

    @FindBy(xpath = "//tbody//tr[1]//div[contains(@class,'ticketName')]")
    public WebElement choice;

    @FindBy(xpath = "//div[contains(@class,'pendingBet__content')]/div[contains(@class,'ticketSummary')][1]//div[contains(@class,'detail')]//div[contains(@class,'betSelect')]")
    public WebElement teamBet1;

    @FindBy(xpath = "//tbody//tr[1]//div[contains(@class,'ticketName')]//div//div[@class=\"betInfoName\"]")
    public WebElement teamBet2;

    @FindBy(xpath = "//div[contains(@class,'pendingBet__content')]/div[contains(@class,'ticketSummary')][1]//div[contains(@class,'detail')]//div[contains(@class,'league')]")
    public WebElement leagueBet1;

    @FindBy(xpath = "//tbody//tr[1]//div[contains(@class,'ticketName')]//strong[contains(@class,'leagueName')][1]")
    public WebElement leagueBet2;

    @FindBy(xpath = "//div[contains(@class,'pendingBet__content')]/div[contains(@class,'ticketSummary')][1]//div[contains(@class,'total')]/div[contains(@class,'text-grey')]")
    public WebElement typeBet1;

    @FindBy(xpath = "//tbody//tr[1]//div[contains(@class,'ticketName')]//div//b[contains(@class,'text-blue-dark')]")
    public WebElement typeBet2;


    //khoi tao
    public HomePage() {
        PageFactory.initElements(WebDriverSingleton.getInstance().getDriver(), this);
    }


    public void clickOdd() {
        try {
            Thread.sleep(10000);
        } catch (Exception ex) {
            System.out.println(ex + "error in code");
        }

        //        //step1: click on Odd
        odd.click();
    }

    public void enterStake() {
        //Step 2: Enter Stake
        stake.sendKeys("50");
    }

    public void clickPlace() {
        //Step 3: Click Place Bet

        placeBet.click();
        try {
            Thread.sleep(5000);
        } catch (Exception ex) {
            System.out.println(ex + "error in code");
        }

        Alert alert = WebDriverSingleton.getInstance().getDriver().switchTo().alert();
        alert.accept();
    }

    public String[] printTicket() {

//        try {
//            Thread.sleep(20000);
//        } catch (Exception ex) {
//            System.out.println(ex + "error in code");
//        }

        WebDriverSingleton.getInstance().getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        System.out.println("Ticket Info:" + ticket.getText());
        String[] betSlip = new String[3];
        betSlip[0] = teamBet1.getText().replaceAll(" ","");
        betSlip[1] = leagueBet1.getText().replaceAll(" ","");
        betSlip[2] = typeBet1.getText().replaceAll(" ","");
        for (int i = 0; i < betSlip.length; i++) {
            System.out.println("[" + i + "]:" + betSlip[i]);

        }
        return betSlip;

    }

    public String findTicketID() {
//        try {
//            Thread.sleep(1000);
//        } catch (Exception ex) {
//            System.out.println(ex + "error in code");
//        }
        WebDriverSingleton.getInstance().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String id1 = idBetslip.getText();
        System.out.println("id ticket on Bet Slip" + id1);
        return id1;
    }

    public void goToBetList() {
        betlist.click();
    }

    public void switchToNewWindow() {
        // Switch to new window opened
        WebDriver driver = WebDriverSingleton.getInstance().getDriver();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public void findticketIDBL(String v) {
//        try {
//            Thread.sleep(2000);
//        } catch (Exception ex) {
//            System.out.println(ex + "error in code");
//        }
        WebDriver driver = WebDriverSingleton.getInstance().getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String id2 = idBetList.getText().replace("Ref No: ", "");

        System.out.println("Id ticket on Bet List" + id2);

        if (v.equals(id2)) {
            System.out.println("This ticket exist on Bet List");
        } else {
            System.out.println("This ticket isn't exist on Bet List");
        }
    }

    public void printChoiceBetList(String[] x) {
        System.out.println("Choice:" + choice.getText());
        System.out.println("team name bet:" + teamBet2.getText());
        System.out.println("league name bet:" + leagueBet2.getText());
        System.out.println("type bet:" + typeBet2.getText());

        String[] list = new String[3];
        list[0] = teamBet2.getText().replaceAll(" ","");
        list[1] = leagueBet2.getText().replaceAll(" ","");
        list[2] = typeBet2.getText().replaceAll(" ","").replace("/","");
        for (int i = 0; i < list.length; i++) {
            System.out.println("[" + i + "]" + list[i]);
        }
        if (Arrays.equals(x, list)) {
            System.out.println("Info of ticket is shown correctly");
        } else {
            System.out.println("Info of ticket is shown incorrectly ");
        }


    }


}
