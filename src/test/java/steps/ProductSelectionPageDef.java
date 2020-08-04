package steps;

import io.cucumber.java.en.Then;
import pages.ProductSelectionPage;

public class ProductSelectionPageDef {
    ProductSelectionPage productSelectionPage = new ProductSelectionPage();

    @Then("Click on {string} tab")
    public void clickOnTab(String arg0) {
        productSelectionPage.clickButtonTabNotebooks(arg0);
    }

    @Then("Click {string} the selected product")
    public void clickTheSelectedProduct(String arg0) {
        productSelectionPage.clickButtonTheSelectedProduct(arg0);
    }

    @Then("Click  button window")
    public void clickButtonWindow() {
        productSelectionPage.clickWindowButtonContinueShopping();
    }
}
