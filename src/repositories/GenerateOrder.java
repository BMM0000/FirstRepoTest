package repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class GenerateOrder {

    WebDriver driver;

    By chkbxISCode = By.xpath("//input[contains(@name,':checkedone')]");
    By linkGoogleLoctn = By.xpath("//*[@id=\"j_id0:frm:j_id214\"]");
    By txtLoctn = By.xpath("//*[@id=\"pac-input\"]");
    By btnSubmit = By.xpath("//*[@id=\"dv2\"]/div/div/div/div/a[1]");

    By txtCustPrefDate = By.xpath("//*[@id=\"j_id0:frm:j_id217:bid\"]");

    By datePlusIcon = By.xpath("//*[@id=\"dtBox\"]/div/div/div/div/div[2]/div[1]/div/a[1]");

    By btnSetDate = By.xpath("//*[@id=\"dtBox\"]/div/div/div/div/div[3]/a[1]");

    By drpdwnNoSlotReason = By.xpath("//select[contains(@id,':SelectReason')]");

    By linkSchFirstServ = By.xpath("//*[@id=\"j_id0:frm:j_id225\"]");

    By txtSchDate = By.xpath("//input[contains(@name,':S_sate')]");

    By rbtnSelSLot = By.xpath("//input[contains(@id,'slotRadio1')]");

    By rowColor = By.xpath("//*[@id=\"j_id0:frm2:j_id37\"]/table[2]/tbody/tr[2]");


    public GenerateOrder(WebDriver driverParam) {

        this.driver = driverParam;

    }

    public void generateOrder()throws InterruptedException {

        Thread.sleep(10000);
        driver.findElement(chkbxISCode).click();
        Thread.sleep(5000);
        driver.findElement(linkGoogleLoctn).click();
        Thread.sleep(5000);
        driver.findElement(txtLoctn).sendKeys("Jaswanti Landmark, Godrej & Boyce Industry Estate, Vikhroli West, Mumbai, Maharashtra, India");
        driver.findElement(btnSubmit).click();
        Thread.sleep(7000);

        driver.switchTo().alert().accept();
        Thread.sleep(7000);

        driver.findElement(txtCustPrefDate).click();
        Thread.sleep(3000);

        Actions act = new Actions(driver);
        WebElement wb = driver.findElement(datePlusIcon);
        act.doubleClick(wb).perform();
        Thread.sleep(3000);

        driver.findElement(btnSetDate).click();
        Thread.sleep(3000);

        Select sel = new Select(driver.findElement(drpdwnNoSlotReason));
        sel.selectByIndex(5);
        Thread.sleep(3000);

        driver.findElement(linkSchFirstServ).click();
        Thread.sleep(3000);

        driver.findElement(txtSchDate).click();

        Actions act1 = new Actions(driver);
        WebElement wb1 = driver.findElement(datePlusIcon);
        act1.doubleClick(wb1).perform();
        Thread.sleep(3000);

        driver.findElement(btnSetDate).click();
        Thread.sleep(5000);


    }
}










