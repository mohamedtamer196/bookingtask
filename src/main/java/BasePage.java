import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    //constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void clickBtn(WebElement btn) {
        btn.click();
    }

    public void fillTextField(WebElement textField, String text){
        textField.clear();
        textField.sendKeys(text);
    }

}
