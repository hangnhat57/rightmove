package Steps;

import Base.BaseUtils;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by NhatDell on 28-Aug-17.
 */
public class Facebook extends BaseUtils{

    private BaseUtils base;

    public Facebook(BaseUtils base) {
        this.base = base;
    }

    @Given("^I navigate to facebook$")
    public void iNavigateToFacebook() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.driver.navigate().to("http://facebook.com");
    }



    @Then("^I should at checkpoint page$")
    public void iShouldAtCheckpointPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hi");
    }

    @And("^I enter password$")
    public void iEnterPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("123456");
    }

    @And("^I enter username$")
    public void iEnterUsername() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("hangnhat57@me.com");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        base.driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();

    }

    @Given("^I navigate to covesta page$")
    public void iNavigateToCovestaPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.driver.navigate().to("http://covesta.com.au");
    }

    @And("^I should see the homepage$")
    public void iShouldSeeTheHomepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebDriverWait wait = new WebDriverWait(base.driver,30);
        wait.until(ExpectedConditions.attributeToBe(By.id("loader-wrapper"),"style","display:none;"));
        base.driver.findElement(By.partialLinkText("Log")).click();
    }
}
