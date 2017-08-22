package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by NhatDell on 06-Jul-17.
 */
public class ResultsPage {
    public ResultsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.CLASS_NAME,className = "searchTitle-heading")
    public WebElement SearchTitle;
    @FindBy(how = How.CLASS_NAME,className = "searchHeader-resultCount")
    public WebElement ResultsCount;

    public String _searchTitle(){
        return SearchTitle.getText().toString();
    }
    public int _resultsCount(){
        int foo = Integer.parseInt(ResultsCount.getText().toString());
        return foo;
    }
}
