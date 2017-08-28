//package Steps;
//
//import Base.BaseUtils;
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.IOUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.URISyntaxException;
//
///**
// * Created by NhatDell on 06-Jul-17.
// */
//public class Hook extends BaseUtils {
//    private BaseUtils base;
//
//    public Hook(BaseUtils base) {
//        this.base = base;
//    }
//
//    @Before
//    public void TestInit(){
//        System.setProperty("webdriver.chrome.driver", "E://webdriver/chromedriver.exe");
//        base.driver = new ChromeDriver();
//
//    }
//    @After
//    public void endTestCase(Scenario result) throws URISyntaxException, IOException {
//
//
//                final byte[] screenshot = ((TakesScreenshot) base.driver).getScreenshotAs(OutputType.BYTES);
//                result.embed(screenshot, "image/png");
//
//                 base.driver.quit();
//    }
//
//
//
//}
