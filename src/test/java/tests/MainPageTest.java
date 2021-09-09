package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPageTest extends TestBase {
    @Test
    @DisabledIfSystemProperty(named = "selenide.remote", matches = "http.*", disabledReason = "Clipboard not " +
            "support on Selenium Grid yet")
    @Description("Soon to be implemented by me (or QA engineers)")
    @DisplayName("Page blocks should be loaded")
    void blocksLoadedTest() {

        step("Open url 'https://dot-dot.ru/'", () ->
                open("https://dot-dot.ru/"));

        step("Проверяем, что на странице видна ссылка 'Клиентам'", () -> {
                    $("#header").shouldHave(text("Клиентам")).shouldBe(visible); });

        step("Проверяем, что на странице видна ссылка 'Перевозчикам'", () -> {
                    $("#header").shouldHave(text("Перевозчикам")).shouldBe(visible); });

        step("Проверяем, что на странице видна ссылка 'Отследить заказ'", () -> {
                    $("#header").shouldHave(text("Отследить заказ")).shouldBe(visible); });
    }
}
