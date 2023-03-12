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
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class RetailOrderSteps extends CommonUtility{
	
	private static final boolean True = false;
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
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().yourOrderHasBeenCancelled));
	    logger.info("your oder has been cancelled");
	}

	@When("User click on Return Items button")
	public void user_click_on_return_items_button() {
	    click(factory.orderPage().returnBtn);
	    logger.info("user cliked on return item");
	}

	@When("User select the Return Reason ‘Item damaged’")
	public void user_select_the_return_reason_item_damaged() {
	    selectByVisibleText(factory.orderPage().cancelReasonInput,"Item damaged");
	    logger.info("user select the reason for cancellation");
	}

	@When("User select the drop off service ‘FedEx’")
	public void user_select_the_drop_off_service_fed_ex() {
	    selectByVisibleText(factory.orderPage().dropOffInput, "FedEx" );
	    logger.info("user selecc the drop off method");
	}

	@When("User click on Return Order button")
	public void user_click_on_return_order_button() {
	   click(factory.orderPage().returnOrder);
	   logger.info("user clicked on return order button");
	}

	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void a_cancelation_message_should_be_displayed_return_was_successful() throws InterruptedException {
		//waitTillPresence(factory.orderPage().returnWasSuccessfull);
		//Thread.sleep(3000);
		//waitTillPresence(factory.homePage().orderPlacedSuccessfully);
	    //Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedSuccessfully));
	   // Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedThanks));
	    logger.info("order placed successfully");
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().returnWasSuccessfull));
	    logger.info("return was successfull");
	}

	@When("User click on Review button")
	public void userClickOnReviewButton() {
	   click(factory.orderPage().reviewBtn);
	   logger.info("user clicked on review button");
	}
	@When("User write Review headline ‘ headline value’ and ‘review text’")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText() throws InterruptedException {
	    sendText(factory.orderPage().headLineInput, "item damged badly");
	    sendText(factory.orderPage().descriptionInput, DataGeneratorUtility.data("review"));
	    Thread.sleep(2000);
	    logger.info("user entered its review");
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	    click(factory.orderPage().reviewSubmitBtn);
	    logger.info("user clicked on the review button");
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		//waitTillPresence(factory.orderPage().reviewAddedMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewAddedMessage));
	    logger.info("Review Added Successfully");
	}


}
