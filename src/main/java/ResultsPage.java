
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ResultsPage extends BasePage{
    public ResultsPage(WebDriver driver) {
        super(driver);
    }
    WebElement seeAvailability= driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[1]/div[1]/div[4]/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]"));

    public void clickSeeAvailabilityBtn() {

        clickBtn(seeAvailability);
    }
}
