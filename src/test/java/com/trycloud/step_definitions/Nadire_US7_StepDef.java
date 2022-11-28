package com.trycloud.step_definitions;

import com.trycloud.pages.Login_Page;
import com.trycloud.pages.Nadire_US7_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nadire_US7_StepDef {
    Nadire_US7_Page nadire_us7_page=new Nadire_US7_Page();
    Login_Page login_page=new Login_Page();
    String uploadedFileName="first_file";

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        login_page.login();
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String fileModule) {
        // fileModule_page.fileModuleBtn.click();
        nadire_us7_page.clickEachModule(nadire_us7_page.allModules,fileModule);
        BrowserUtils.sleep(5);

    }

    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        nadire_us7_page.addIconBtn.click();

    }

    @When("user click \"new folder”")
    public void user_click_new_folder() {
        nadire_us7_page.newFolderBtn.click();

    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {
        //  fileModule_page.newFolderInput.clear();

        nadire_us7_page.newFolderInput.sendKeys("Batch 27");


    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {

        nadire_us7_page.submitBtn.click();

    }

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        Assert.assertTrue(nadire_us7_page.newfolder.isDisplayed());

    }


    @And("user choose a folder from the page")
    public void userChooseAFolderFromThePage() {
        nadire_us7_page.choseFolder.click();


    }

    @When("the user uploads a file with the upload file option")
    public void theUserUploadsAFileWithTheUploadFileOption() {
        String filePath="C:\\Users\\Nadi\\Desktop\\Interview_QA\\first_file.txt";

        nadire_us7_page.fileUploadBtn.sendKeys(filePath);

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);

    }

    @Then("Verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {

        boolean result=false;
        for(WebElement each: nadire_us7_page.uploadedFile){
            if(each.getText().equals(uploadedFileName)){
                result=true;
                break;
            }
        }
        Assert.assertTrue(result);



    }





















}
