import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AvailabilityPage extends BasePage{
    public AvailabilityPage(WebDriver driver) {
        super(driver);
    }
    WebElement radioBtn = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/div[8]/div[1]/div[4]/div[3]/div[1]/form[1]/div[38]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/div[1]/label[2]/div[1]"));
    Select ddl= new Select(driver.findElement(By.cssSelector("select[name=\"nr_rooms_78883120_91939502_0_2_0\"]")));
    WebElement reserveBtn = driver.findElement(By.id("b_tt_holder_2"));
    public void clickRadioBtn(){
        clickBtn(radioBtn);
    }
    public void clickReserveBtn(){
        clickBtn(reserveBtn);
    }
}
