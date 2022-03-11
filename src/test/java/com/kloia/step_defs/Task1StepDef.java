package com.kloia.step_defs;

import com.kloia.pages.HomePage;
import com.kloia.pages.SearchPage;
import com.kloia.utilities.BrowserUtils;
import com.kloia.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Task1StepDef {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();

    @Then("user should see page title {string}")
    public void user_should_see_page_title(String expectedPageTitle) {
        String actualPageTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }

    @When("user search for {string}")
    public void user_search_for(String itemName) {
        homePage.searchItem(itemName);
        BrowserUtils.waitFor(2);
    }

    @Then("user should see results for {string}")
    public void user_should_see_results_for(String expectedItemName) {
        Assert.assertTrue(searchPage.getResultText().contains(expectedItemName.toLowerCase()));
    }

}
