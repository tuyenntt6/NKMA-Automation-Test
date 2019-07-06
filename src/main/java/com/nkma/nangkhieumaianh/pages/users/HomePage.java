package com.nkma.nangkhieumaianh.pages.users;

import com.nkma.nangkhieumaianh.utils.Util;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class HomePage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Giới thiệu')]")
    private WebElement intro;

    @FindBy(xpath = "//a[contains(text(),'Môn Năng Khiếu')]")
    private WebElement monNK;

    @FindBy(xpath = "//a[contains(@title,'Toán Tư Duy')]")
    private WebElement toantuduy;

    @FindBy(xpath = "//a[contains(@title,'Anh Văn')]")
    private WebElement anhvan;

    @FindBy(xpath = "//a[contains(@title,'Mỹ Thuật')]")
    private WebElement mythuat;

    @FindBy(xpath = "//a[contains(@title,'Thể Dục Aerobic')]")
    private WebElement aerobic;

    @FindBy(xpath = "//a[contains(@title,'Luyện Chữ Đẹp')]")
    private WebElement luyenchu;

    public HomePage(WebDriver driver, ExtentTest logger){
        super(driver,logger);
    }

    public void navigate(){
        String url = "https://www.nangkhieumyanh.edu.vn/";
        this.driver.get(url);
        this.logger.log(LogStatus.INFO,"Navigate to:" + url);
    }

    public void clickIntro(){
        this.intro.click();
        this.logger.log(LogStatus.INFO,"Click Gioi Thieu");
    }

    public void hoverNangKhieu(){
        Actions actions = new Actions(driver);
        actions.moveToElement(monNK).perform();
        Util.sleep(1000);

        this.logger.log(LogStatus.INFO,"Hover Mon Nang Khieu");
    }

    public boolean isMenuNKDisplay(){
        boolean isToanTuDuyDisplay = this.toantuduy.isDisplayed();
        boolean isAnhVanDisplay = this.anhvan.isDisplayed();
        boolean isMyThuatDisplay = this.mythuat.isDisplayed();
        boolean isTheDucDisplay = this.aerobic.isDisplayed();
        boolean isLuyenChuDepDisplay = this.luyenchu.isDisplayed();

        boolean result = false;
        if(isToanTuDuyDisplay == true
        && isAnhVanDisplay == true
        && isMyThuatDisplay == true
        && isTheDucDisplay == true
        && isLuyenChuDepDisplay == true)
            result = true;
        if(result){
            logger.log(LogStatus.PASS,"Passed");
        }else {
            logger.log(LogStatus.ERROR,"Failed");
        }

        return result;
    }

}
