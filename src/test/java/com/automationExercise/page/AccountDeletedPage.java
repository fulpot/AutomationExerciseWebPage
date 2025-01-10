package com.automationExercise.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDeletedPage extends BasePage{

    @FindBy(xpath = "//b")
    public WebElement accountDeletedMessage;

    @FindBy(css = "a[data-qa='continue-button']")
    public WebElement continueButton;

}
