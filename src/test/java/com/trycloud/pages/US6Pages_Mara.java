package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US6Pages_Mara {
    public US6Pages_Mara(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="user")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id="submit-form")
    public WebElement loginBtn;

    @FindBy(xpath = "//ul[@id='appmenu']/li[2]/a")
    public WebElement fileModuleBtn;

    @FindBy(xpath = "//a[@class='name']//span[@class='icon icon-more']")
    public WebElement actionIcon;

    @FindBy(xpath = "//a[@class='menuitem action action-favorite permanent']//span[2]")
    public WebElement removeFromFavorites;

    @FindBy(xpath = "//a[text()='Favorites']")
    public WebElement favoritesSubmodule;

    @FindBy(xpath = "//h2[.='No favorites yet']")
    public WebElement noFavoritesMessage;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement>uploadedFiles;
}
