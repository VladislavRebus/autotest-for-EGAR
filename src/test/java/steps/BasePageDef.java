package steps;

import io.cucumber.java.en.Then;
import pages.BasePage;

public class BasePageDef {
    BasePage basePage = new BasePage();

    @Then("Click {string} button span")
    public void clickButtonSpan(String arg0) {
        basePage.clickButton(arg0);
    }

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basePage.clickButtonSubmit(arg0);
    }

    @Then("Content with {string} visible")
    public void contentWithVisible(String arg0) {
        basePage.contentIsVisible(arg0);
    }
}
