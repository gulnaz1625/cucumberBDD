package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class Payment extends BrowserUtils {
    public Payment() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "card_nmuber")
    private WebElement cardnumber;
    @FindBy(id = "month")
    private WebElement month;
    @FindBy(id = "year")
    private WebElement year;
    @FindBy(id = "cvv_code")
    private WebElement cvvCode;
    @FindBy(xpath = "//input[@value='Pay $20.00']")
    private WebElement payButton;
    @FindBy(xpath = "//h2[.='Payment succesfull!']")
    private WebElement messageText;



    public void setCardNumber(String CardNumber) {
        staticWait(2);
        cardnumber.sendKeys(CardNumber);
    }

    public void setMonth(String Month) {
        staticWait(2);
        month.sendKeys(Month);
    }

    public void setYear(String Year) {
        staticWait(2);
        year.sendKeys(Year);
    }

    public void setCVVCode(String CVVCode) {
        staticWait(2);
        cvvCode.sendKeys(CVVCode);

    }
    public void setPayButton(){
        staticWait(2);
        payButton.click();
    }
    public void setMessageText(String Message){
        staticWait(2);
        messageText.getText();
    }

}
