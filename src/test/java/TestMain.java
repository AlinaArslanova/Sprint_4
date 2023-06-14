import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class TestMain {

        WebDriver driver;

        @Before
        public void init() {

            /*WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();*/
           WebDriverManager.firefoxdriver().clearDriverCache().setup();
        driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        }
        @After
        public void clean(){

            driver.quit();
        }
    }
