package com.trycloud.step_definitions;

import com.trycloud.pages.Login_Page;
import com.trycloud.pages.us11_Page_V;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class us11_StepDef_V {
    us11_Page_V us11_page_V = new us11_Page_V() ;
    Login_Page login_page = new Login_Page();

    Select select;

    public us11_StepDef_V() {
    }

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
      login_page.login();
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        us11_page_V.clickModule(string);
        BrowserUtils.sleep(3);
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        String act = Driver.getDriver().getTitle();
        Assert.assertEquals(string, act);
    }

    @When("user search user from the search box")
    public void user_search_user_from_the_search_box() {
        this.us11_page_V.searBox.sendKeys(new CharSequence[]{"user50"});
        this.us11_page_V.userSearch.click();
    }

    @When("user write a message")
    public void user_write_a_message() {
        this.us11_page_V.textBox.sendKeys(new CharSequence[]{"bye"});
    }

    @When("user clicks to submit button")
    public void user_clicks_to_submit_button() {
        this.us11_page_V.submitBtn.click();
    }

    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {
        this.us11_page_V.msg.isDisplayed();
    }


}
