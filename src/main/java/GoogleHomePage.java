import org.openqa.selenium.WebDriver;

class GoogleHomePage extends Data
    {
        private final String searchField = ".//*[@id='gs_lc0']/input";
        private String hintList = ".//ul[@role='listbox']";
        GoogleHomePage(WebDriver driver)
        {
            this.driver = driver;
        }

        GoogleResultPage findByText(String text)
        {
        sendText(text, searchField);
        click(hintList + "/*/div[string()='" + text.toLowerCase() + "']");
        return new GoogleResultPage(driver);
        }
}
