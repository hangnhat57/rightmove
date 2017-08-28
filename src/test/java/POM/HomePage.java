package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by NhatDell on 06-Jul-17.
 */
public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID,id = "searchLocation")
    public WebElement txt_searchLocation;
    @FindBy(how = How.ID,id = "buy")
    public WebElement btn_buy;
    @FindBy(how = How.ID,id = "typeaheadList")
    public WebElement suggest_list;
    @FindBy(how = How.XPATH,xpath = "//*[@id=\"typeaheadList\"]/li[2]/a")
    public WebElement second_suggest;
    @FindBy(how = How.XPATH,xpath = "//*[@id=\"typeaheadList\"]/li[2]/a/span")
    public WebElement hightlight;


    public void _EnterSearchLocation(String location){
        txt_searchLocation.sendKeys(location);
    }
    public void _ClickBuy(){
        btn_buy.click();
    }
    public void _Waitforsuggestion(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(suggest_list));
    }
}
