package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ClipboardTest  {
    @Test
    @Description("Soon to be implemented by me (or QA engineers)")
    @DisplayName("Check clipboard copy past")
    void clipboardLoadTest() {

        step("Открываем url 'https://dot-dot.ru/'", () ->
                open("https://dot-dot.ru/"));

        step("Вставляем текст в буфер обмена", () -> {
            Selenide.clipboard().setText("9256545667");
        });

        step("Вводим номер телефона в поле на странице комбинацией кнопок CTRL + v", () -> {
            $("#phone").sendKeys(Keys.CONTROL + "v");
        });

        step("Проверяем, что номер телефона введен в правильном формате", () -> {
            $("#phone").shouldHave(Condition.value("925 654-56-67"));
        });
    }
}
