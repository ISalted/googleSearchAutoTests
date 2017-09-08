import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

class WixHomePage extends Data {

    private String logoPath = ".//*[@id='wm-logo']";

    public WixHomePage(WebDriver driver) {
        this.driver = driver;
    }


    public String getTextFromLogo()
    {
        String wixLogoText;

        try
            {
                waitFor(logoPath);
                wixLogoText = getText(logoPath);

            }
        catch (TimeoutException t)
            {
                waitFor(logoPath);
                wixLogoText = getText(logoPath);
            }
        return wixLogoText;

    }

}
