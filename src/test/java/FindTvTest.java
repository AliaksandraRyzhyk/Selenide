import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;


public class FindTvTest {
    public static void setUp() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }

    @Test
    public void testFind() {
        open("https://www.onliner.by/");

        MainPage mainPage = page(MainPage.class);

        mainPage
                .chooseElementTv()
                .chooseElementSamsung()
                .chooseElementLg();

        Assertions.assertFalse(mainPage.isSelectedSamsung());

        Assertions.assertTrue(mainPage.isElementsCollectionContainsText());
    }
}


