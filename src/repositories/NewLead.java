package repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewLead {


    WebDriver driver;

    By btnCont = By.xpath("//input[contains(@title,'Continue')]");
    By drpSubSource = By.xpath("//select[contains(@id,':subs')]");
    By drpStatus = By.xpath("//select[contains(@id,':staus')]");
    By drpDwnSaltn = By.xpath("//html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[1]/fieldset/table/tbody/tr[27]/td[2]/div/select");
    By txtFname = By.xpath("//input[contains(@id,':firstName')]");
    By txtLname = By.xpath("//input[contains(@id,':lastName')]");
    By txtCustMob = By.xpath("//input[contains(@id,':mob')]");
    By txtEmail = By.xpath("//input[contains(@type,'email')]");
    By txtPinCode = By.xpath("//input[contains(@type,'number')]");
    By drpDwnIndSeg = By.xpath("//*[@id=\"j_id0:frm\"]/div[1]/fieldset/table/tbody/tr[33]/td[2]/select");

    By drpDwnBHK = By.xpath("//*[@id=\"j_id0:frm:R2\"]/select");
    By drpDwnIntrstdServ = By.xpath("//*[@id=\"intrsrv\"]/td[2]/select");

    By txtWingFlat = By.xpath("//*[@id=\"j_id0:frm:j_id178\"]");

    By txtBldgNm = By.xpath("//*[@id=\"j_id0:frm:j_id180\"]");

    By txtStAdrrss = By.xpath("//*[@id=\"j_id0:frm:autocomplete\"]");

    By txtLocality = By.xpath("//*[@id=\"j_id0:frm:j_id183\"]");

    By txtLandMark = By.xpath("//*[@id=\"j_id0:frm:j_id185\"]");

    By btnSave=By.xpath("//*[@id=\"j_id0:frm:j_id217\"]");

    By btnEdit=By.xpath("//*[@id=\"topButtonRow\"]/input[1]");

    By txtExpValue=By.xpath("//input[contains(@id,':Exp_Value')]");

    By txtExpDate=By.xpath("//input[contains(@id,':Exp_Date')]");

    By datePlusIcon=By.xpath("//*[@id=\"dtBox\"]/div/div/div/div/div[2]/div[1]/div/a[1]");

    By btnSetDate=By.xpath("//*[@id=\"dtBox\"]/div/div/div/div/div[3]/a[1]");


    public NewLead(WebDriver driverParam) {

        this.driver = driverParam;
    }

    public void clickContBtn() throws InterruptedException {

        driver.findElement(btnCont).click();
        Thread.sleep(8000);

    }

    public void newLead() throws InterruptedException {


        Thread.sleep(7000);
        Select sel = new Select(driver.findElement(drpSubSource));
        sel.selectByIndex(2);
        Thread.sleep(2000);

        Select statusDrpDwn=new Select(driver.findElement(drpStatus));
        statusDrpDwn.selectByIndex(2);
        Thread.sleep(2000);

        Select sel1 = new Select(driver.findElement(drpDwnSaltn));
        sel1.selectByIndex(1);
        //sel1.selectByIndex(1);
        Thread.sleep(2000);

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String str1 = format.format(date);

        String str = "Test Lead " + " " + str1;
        driver.findElement(txtFname).sendKeys(str);
        driver.findElement(txtLname).sendKeys(str);
        driver.findElement(txtCustMob).sendKeys("85600");
        driver.findElement(txtEmail).sendKeys("test@gmail.com");
        driver.findElement(txtPinCode).sendKeys("999999");


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);

        Select sel2 = new Select(driver.findElement(drpDwnIndSeg));
        sel2.selectByIndex(3);
        Thread.sleep(2000);

        Select sel3 = new Select(driver.findElement(drpDwnBHK));
        sel3.selectByIndex(3);
        Thread.sleep(2000);

        Select sel4 = new Select(driver.findElement(drpDwnIntrstdServ));
        sel4.selectByIndex(2);
        Thread.sleep(2000);

        driver.findElement(txtWingFlat).sendKeys(str);
        driver.findElement(txtBldgNm).sendKeys(str);
        driver.findElement(txtStAdrrss).sendKeys(str);
        driver.findElement(txtLocality).sendKeys(str);
        driver.findElement(txtLandMark).sendKeys(str);
        driver.findElement(btnSave).click();
        Thread.sleep(8000);

        driver.findElement(btnEdit).click();

        Select sel5=new Select(driver.findElement(drpStatus));
        sel5.selectByIndex(2);

        driver.findElement(txtExpValue).sendKeys("7500");

        driver.findElement(txtExpDate).click();
        Thread.sleep(5000);

        Actions act=new Actions(driver);
        WebElement wb=driver.findElement(datePlusIcon);
        act.doubleClick(wb).perform();
        Thread.sleep(5000);

        driver.findElement(btnSetDate).click();

        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);

        driver.findElement(btnSave).click();



    }
}
