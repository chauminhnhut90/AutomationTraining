package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id="stakeTicket")
    public WebElement stake;

    @FindBy(xpath = "//a[contains(@class,'periodName_0 betSideName_1')]")
    public  WebElement  Odd;

    @FindBy(xpath = "//div[@id='existTicket'][not(@class='hide')]//span[text()='Place bet']")
    public WebElement betlg;


    WebDriver driver;

    public HomePage(WebDriver driver1) {
        driver = driver1;
        PageFactory.initElements(driver,this);
    }

    public  void clickOdd(){
        try {
            Thread.sleep(10000);
        }catch (Exception ex) {
       }
            //  WebElement Odd= ((ChromeDriver) driver).findElementByXPath("//table[@class='table table-today ']//tbody[1]//tr[2]/td[4]");
       Odd.click();

    }


    public void enterStake(){
    //    WebElement stake=  ((ChromeDriver) driver).findElementById("stakeTicket");
       stake.sendKeys("10");
    }


    public void placeBet(){

      //  WebElement betlg= ((ChromeDriver) driver).findElementByXPath("//div[@id='existTicket'][not(@class='hide')]//span[text()='Place bet']");//ko phai class hide
       betlg.click();

    }
}
