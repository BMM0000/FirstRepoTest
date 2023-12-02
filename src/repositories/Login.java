package repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;
    By txtUserName = By.xpath("//input[contains(@name,'username')]");
    By txtPwd = By.xpath("//input[contains(@name,'pw')]");
    By btnLogin=By.xpath("//input[contains(@name,'Login')]");

    public Login(WebDriver driverParam) {

        this.driver = driverParam;
    }

    public void login(String username, String pwd) {

        driver.findElement(txtUserName).sendKeys(username);
        driver.findElement(txtPwd).sendKeys(pwd);
        driver.findElement(btnLogin).click();




    }
}


