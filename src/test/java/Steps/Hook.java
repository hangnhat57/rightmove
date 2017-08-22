package Steps;

import Base.BaseUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by NhatDell on 06-Jul-17.
 */
public class Hook extends BaseUtils {
    private BaseUtils base;

    public Hook(BaseUtils base) {
        this.base = base;
    }

    @Before
    public void TestInit(){
        System.setProperty("webdriver.chrome.driver", "E://webdriver/chromedriver.exe");
        base.driver = new ChromeDriver();

    }
    @After
    public void TeardownTest(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("Scenario :" + scenario.getName().toString() + " is Failed");
        }else {
            System.out.println("Scenario :" + scenario.getName().toString() + " is Passed");
        }
        base.driver.quit();
    }
}
