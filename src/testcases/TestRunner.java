package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import repositories.*;

public class TestRunner {

    public static WebDriver currClassDriver;
    Login objLogin;
    LeadsHome objLeadsHome;
    NewLead objNewLead;

    OpportunityDetail objOpportunityDetail;

    Opportunity objOpportunity;

    GenerateOrder objGenOrder;

    @Test(priority = 1)
    public void Login() throws InterruptedException {

        //System.setProperty("webdriver.gecko.driver","D:\\\\geckodriver.exe");
        //currClassDriver=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","D:\\\\\\\\chromedriver.exe");
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        currClassDriver=new ChromeDriver(co);
        Thread.sleep(6000);
        currClassDriver.get("https://login.salesforce.com/?locale=in");
        Thread.sleep(5000);
        currClassDriver.manage().window().maximize();

        objLogin=new Login(currClassDriver);
        objLogin.login("hemangi.kadam@hicare.in","welcome1");

    }
    @Test(priority=2)
    public void clickLeadLinkAndNewBtn() throws InterruptedException {

        Thread.sleep(8000);
        objLeadsHome=new LeadsHome(currClassDriver);
        objLeadsHome.clickCloseBtn();
        objLeadsHome.clickLeadLink();
        objLeadsHome.clickNewBtn();
    }

    @Test(priority=3)
    public void NewLead() throws InterruptedException {

        objNewLead=new NewLead(currClassDriver);
        objNewLead.clickContBtn();
        objNewLead.newLead();

    }

    @Test(priority = 4)
    public void opportunityDetail() throws InterruptedException {

        objOpportunityDetail=new OpportunityDetail(currClassDriver);
        objOpportunityDetail.clickNewSerPitchd();



    }
    @Test(priority = 5)
    public void opportunityCreated() throws InterruptedException {

        Thread.sleep(10000);
        objOpportunity=new Opportunity(currClassDriver);
        objOpportunity.generateOrder();

    }

    @Test(priority = 6)
    public void genorder() throws InterruptedException {

        Thread.sleep(7000);
        objGenOrder=new GenerateOrder(currClassDriver);
        objGenOrder.generateOrder();


    }

    }
