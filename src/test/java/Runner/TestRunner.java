package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

/**
 * Created by NhatDell on 06-Jul-17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/Features"},glue = {"Steps"},format = {"pretty","html:target/cucumber","json:target/cucumber.json"})
public class TestRunner {
}


