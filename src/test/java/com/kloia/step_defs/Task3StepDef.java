package com.kloia.step_defs;

import com.kloia.pages.BasePage;
import com.kloia.pages.DashboardPage;
import com.kloia.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Task3StepDef {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    @When("user select sign in with google option")
    public void user_select_sign_in_with_google_option() {
        loginPage.loginWithGoogleOption();
    }

    @Then("user open new tab")
    public void user_open_new_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user navigates to {string}")
    public void user_navigates_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be successfully login on the newly opened tab")
    public void user_should_be_successfully_login_on_the_newly_opened_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
