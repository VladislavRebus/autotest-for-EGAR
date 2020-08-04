package steps;

import config.UserConfig;
import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.CartPage;

import static app_context.RunContext.*;




public class CartPageDef {
    CartPage cartPage = new CartPage();

    @And("Press Escape and Click {string} button cart")
    public void pressEscapeAndClickButtonCart(String arg0) {
        cartPage.clickCartButton(arg0);
    }

    @And("Product in cart {string} visible")
    public void productInCartVisible(String arg0) {
        cartPage.productInCartVisible(arg0);
    }

    @And("Input name required product")
    public void inputNameRequiredProduct() {
        String nameRequiredProduct = UserConfig.NAME_OF_THE_REQUIRED_PRODUCT;
        cartPage.nameProduct(nameRequiredProduct);
        put("nameRequiredProduct", nameRequiredProduct);
    }

    @And("Input price required product")
    public void inputPriceRequiredProduct() {
        String priceRequiredProduct = UserConfig.PRICE_OF_THE_REQUIRED_PRODUCT;
        cartPage.priceProduct(priceRequiredProduct);
        put("priceRequiredProduct", priceRequiredProduct);

    }

    @And("Check product name")
    public void checkProductName() {
        String expectProductName = get("nameRequiredProduct", String.class);
        String actualProductName = cartPage.getNameProduct();

        Assert.assertEquals(expectProductName, actualProductName);
    }

    @And("Check product price")
    public void checkProductPrice() {
        String expectProductPrice = get("priceRequiredProduct", String.class);
        String actualProductPrice = cartPage.getPriceProduct();

        Assert.assertEquals(expectProductPrice, actualProductPrice);
    }
}
