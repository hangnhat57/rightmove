package Steps;

import Base.BaseUtils;
import POM.HomePage;
import POM.PropertySearchPage;
import POM.ResultsPage;
import Tranformer.PriceTranform;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

/**
 * Created by NhatDell on 06-Jul-17.
 */
public class MyStepdefs extends BaseUtils{

    private BaseUtils base;

    public MyStepdefs(BaseUtils base) {
        this.base = base;
    }

    @Given("^I navigate to home page$")
    public void iNavigateToHomePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.driver.navigate().to("http://www.rightmove.co.uk");
    }

    @And("^I enter (.*) as location to search$")
    public void iEnterMiltonKeynesAsLocationToSearch(String location) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HomePage page = new HomePage(base.driver);
        page._EnterSearchLocation(location);
    }

    @And("^I click on For sale button$")
    public void iClickOnForSaleButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HomePage page = new HomePage(base.driver);
        page._ClickBuy();
    }

    @And("^I enter Price range from (.*) to (.*)$")
    public void iEnterPriceRangeFromTo(@Transform(PriceTranform.class) String min,@Transform(PriceTranform.class) String max) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PropertySearchPage page = new PropertySearchPage(base.driver);
        page._EnterPriceRange(min,max);
    }

    @And("^I enter Number of bedrooms from (.*) to (.*)$")
    public void iEnterNoOfBedroomsFromTo(String min,String max) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PropertySearchPage page = new PropertySearchPage(base.driver);
        page._EnterNoOfBedRoom(min,max);
    }

    @And("^I Click FindProperty button$")
    public void iClickFindPropertyButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PropertySearchPage page = new PropertySearchPage(base.driver);
        page._ClickFindProperty();
    }

    @Then("^I should get the results for (.*)$")
    public void iShouldGetTheResultsForPropertiesForSaleInMiltonKeynesBuckinghamshireUpTo£Bed(String title) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ResultsPage page = new ResultsPage(base.driver);
        Assert.assertEquals("It's same",page._searchTitle(),title);
        // This one for assert from number of row from database but currently I just give a dummy step
        Assert.assertEquals("Same!",page._resultsCount(),page._resultsCount());
    }
}
