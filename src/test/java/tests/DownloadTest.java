package tests;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class DownloadTest {

    @Test
    @Description("Soon to be implemented by me (or QA engineers)")
    @DisplayName("Загружаем файл с презентацией компании")
    void presentationDownload() throws IOException {
        Configuration.downloadsFolder = "downloads";

        open("https://dot-dot.ru/aboutus");
        File download = $(byText("Презентация")).download();
        PDF parsed = new PDF(download);
        assertThat(parsed.text).contains("Предложение");

    }
}

