import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TitleTest extends BaseTest {
    private void getPageTitle(String url, String expectedTitle) {
        driver.get(url);
        driver.manage().window().maximize();
        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @CsvSource({"https://siiportal.sii.pl, Logowanie na koncie"})
    @Tag("regression")
    @DisplayName("SiiPortal")
    public void shouldValidateCorrectTitleSiiPortal(String url, String expectedTitle) {
        getPageTitle(url, expectedTitle);
    }

    @ParameterizedTest
    @CsvSource({"https://www.onet.pl, Onet – Jesteś na bieżąco"})
    @Tag("regression")
    @DisplayName("Onet")
    public void shouldValidateCorrectTitleOnet(String url, String expectedTitle) {
        getPageTitle(url, expectedTitle);
    }

    @ParameterizedTest
    @CsvSource({"http://kotuszkowo.pl, Kotuszkowo- blog o kotach"})
    @Tag("regression")
    @DisplayName("Kotuszkowo")
    public void shouldValidateCorrectTitleKotuszkowo(String url, String expectedTitle) {
        getPageTitle(url, expectedTitle);
    }

    @ParameterizedTest
    @CsvSource({"https://www.filmweb.pl, Filmweb - filmy takie jak Ty!"})
    @Tag("regression")
    @DisplayName("Filmweb")
    public void shouldValidateCorrectTitleFilmweb(String url, String expectedTitle) {
        getPageTitle(url, expectedTitle);
    }

    @ParameterizedTest
    @CsvSource({"https://www.selenium.dev/documentation/en/webdriver, WebDriver | Selenium"})
    @Tag("regression")
    @DisplayName("Selenium docs")
    public void shouldValidateCorrectTitleSeleniumDocs(String url, String expectedTitle) {
        getPageTitle(url, expectedTitle);
    }
}
