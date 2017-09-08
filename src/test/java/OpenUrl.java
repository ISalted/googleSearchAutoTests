import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class OpenUrl extends Data
{
    @BeforeTest
    public void setUp()
    {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(DOMAIN_URL);
        driver.manage().window().maximize();
    }

    @Test
    public void openUrl()
    {
        GoogleHomePage inGooglePage = new GoogleHomePage(driver);
        GoogleResultPage inGoogleResultPage = inGooglePage.findByText("Wix");
        WixHomePage wixHomePage = inGoogleResultPage.getWixMainPage();
        assertEquals("Wix", wixHomePage.getTextFromLogo());
    }

    @AfterTest


    public void tearDown()
    {
        driver.quit();
    }
}