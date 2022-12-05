import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class ReservationTest extends TestBase {
    HomePage homePageObj;
    ResultsPage resultsPageObj;
    AvailabilityPage availabilityPageObj;
    ConfirmationPage confirmationPageObj;
    String city = "alexandria, eg";
    String stDate = "2022-12-17";
    String enDate = "2022-12-19";


    @Test
    public void userCanReserveHotel() {
        homePageObj = new HomePage(driver);
        homePageObj.enterDestinationName(city);
        //wait for suggestions list
        WebDriverWait waitForLocationsList = new WebDriverWait(driver,Duration.ofSeconds(10));
        waitForLocationsList.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "/html/body/div[1]/div[2]/div/form/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")));
        //click the second option and enter duration
        homePageObj.locationSecondOption.click();
        homePageObj.enterDuration(stDate,enDate);
        homePageObj.clickSearchBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        resultsPageObj = new ResultsPage(driver);
        resultsPageObj.clickSeeAvailabilityBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,2500);");
        availabilityPageObj = new AvailabilityPage(driver);
        availabilityPageObj.ddl.selectByIndex(1);
        //reserve
        availabilityPageObj.clickReserveBtn();
        confirmationPageObj = new ConfirmationPage(driver);
        Assert.assertEquals("Tolip Hotel Alexandria", confirmationPageObj.hotelName.getText());
        Assert.assertEquals(stDate, confirmationPageObj.checkinDate.getText());
        Assert.assertEquals(enDate, confirmationPageObj.checkoutDate.getText());
    }
}
