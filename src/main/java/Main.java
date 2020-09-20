
import org.graalvm.compiler.debug.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.util.List;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
public class Main {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://forms.office.com/Pages/ResponsePage.aspx?id=DQSIkWdsW0yxEjajBLZtrQAAAAAAAAAAAAN__tQlYTdURExDM0ZZQVBZQzIyRjQzMjNMTFk3RTYzMy4u");
        WebElement CheckBoxes = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div/label/input"));
        CheckBoxes.click();

        WebElement RatingCheckBoxes = driver.findElement(By.xpath(""));
        RatingCheckBoxes.click();

        WebElement SubmitBtn = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[3]/div[1]/button/div"));
        SubmitBtn.click();

        WebElement ThankYouMessage = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/span"));
        Assert.assertTrue(ThankYouMessage.getText().contains("Your response was submitted."));
        driver.close();


    }




}