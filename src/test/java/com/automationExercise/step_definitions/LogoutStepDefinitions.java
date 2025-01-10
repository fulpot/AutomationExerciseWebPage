package com.automationExercise.step_definitions;

import com.automationExercise.page.LoginSignupPage;
import com.automationExercise.page.ProfileHomepagePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefinitions {

    ProfileHomepagePage profileHomepagePage = new ProfileHomepagePage();
    LoginSignupPage loginSignupPage = new LoginSignupPage();
    @When("The users clicks Logout button")
    public void the_users_clicks_logout_button() {
        profileHomepagePage.logoutButton.click();
    }
    @Then("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        Assert.assertEquals("Login to your account", loginSignupPage.formHeaders.get(0).getText());
        Assert.assertTrue(loginSignupPage.formHeaders.get(2).getText().startsWith("New User Signup!"));
    }

}
