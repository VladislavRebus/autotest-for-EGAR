package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CartPage {
    private SelenideElement productName = $(By.xpath("//div[@class='cart-item']//a[@class='name']"));
    private SelenideElement productPrice = $(By.xpath("//div[@class='prc']"));

    public void clickCartButton(String text) {
        $(By.xpath("//div[@id='cart']//a[text()='" + text + "']")).pressEscape().click();
    }
    public void productInCartVisible(String text) {
        $(By.xpath("//a[text()='" + text + "']")).shouldBe(Condition.visible);
    }
    public void nameProduct(String text) {
        productName.innerText(); //до этого ставил .val(text)
    }

    public void priceProduct(String text) {
        productPrice.innerText(); //до этого ставил .val(text)
    }

    public String getNameProduct() {
        return productName.getValue();
    }

    public String getPriceProduct() {
        return productPrice.getValue();
    }

}
