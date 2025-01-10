package com.automationExercise.step_definitions;

import com.automationExercise.page.*;
import com.automationExercise.utilities.BrowserUtils;
import com.automationExercise.utilities.ConfigurationReader;
import com.automationExercise.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class SignUpStepDefinitions extends BasePage {
    LoginSignupPage loginSignupPage = new LoginSignupPage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    ProfileHomepagePage profileHomepagePage = new ProfileHomepagePage();

    @Given("Navigate to url of webpage")
    public void navigate_to_url_of_webpage() {
        Driver.get().get(ConfigurationReader.get("env"));
        loginSignupPage.consentButton.click();
    }

    @When("The user goes to Signup - Login page")
    public void the_user_goes_to_signup_login_page() {
        BrowserUtils.waitForClickablility(loginSignupPage.signupLoginButton, 2);
        loginSignupPage.signupLoginButton.click();
        BrowserUtils.waitFor(2);
    }

    @When("The user enters {string} as name")
    public void the_user_enters_as_name(String name) {
        loginSignupPage.nameInput.sendKeys(name);
    }

    @When("The user enters {string} as email for signup")
    public void the_user_enters_as_email_for_signup(String email) {
        loginSignupPage.emailInputForSignup.sendKeys(email);
    }

    @When("The user clicks {string} button to signup")
    public void the_user_clicks_button_to_signup(String string) {
        loginSignupPage.signupButton.click();
    }

    @When("The user fills details: {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_details(String title, String name, String email, String password, String dateOfBirthday) {
        if (title.equals("Mr."))
            signupPage.genderMaleRadioButton.click();
        else
            signupPage.genderFrauRadioButton.click();

        signupPage.nameInput.clear();
        signupPage.nameInput.sendKeys(name);

        signupPage.passwordInput.sendKeys(password);

        LocalDate birthDay = LocalDate.parse(dateOfBirthday);

        Select select = new Select(signupPage.daySelect);
        select.selectByIndex(birthDay.getDayOfMonth() - 1);

        select = new Select(signupPage.monthSelect);
        select.selectByIndex(birthDay.getDayOfMonth() - 1);

        select = new Select(signupPage.yearSelect);
        select.selectByValue(Integer.toString(birthDay.getYear()));

    }

    @When("The user selects checkbox {string}")
    public void the_user_selects_checkbox(String option) {
        if (!signupPage.newsletterCheckbox.isSelected())
            signupPage.newsletterCheckbox.click();
    }

    @When("The user selects {string}")
    public void the_user_selects(String option) {
        if (!signupPage.specialOfferCheckbox.isSelected())
            signupPage.specialOfferCheckbox.click();
    }

//    @When("The user fills details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
//    public void the_user_fills_details(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String mobilNumber) {
//        signupPage.firstNameInput.sendKeys(firstName);
//        signupPage.lastNameInput.sendKeys(lastName);
//        signupPage.companyInput.sendKeys(company);
//        signupPage.address1Input.sendKeys(address);
//        signupPage.address2Input.sendKeys(address2);
//        new Select(signupPage.countrySelect).selectByValue(country);
//        signupPage.stateInput.sendKeys(state);
//        signupPage.cityInput.sendKeys(city);
//        signupPage.zipcodeInput.sendKeys(zipcode);
//        signupPage.mobilNumberInput.sendKeys(mobilNumber);
//
//    }

    @When("The user fills above details:")
    public void the_user_fills_details(Map<String,String> infos) {
        signupPage.firstNameInput.sendKeys(infos.get("First Name"));
        signupPage.lastNameInput.sendKeys(infos.get("Last Name"));
        signupPage.companyInput.sendKeys(infos.get("Company"));
        signupPage.address1Input.sendKeys(infos.get("Address"));
        signupPage.address2Input.sendKeys(infos.get("Address2"));
        new Select(signupPage.countrySelect).selectByValue(infos.get("Country"));
        signupPage.stateInput.sendKeys(infos.get("State"));
        signupPage.cityInput.sendKeys(infos.get("City"));
        signupPage.zipcodeInput.sendKeys(infos.get("Zipcode"));
        signupPage.mobilNumberInput.sendKeys(infos.get("Mobile Number"));

    }

    @When("The User clicks Create Account button")
    public void the_user_clicks_create_account_button() {
        signupPage.createAccountButton.submit();
    }

    @Then("Verify that {string} is visible on the new page")
    public void verify_that_is_visible_on_the_new_page(String expectedMessage) {
        Assert.assertEquals(expectedMessage, accountCreatedPage.accountCreatedMessage.getText());
    }

    @Then("The user clicks Continue button to go to the profile homepage")
    public void the_user_clicks_continue_button_to_go_to_the_profile_homepage() {
        accountCreatedPage.continueButton.click();
    }

    @Then("Verify that {string} is visible on the profile homepage")
    public void verify_that_is_visible_on_the_profile_homepage(String expectedMessage) {
        Assert.assertEquals(expectedMessage, profileHomepagePage.loggedAsInName.getText().trim());
    }

}
