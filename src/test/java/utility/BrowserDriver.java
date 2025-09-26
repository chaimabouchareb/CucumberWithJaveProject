package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public static ChromeOptions options;

    public BrowserDriver(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperties("wehdriver.http.factory", "jdk-http-client");
        System.setProperties("webdriver.chrome.driver", System.getProperties("user.dir")+"src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("index.html");
    }

    public void close(){
        this.driver.close();
    }
}
