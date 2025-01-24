package com.automationExercise.step_definitions;

import com.automationExercise.page.HomePage;
import com.automationExercise.page.TestCasesPage;
import com.automationExercise.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

public class TestCasesStepDefinitions {

    HomePage homePage = new HomePage();
    TestCasesPage testCasesPage = new TestCasesPage();

    @When("Click on Test Cases button")
    public void click_on_test_cases_button() {
        homePage.testCasesButton.click();
    }
    @Then("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        Assert.assertEquals("Automation Practice Website for UI Testing - Test Cases", Driver.get().getTitle());
        Assert.assertEquals("TEST CASES", testCasesPage.testCasesHeader.getText());
    }
    @Then("Verify there is {int} test cases on the page")
    public void verify_there_is_test_cases_on_the_page(Integer totalTestCases) {
        Assert.assertEquals(totalTestCases.intValue(), testCasesPage.testCasesElements.size());
    }
    @Then("Verify each test case has hyperlink tag with {string} attribute and value contains with {string}")
    public void verify_each_test_case_has_hyperlink_tag_with(String expectedAttribute, String expectedValue) {
        // substring(41) => https://automationexercise.com/test_cases  -> #collapse1
        Optional<Boolean> result = Optional.of(testCasesPage.testCasesElements.stream().allMatch(e -> e.getAttribute(expectedAttribute).substring(41).startsWith(expectedValue)));

//        System.out.println("result.get() = " + result.get());
//        testCasesPage.testCasesElements.forEach(e -> System.out.println(e.getAttribute(expectedAttribute)));

        Assert.assertTrue(result.get());
    }

}
