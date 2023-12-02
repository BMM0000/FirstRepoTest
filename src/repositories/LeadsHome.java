package repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadsHome {


    WebDriver driver;

    By closeBtn=By.xpath("//a[contains(@id,'tryLexDialogX')]");
    By linkLead = By.xpath("//a[contains(@title,'Leads Tab')]");

    By btnNew = By.xpath("//input[contains(@title,'New')]");


    public LeadsHome(WebDriver driverParam) {

        this.driver = driverParam;
    }

    public void clickLeadLink() throws InterruptedException {

        driver.findElement(linkLead).click();
        Thread.sleep(5000);
    }

    public void clickNewBtn() throws InterruptedException {

        driver.findElement(btnNew).click();
        Thread.sleep(5000);


    }
    public void clickCloseBtn() throws InterruptedException {

        driver.findElement(closeBtn).click();
        Thread.sleep(5000);


    }
}
