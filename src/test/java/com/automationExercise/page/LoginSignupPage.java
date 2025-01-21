package com.automationExercise.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class LoginSignupPage extends BasePage {


    @FindBy(css = "input[name='name']")
    public WebElement nameInput;

//    @FindBys({@FindBy(xpath = "(//input[@name='email'])"),
//            @FindBy(css = "input[data-qa='signup-email']")})

    @FindBy(css = "input[data-qa='signup-email']")
    public WebElement emailInputForSignup;

    @FindBy(css = "input[data-qa='login-email']")
    public WebElement emailInputForLogin;

    @FindBy(css = "input[data-qa='login-password']")
    public WebElement passwordInputForLogin;

    @FindBy(css = "button[data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(css = "button[data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@data-qa='login-button']/preceding-sibling::p")
    public WebElement incorrectEmailOrPasswordMessage;

    @FindBy(css = "#form h2")
    public List<WebElement> formHeaders;

    @FindBy(css = "form[action='/signup'] > p")
    public WebElement existEmailErrorMessage;



}
