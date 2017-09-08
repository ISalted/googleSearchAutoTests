import org.openqa.selenium.support.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;


public class Data
    {
        static WebDriver driver;

        String DOMAIN_URL = "https://www.google.com";

         void click(String clickXpath)
        {
            driver.findElement(By.xpath(clickXpath)).click();
        }

        void sendText(String inputText, String sendXpath)
        {
            driver.findElement(By.xpath(sendXpath)).sendKeys(inputText);
        }

        String getText(String inputXpath)
        {
        return driver.findElement(By.xpath(inputXpath)).getText();
        }

        void waitFor(String locator)
        {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        }
    }
