package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgentModulesPage {
    WebDriver driver;

    @FindBy(xpath = "//span[@key='k_nav_modules']")
    public WebElement ModulesMenu;

    @FindBy(xpath = "//span[@key='k_nav_modules_maintenance']")
    public WebElement MaintenanceMenu;

    @FindBy(id = "txtotp")
    public WebElement PINtxt;

    @FindBy(xpath= "//form[@action='/User/OTP?returnUrl=%2Fmodules%2Fmaintenance']//span[@key='k_btn_ok']")
    public WebElement pinOKBtn;

    @FindBy(id = "chk_maintenance_1")
    public WebElement sportsbookChB;

    @FindBy(id = "chk_maintenance_2")
    public WebElement ebetChB;

    @FindBy(id = "chk_maintenance_3")
    public WebElement p2playChB;

    @FindBy(id = "chkAll")
    public WebElement allTypes;

    @FindBy(id = "btn-maintenance-update")
    public WebElement maintenanceUpdateBtn;

    @FindBy(xpath = "//div[@class='notifyjs-bootstrap-base notifyjs-bootstrap-success']")
    public WebElement updateSuccessfulDialog;

    public AgentModulesPage(WebDriver driver1){
        driver=driver1;
        PageFactory.initElements(driver,this);
    }

    public void ClickModulesMenu(){
        ModulesMenu.click();
    }

    public void enterPINAgent(){
        PINtxt.sendKeys("123456");
        pinOKBtn.click();
    }

    public void openMaintenancePage(){
        MaintenanceMenu.click();
        if(driver.findElement(By.id("txtotp")).isDisplayed()){
            enterPINAgent();
        }
    }

    public void waitUntilUpdateSuccessfulDialogDisappear(){
            WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='notifyjs-bootstrap-base notifyjs-bootstrap-success']")));
    }

    public void selectSportsbookType(){
       if (driver.findElement(By.id("chk_maintenance_1")).isSelected() == false) {
           if (driver.findElement(By.xpath("//div[@class='notifyjs-bootstrap-base notifyjs-bootstrap-success']")).isDisplayed()) {
               waitUntilUpdateSuccessfulDialogDisappear();
           }
           sportsbookChB.click();
           maintenanceUpdateBtn.click();
       }
    }

    public void selecteBetLiveCasinoType(){
        waitUntilUpdateSuccessfulDialogDisappear();
        if(driver.findElement(By.id("chk_maintenance_2")).isSelected()==false) {
            ebetChB.click();
            maintenanceUpdateBtn.click();
        }
    }

    public void selectP2PlayType(){
        waitUntilUpdateSuccessfulDialogDisappear();
        if(driver.findElement(By.id("chk_maintenance_3")).isSelected()==false) {
            p2playChB.click();
            maintenanceUpdateBtn.click();
        }
    }

    public void selectAllMaintenanceTypes(){
        if(driver.findElement(By.id("chk_maintenance_3")).isSelected()) {
            waitUntilUpdateSuccessfulDialogDisappear();
            p2playChB.click();
            maintenanceUpdateBtn.click();
        }
        if(driver.findElement(By.id("chk_maintenance_2")).isSelected()) {
            waitUntilUpdateSuccessfulDialogDisappear();
            ebetChB.click();
            maintenanceUpdateBtn.click();
        }
        if(driver.findElement(By.id("chk_maintenance_1")).isSelected()) {
            waitUntilUpdateSuccessfulDialogDisappear();
            sportsbookChB.click();
            maintenanceUpdateBtn.click();
        }
        waitUntilUpdateSuccessfulDialogDisappear();
        allTypes.click();
        maintenanceUpdateBtn.click();
    }
}
