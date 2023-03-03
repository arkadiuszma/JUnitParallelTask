import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Execution(ExecutionMode.CONCURRENT)
public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    protected void setupDriver() {
        driver = new ChromeDriver();
    }

    @AfterEach
    protected void tearDown() {
        driver.quit();
    }

}
