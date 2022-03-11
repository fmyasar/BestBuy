package com.kloia.step_defs;

import com.kloia.pages.DashboardPage;
import com.kloia.pages.ProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Task4StepDef {

    DashboardPage dashboardPage = new DashboardPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();

    @When("user select {string} at Menu {string} {string}")
    public void user_select_at(String submenu3, String submenu1, String submenu2) {
        dashboardPage.selectProduct(submenu3, submenu1, submenu2);
    }

    @When("user filter brands by {string} and select from filtered results")
    public void user_filter_brands_by_and_select_from_filtered_results(String brand) {
        dashboardPage.selectBrand(brand);
    }

    @When("user select {string} nd product on the search result page")
    public void user_select_nd_product_on_the_search_result_page(String n) {
        dashboardPage.selectNthProduct(n);
    }

    @When("user click save button on the product detail page")
    public void user_click_save_button_on_the_product_detail_page() {
        productDetailPage.clickSaveButton();
    }

    @And("user opened Saved Items list")
    public void userOpenedSavedItemsList() {
        dashboardPage.clickSavedItemButton();
    }

    @Then("user should see the title of saved item on the list")
    public void user_should_see_the_title_of_saved_item_on_the_list() {
        Assert.assertTrue(productDetailPage.verifyTitleOfSavedItemOnTheList());
    }

}
