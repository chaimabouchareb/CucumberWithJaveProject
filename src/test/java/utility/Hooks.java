package utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static BrowserDriver driver;
    public static ChromeOptions options;

    @org.junit.Before
    public void steUp{
        driver = new BrowserDriver();
    }
    @org.junit.After
    public void tearDown(){
        driver.close();
    }
}
