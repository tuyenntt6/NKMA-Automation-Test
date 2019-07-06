package com.nkma.nangkhieumaianh.pages.users;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class IntroPage  extends BasePage{
    @FindBy(xpath = "//div[@class='ptitle']")
    private WebElement title;

    public IntroPage(WebDriver driver, ExtentTest logger){
        super(driver, logger);
    }

    public boolean isDislay(){
        String title = getTitle().toUpperCase();
        boolean result = false;
        if(title.equals("GIỚI THIỆU"))
            result= true;
        if(result){
            logger.log(LogStatus.PASS,"Passed");
        }else {
            logger.log(LogStatus.ERROR,"Failed");
        }
        return result;
    }

    public String getTitle(){
        String title = this.title.getText();
        return title;
    }
}
