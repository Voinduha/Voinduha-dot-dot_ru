package tests;

import helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by me (or QA engineers)")
    @DisplayName("dot-dot.ru")
    void generatedTest() {
        step("Открываем url 'https://dot-dot.ru/'", () ->
                open("https://dot-dot.ru/"));

        step("Проверяем, что есть текст \"Помогаем экономить на междугородней автомобильной перевозке\"",
                () -> {
                    $(".main-hero").shouldHave(text("Помогаем экономить на междугородней автомобильной перевозке"));
                });
    }

    @Test
    @Description("Generated test")
    @DisplayName("Заголовок страницы должен содержать данный текст")
    void titleTest() {
        step("Открываем url 'https://dot-dot.ru/'", () ->
                open("https://dot-dot.ru/"));

        step("В заголовке страницы должен быть текст: 'Грузоперевозки по России — Точка-Точка'", () -> {
            String expectedTitle = "Грузоперевозки по России — Точка-Точка";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Generated test")
    @DisplayName("В консоли браузера не должно быть ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем url 'https://dot-dot.ru/'", () ->
                open("https://dot-dot.ru/"));

        step("В консоли браузера не должно быть текста: 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}