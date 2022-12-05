import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage extends BasePage{
    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }
    WebElement checkinDate = driver.findElement(By.xpath("//*[@id=\"bodyconstraint-inner\"]/div[3]/div[2]/aside/div/section[1]/div/div/div[1]/div[1]/div/div[1]/time/span[1]"));
    WebElement checkoutDate = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/aside/div/section[1]/div/div/div[1]/div[1]/div/div[2]/time/span[1]"));
    WebElement hotelName = driver.findElement(By.cssSelector("h1[class=\"fcab3ed991\"]"));
}
