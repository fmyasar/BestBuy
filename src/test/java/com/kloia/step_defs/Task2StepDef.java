package com.kloia.step_defs;

import com.kloia.pages.DashboardPage;
import com.kloia.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Task2StepDef {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    @When("user navigate to sign in page")
    public void user_navigate_to_sign_in_page() {
        dashboardPage.navigateToSignInPage();
    }

    @And("user enter valid credentials {string} {string} and push Enter")
    public void userEnterValidCredentialsAndPushEnter(String email, String password) {
        loginPage.enterValidCredentials(email, password);
    }

    @Then("user should be successfully login")
    public void user_should_be_successfully_login() {
        Assert.assertTrue(dashboardPage.verifySuccessfulLogin());
    }

}
