package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	
	private POMFactory factory = new POMFactory();
	
	@When("User click on Orders section")
	public void user_click_on_orders_section() throws InterruptedException {
	    click(factory.orderPage().orderLink);
	    Thread.sleep(3000);
	    logger.info("user cicked on order link");
	}

	@When("User click on first order in list")
	public void user_click_on_first_order_in_list() {
	    //click(factory.orderPage().firstOrderOnList);
	    logger.info("user clicked on first order on list");
	}

	@When("User click on Cancel The Order button")
	public void user_click_on_cancel_the_order_button() {
	    click(factory.orderPage().cancelOrderBtn);
	    logger.info("user cancelled the order");
	}

	@When("User select the cancelation Reason ‘Bought wrong item’")
	public void user_select_the_cancelation_reason_bought_wrong_item() {
	    selectByVisibleText(factory.orderPage().cancelReasonInput, "Bought wrong item");
	    logger.info("user select Bought Woring Item");
	}

	@When("User click on Cancel Order button")
	public void user_click_on_cancel_order_button() {
	    click(factory.orderPage().cancelSubmitBtn);
	    logger.info("user cancelled the order");
	}

	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void a_cancelation_message_should_be_displayed_your_order_has_been_cancelled() {
		//waitTillPresence(factory.orderPage().yourOrderHasBeenCancelled);
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().yourOrderHasBeenCancelled));;
	}

	
	

}
