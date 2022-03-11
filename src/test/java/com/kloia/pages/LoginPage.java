package com.kloia.pages;

import com.kloia.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[contains(.,'Sign In with Google')]")
    public WebElement signInWithGoogleLink;

    @FindBy(id = "identifierId")
    public WebElement userGoogleEmail;

    @FindBy(xpath = "//span[contains(.,'İleri')]")
    public WebElement nextButton;

    public void enterValidCredentials(String email, String password){
        emailInputBox.sendKeys(email);
        passwordInputBox.sendKeys(password, Keys.ENTER);
    }

    public void loginWithGoogleOption() {
        signInWithGoogleLink.click();
        navigateToNewSignInWindow();
    }

    private void navigateToNewSignInWindow() {
        Set<String> windowHandles = Driver.get().getWindowHandles();
        for (String handle : windowHandles) {
            Driver.get().switchTo().window(handle);
            if(Driver.get().getTitle().equals("Oturum açın - Google Hesapları")){
                break;
            }
        }
        userGoogleEmail.sendKeys("fmyasar20@gmail.com");
        nextButton.click();
    }

}
