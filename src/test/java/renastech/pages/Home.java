package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class Home extends BrowserUtils {
    public Home(){
        PageFactory.initElements(driver,this); }
    @FindBy(className = "button special")
    private WebElement buyNow;

}
