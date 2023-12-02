package repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpportunityDetail {

    WebDriver driver;

    By btnNewServPicthd= By.xpath("//input[contains(@value,'New Services Pitched')]");

    By drpdwnServGrp=By.xpath("//*[@id=\"j_id0:frm:j_id50\"]/table/tbody/tr[1]/td[2]/select");

    By drpdwnServPlan=By.xpath("//select[contains(@id,':SerAreaId')]");

    By btnAddServ=By.xpath("//input[contains(@value,'Add Service')]");

    By btnSaveAllServReq=By.xpath("//input[contains(@value,'Save All Service Request')]");

    public OpportunityDetail(WebDriver driverParam){

        this.driver=driverParam;

    }

    public void clickNewSerPitchd() throws InterruptedException {

        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("window.scrollBy(0,250)", "");

        driver.findElement(btnNewServPicthd).click();
        Thread.sleep(5000);

        Select sel=new Select(driver.findElement(drpdwnServGrp));
        sel.selectByIndex(6);
        Thread.sleep(5000);

        Select sel2=new Select(driver.findElement(drpdwnServPlan));
        sel2.selectByIndex(6);
        Thread.sleep(5000);

        driver.findElement(btnAddServ).click();
        Thread.sleep(5000);
        driver.findElement(btnSaveAllServReq).click();



    }
}
