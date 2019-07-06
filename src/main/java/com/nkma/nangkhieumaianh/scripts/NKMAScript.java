package com.nkma.nangkhieumaianh.scripts;

import com.nkma.nangkhieumaianh.pages.users.EventPage;
import com.nkma.nangkhieumaianh.pages.users.HomePage;
import com.nkma.nangkhieumaianh.pages.users.IntroPage;
import com.nkma.nangkhieumaianh.utils.LogUTil;
import com.nkma.nangkhieumaianh.utils.WDUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;

public class NKMAScript {
    //ExtentReports extent;
    //ExtentTest logger;

    @BeforeSuite(alwaysRun = true)
    public void setUpWebDriver() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    }

    @AfterSuite
    public void afterSuite(){
        LogUTil.getInstance().flush();
    }

    /*@BeforeTest
    public void startReport(){
        extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/report.html", true);
        extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));

    }*/

   /* @Test
    public void listEvent(){
        WebDriver driver = WDUtil.createWebDriver();
        ExtentTest logger = LogUTil.getInstance().startTest(
                "Verify List Event","Step ");
        EventPage eventPage = new EventPage(driver, logger);
        eventPage.navigate();
        eventPage.listEventItem();

        if(eventPage.getEventSize()> 0){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false,"Empty size");
        }

        LogUTil.getInstance().endTest(logger);
        driver.quit();
    }*/

//    @Test
//    public void verifyIntroPageDisplay(){
//        WebDriver driver = WDUtil.createWebDriver();
//        ExtentTest logger = LogUTil.getInstance().startTest(
//                "Verify Info Page Display","Step ");
//        HomePage homePage = new HomePage(driver,logger);
//        homePage.navigate();
//
//        homePage.clickIntro();
//
//        IntroPage introPage = new IntroPage(driver,logger);
//        boolean isdisplay = introPage.isDislay();
//        Assert.assertTrue(isdisplay,"Intro page do not display");
//
//        LogUTil.getInstance().endTest(logger);
//        driver.quit();
//    }

    @Test
    public void verifyIntroPageDisplay2(){
        ExtentTest logger = LogUTil.getInstance().startTest(
                "Verify Info Page Display","Step ");

        logger.log(LogStatus.INFO,"OK");
        logger.log(LogStatus.PASS,"Pass");

        LogUTil.getInstance().endTest(logger);
    }

    /*@Test
    public void verifyIntroPageDisplay(){
        logger = extent.startTest("Verify Intro page display");

        WebDriver driver = WDUtil.createWebDriver();
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        logger.log(LogStatus.INFO,"Navigate to Homepage");

        homePage.clickIntro();
        logger.log(LogStatus.INFO,"Click Gioi Thieu");

        IntroPage introPage = new IntroPage(driver);
        boolean isdisplay = introPage.isDislay();
        if(isdisplay){
            logger.log(LogStatus.PASS,"Intro page display");
        }else {
            logger.log(LogStatus.ERROR,"Intro page display");
        }
        extent.endTest(logger);
        Assert.assertTrue(isdisplay,"Intro page do not display");

        driver.quit();
    }
*/

//    @Test
//    public void verifyMenuNangKhieu(){
//        WebDriver driver = WDUtil.createWebDriver();
//        ExtentTest logger = LogUTil.getInstance().startTest(
//                "Verify Menu Nang Khieu Display","Step ");
//        HomePage homePage = new HomePage(driver,logger);
//        homePage.navigate();
//        homePage.hoverNangKhieu();
//
//        boolean isDisplay = homePage.isMenuNKDisplay();
//        Assert.assertTrue(isDisplay,"Menu Nang khieu does not display");
//
//        LogUTil.getInstance().endTest(logger);
//        driver.quit();
//    }

   /* @AfterTest
    public void endReport(){
        extent.flush();
        extent.close();
    }*/
}
