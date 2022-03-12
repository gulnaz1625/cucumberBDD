package renastech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

public class Steps extends BrowserUtils {

    @Given("The user wants to see payment gateway website")
    public void the_user_wants_to_see_payment_gateway_website() {
        Driver.getDriver();
        BrowserUtils.setWaitTime();

        driver.get(ConfigurationsReader.getProperties("url"));
        driver.manage().window().maximize();
        System.out.println("The website is launched ");

    }
    @When("The user wants to buy elephant toy")
    public void the_user_wants_to_buy_elephant_toy() {

    }
    @Then("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("The user wants to pay now")
    public void the_user_wants_to_pay_now() {

    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {

    }

}
