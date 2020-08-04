package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    public void clickButton(String text) {
        $(By.xpath("//span[text()='" + text + "']/..")).click();
    }

    public void clickButtonSubmit(String text) {
        $(By.xpath("//a[text()='" + text + "']")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//b[text()='" + text + "']")).shouldBe(Condition.visible);
    }
}
