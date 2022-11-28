package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Nadire_US7_Page {
    public Nadire_US7_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "user")
    public WebElement inputUsername;
    @FindBy(id = "password")
    public WebElement inputPassword;
    @FindBy(id = "submit-form")
    public WebElement loginBtn;
    public void login(String username,String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();

    }

    @FindBy(xpath = "//ul[@id='appmenu']//a")
    public List<WebElement> allModules;
    public void clickEachModule(List<WebElement> allModules, String givenModule) {
        for (WebElement each : allModules) {
            if (each.getAttribute("aria-label").equals(givenModule)) {
                each.click();
                break;
            }
        }
    }





    @FindBy(xpath = "//div[@class='actions creatable']/a")
    public WebElement addIconBtn;
    @FindBy(xpath = "//div[@class='newFileMenu popovermenu bubble menu open menu-left']/ul/li[2]/a")
    public WebElement newFolderBtn;
    @FindBy(xpath = "//input[@value='New folder']")
    public WebElement newFolderInput;
    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitBtn;
    @FindBy(xpath = "//*[@id=\"app-sidebar-vue\"]/header/div[1]/div[1]")
    public WebElement newfolder;
    @FindBy(xpath = "//tbody[@id=\"fileList\"]/tr/td[2]/a/div/div")
    public WebElement choseFolder;
    @FindBy(xpath = "//input[@type='file']")
    public WebElement fileUploadBtn;
    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement > uploadedFile;
    @FindBy(xpath = "//a[@href='/index.php/apps/files?dir=//Talk']/span[3]/a[2]")
    public WebElement actionDot;
    @FindBy(xpath = "//div[@id='controls']/div[2]/a/span[1]")
    public WebElement addIcon;



}













