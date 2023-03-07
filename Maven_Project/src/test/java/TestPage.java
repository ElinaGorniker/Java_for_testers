import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

public class TestPage {
    @Test
    public static void openGooglePageInChrome() {
        File file = new File("C:\\Users\\e.gorniker\\IdeaProjects\\Maven_Project\\src\\main\\resources\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();
    }
    @Test
    public static void openGooglePageInFirefox() {
        File file = new File("C:\\Users\\e.gorniker\\IdeaProjects\\Maven_Project\\src\\main\\resources\\geckodriver.exe");
        System.setProperty("webdriver.firefox.driver", file.getAbsolutePath());
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        driver.quit();
    }

}
