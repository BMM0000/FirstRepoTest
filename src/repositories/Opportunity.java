package repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Opportunity {

    By chkbxAction=By.xpath("//*[@id=\"allBox_00N28000008qSVg\"]");

    By btnGenOrder=By.xpath("//input[contains(@value,'Generate Order')]");

    WebDriver driver;


    public Opportunity(WebDriver driverParam){

        this.driver=driverParam;


    }

    public void generateOrder() throws InterruptedException {

        Thread.sleep(10000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("window.scrollBy(0,250)", "");

        Thread.sleep(3000);

        driver.findElement(chkbxAction).click();
        Thread.sleep(3000);

        driver.findElement(btnGenOrder).click();





    }
}
