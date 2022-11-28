package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class us11_Page_V {
    @FindBy(
            id = "user"
    )
    public WebElement inputUsername;
    @FindBy(
            id = "password"
    )
    public WebElement inputPassword;
    @FindBy(
            id = "submit-form"
    )
    public WebElement loginBtn;
    @FindBy(
            xpath = "//*[@id=\"appmenu\"]/li[5]/a"
    )
    public WebElement talkIcon;
    @FindBy(
            xpath = "//*[@id=\"app-navigation-vue\"]/div[1]/form/input"
    )
    public WebElement searBox;
    @FindBy(
            xpath = "//*[@id=\"conversation_67z5pcu9\"]"
    )
    public WebElement userSearch;
    @FindBy(
            xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div[3]/div/form/div[3]/div/div"
    )
    public WebElement textBox;
    @FindBy(
            xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div[3]/div/form/button"
    )
    public WebElement submitBtn;
    @FindBy(
            xpath = "//*[@id=\"message_4723\"]"
    )
    public WebElement msg;

    public void clickModule(String moduleName){
        String locator = "//ul[@id='appmenu']//span[normalize-space(.)='"+moduleName+"']/..";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }
}
