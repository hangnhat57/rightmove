package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by NhatDell on 06-Jul-17.
 */
public class PropertySearchPage {
    public PropertySearchPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID,id = "minPrice")
    public WebElement select_MinPrice;
    @FindBy(how = How.ID,id = "maxPrice")
    public WebElement select_MaxPrice;
    @FindBy(how = How.ID,id = "minBedrooms")
    public WebElement select_MinBedrooms;
    @FindBy(how = How.ID,id = "maxBedrooms")
    public WebElement select_MaxBedrooms;
    @FindBy(how = How.ID,id = "submit")
    public WebElement btn_findproperty;

    public void _EnterPriceRange(String min,String max){
        Select Min = new Select(select_MinPrice);
        if (!min.equals("No min")) {
            Min.selectByValue(min);
        }
        Select Max = new Select(select_MaxPrice);
        if(!max.equals("No max")) {
            Max.selectByValue(max);
        }
    }

    public void _EnterNoOfBedRoom(String min,String max){
        Select Min = new Select(select_MinBedrooms);
        if (!min.equals("No min")) {
            Min.selectByValue(min);
        }
        Select Max = new Select(select_MaxBedrooms);
        if(!max.equals("No max")) {
            Max.selectByValue(max);
        }
    }
    public  void  _ClickFindProperty(){
        btn_findproperty.click();
    }


}
