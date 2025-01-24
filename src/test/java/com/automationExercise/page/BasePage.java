package com.automationExercise.page;

import com.automationExercise.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {

    @FindBy(css = ".fa.fa-lock")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//p[.=('Consent')]")
    public WebElement consentButton;

    @FindBy(xpath = "//i[@class='fa fa-user']/..")
    public WebElement loggedAsInName;

    @FindBy(linkText = "Delete Account")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutButton;

    @FindBy(css = "a[href='/contact_us']")
    public WebElement contactUsButton;

    @FindBy(css = "ul>li>a[href='/test_cases']")
    public WebElement testCasesButton;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

}
