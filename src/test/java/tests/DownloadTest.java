package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static Utils.Files.readTextFromFile;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.FileFilters.withExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class DownloadTest {

    @Test
    @Description("Soon to be implemented by me (or QA engineers)")
    @DisplayName("Загружаем файл с презентацией компании")
    void presentationDownload() throws IOException {
        Configuration.downloadsFolder = "downloads";

        open("https://dot-dot.ru/media/download/7566");
        File downloadedFile = $("about__link").download(withExtension("htm"));
        String fileContent = readTextFromFile(downloadedFile);
        assertThat(fileContent, containsString("Презентация"));
    }
}

