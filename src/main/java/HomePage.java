import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    WebElement destinationSearchField = driver.findElement(By.id("ss"));
    WebElement locationSecondOption = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]"));

    WebElement searchBtn = driver.findElement(By.xpath("//span[normalize-space()='Search']"));

    public void enterDestinationName(String city){
        destinationSearchField.clear();
        fillTextField(destinationSearchField, city);
    }
    public void enterDuration(String stDate, String enDate){
        WebElement dateSelection = driver.findElement(By.cssSelector("td[data-date='" + stDate + "']"));
        clickBtn(dateSelection);
        WebElement dateSelection2 = driver.findElement(By.cssSelector("td[data-date='" + enDate + "']"));
        clickBtn(dateSelection2);
    }
    public void clickSearchBtn(){

        clickBtn(searchBtn);
    }

}
