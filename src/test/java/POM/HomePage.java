package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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


    public void _EnterSearchLocation(String location){
        txt_searchLocation.sendKeys(location);
    }
    public void _ClickBuy(){
        btn_buy.click();
    }
}
