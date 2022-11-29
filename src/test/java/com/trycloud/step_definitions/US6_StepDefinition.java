package com.trycloud.step_definitions;

import com.trycloud.pages.Login_Page;
import com.trycloud.pages.US6Pages_Mara;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US6_StepDefinition {
    US6Pages_Mara tryCloudPage=new US6Pages_Mara();
    Login_Page login=new Login_Page();
    @Given("user is on a dashboard page")
    public void user_is_on_a_dashboard_page() {
    login.login();

    }
    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
        tryCloudPage.fileModuleBtn.click();
    }
    @When("the user click action-icon from any file on the page to remove")
    public void the_user_click_action_icon_from_any_file_on_the_page_to_remove() {
        tryCloudPage.actionIcon.click();
    }
    @And("user choose the Remove from favorites option")
    public void userChooseTheRemoveFromFavoritesOption() {
        tryCloudPage.removeFromFavorites.click();
    }
    @And("user click the Favorites sub-module on the left side")
    public void userClickTheFavoritesSubModuleOnTheLeftSide() {
        tryCloudPage.favoritesSubmodule.click();
    }
    @Then("verify that the file is removed from the Favorites sub-module's table")
    public void verifyThatTheFileIsRemovedFromTheFavoritesSubModuleSTable() {
        String expected="No favorites yet";
        //BrowserUtils.sleep(2000);
        //tryCloudPage.noFavoritesMessage.isDisplayed();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(tryCloudPage.noFavoritesMessage.isDisplayed());
        String actual=tryCloudPage.noFavoritesMessage.getText();
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }


    @When("the user clicks the add icon on the top")
    public void theUserClicksTheAddIconOnTheTop() {
        tryCloudPage.addIcon.click();
    }

    @And("user uploads file with the upload file option")
    public void userUploadsFileWithTheUploadFileOption() {
        String filePath="/Users/marakass/Desktop/ScreenShot123.png";
        tryCloudPage.uploadFileBtn.sendKeys(filePath);
    }

    @Then("verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
        boolean result=false;
        String uploadedFileName="ScreenShot123";
        for(WebElement each:tryCloudPage.uploadedFiles){
            if(uploadedFileName.equals(each.getText()))
                result = true;
        }
        Assert.assertTrue(result);
    }
}
