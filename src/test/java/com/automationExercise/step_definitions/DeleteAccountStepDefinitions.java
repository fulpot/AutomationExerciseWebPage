package com.automationExercise.step_definitions;

import com.automationExercise.page.AccountDeletedPage;
import com.automationExercise.page.ProfileHomepagePage;
import com.automationExercise.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DeleteAccountStepDefinitions {

    ProfileHomepagePage profileHomepagePage = new ProfileHomepagePage();
    AccountDeletedPage accountDeletedPage = new AccountDeletedPage();

    @Then("The user clicks Delete Account button to delete the account")
    public void The_user_clicks_delete_account_button_to_delete_the_account() {
        profileHomepagePage.deleteAccountButton.click();
    }
    @Then("Verify that {string} is visible and click Continue button")
    public void verify_that_is_visible_and_click_continue_button(String expected) {
        BrowserUtils.waitForVisibility(accountDeletedPage.accountDeletedMessage, 2);
        System.out.println(accountDeletedPage.accountDeletedMessage.getText());
        Assert.assertEquals(expected, accountDeletedPage.accountDeletedMessage.getText().toUpperCase());
        accountDeletedPage.continueButton.click();
    }
}
