package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.FileFilters.withExtension;

public class DownloadTest {

    @Test
    @Description("Manually generated test")
    @DisplayName("Download presentation file from Clients tab")
    void presentationDownload() throws IOException {
        Configuration.downloadsFolder = "downloads";

        open("https://dot-dot.ru/media/download/7566");
        File downloadedFile = $("about__link").download(withExtension("htm"));
    }
}

