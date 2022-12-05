import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;

public class TestBase {
    ChromeDriver driver;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.booking.com/index.en.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterTest
    public void teardown(){
       driver.quit();
    }

}
