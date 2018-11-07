package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//div[@id='existTicket'][@class!='Hide']//span[text()='Place bet']")
    public WebElement placebetBtn;

    @FindBy(xpath = "//a[contains(@class,'periodName_0 betSideName_0')]")
    public WebElement odd;

    @FindBy(id = "stakeTicket")
    public WebElement stake;

    public HomePage (WebDriver driver1){
        driver=driver1;
        PageFactory.initElements(driver,this);
    }

    public void SelectOdd(){
        try{
            Thread.sleep(10000);
        }catch(Exception ex){
        }
        odd.click();
    }

    public void InputSteak(){
        stake.sendKeys("51");
    }

    public void ClickPlaceBet(){
        placebetBtn.click();
    }
}
