import org.openqa.selenium.WebDriver;

class GoogleResultPage extends Data
    {
        private String firstResult = ".//*[@id='rso']/div/*/div[contains(.,'wix.com')]/div/div/h3";

        GoogleResultPage(WebDriver driver)
        {
            this.driver = driver;
        }


        WixHomePage getWixMainPage()
        {
            click(firstResult);
            return new WixHomePage(driver);

        }
}
