package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProductSelectionPage {

    public void clickButtonTabNotebooks(String text) {
        $(By.xpath("//div[@id=\"sideLeft\"]//a[text()='" + text + "']")).click();
    }

    public void clickButtonTheSelectedProduct(String text) {
        $(By.xpath("//div[@id='item-247074']//span[text()='" + text + "']/..")).click();
    }

  public void clickWindowButtonContinueShopping() {
      $(By.xpath("//div[@id='success']//a[@id='not-close']")).waitUntil(Condition.visible,5000).pressEnter();
  }

}
