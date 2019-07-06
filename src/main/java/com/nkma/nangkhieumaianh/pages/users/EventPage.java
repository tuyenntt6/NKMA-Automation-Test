package com.nkma.nangkhieumaianh.pages.users;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class EventPage extends BasePage {
    @FindBy(xpath = "//a[contains(@href,'su-kien')]")
    private List<WebElement> events;

    public EventPage(WebDriver driver, ExtentTest logger){
        super(driver, logger);
    }

    public void navigate(){
        String url = "https://www.nangkhieumyanh.edu.vn/";
        this.driver.get(url);
        this.logger.log(LogStatus.INFO,"Navigate to:"+url);
    }

    public void listEventItem(){
        for(WebElement element : events){
            By byTitle = By.xpath(".//h3");
            WebElement eTitle = element.findElement(byTitle);
            String title = eTitle.getText();
            System.out.println(title);

            By byLocation = By.xpath(".//div[@class='job']");
            WebElement eLocation = element.findElement(byLocation);
            String local = eLocation.getText();
            System.out.println(local);
        }
    }

    public int getEventSize(){
        return this.events.size();
    }

}
