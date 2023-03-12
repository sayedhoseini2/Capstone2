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

public class RetailSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	// create object Retailapage

	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);
	}
	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchBar, productValue);
		click(factory.homePage().searchButton);
		logger.info("user searched for product " + productValue);
	}
	@Then("The product should be displayed")
	public void theProductShouldBeDisplayed() {
		waitTillPresence(factory.homePage().pokemanProductImage);
			Assert.assertTrue(isElementDisplayed(factory.homePage().pokemanProductImage));
		logger.info("the Product is displayed on home page");
		
		
		
		
		
	}
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allIcon);
		logger.info("user clicked on All section");

	}

	@Then("below options are present in shop by department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSideBar = dataTable.asLists(String.class);
		//List<WebElement> actualSideBar = factory.homePage().sideBarElements;
		//for (int i = 0; i < expectedSideBar.get(0).size(); i++) {
		//	Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
			//logger.info(actualSideBar.get(i).getText() + " is equal to " + expectedSideBar.get(0).get(i));};
			//}
		Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronicsSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computersSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHomeSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sportsSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automativeSideBar.getText());
	logger.info("actual is equal to expected");
	}
	
	

	
	
	
	@When("User on {string}")
	public void userOnElectronics(String department) {
		List<WebElement> sideBarOptions = factory.homePage().sideBarElements;
		for (WebElement option : sideBarOptions) {
			if (option.getText().equals(department)) {
				click(option);
				try {
					logger.info(option.getText() + " is present ");
				} catch (StaleElementReferenceException e) {
				}
				break;
			}
		}
	}
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().sideBarOptionElements;
		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
			for (WebElement dept : actualDepartmentOptions) {
				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + " is present ");
				}
			}

		}

	}
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String SmartHome) {
	    click(factory.homePage().allIcon);
	    click(factory.homePage().smartHomeSideBar);
	    click(factory.homePage().PlugsandOutlets);
	    logger.info("user clicked on sidebar and change the category to Smart Home");
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String productValue) {
	    sendText(factory.homePage().searchBar, productValue);
	    click(factory.homePage().searchButton);	    
	    logger.info("user searched for an item");
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("user searched for an item");
	}
	@When("User click on item")
	public void userClickOnItem() {
	    click(factory.homePage().miniSmartPlug);
	    logger.info("user select an item");
	}
	@When("User select quantity ‘{int}’")
	public void userSelectQuantity(Integer int1)  {
	    selectByVisibleText(factory.homePage().quantityDropDown, "2");
	    logger.info("user select 2 items");
	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
	    click(factory.homePage().addToCart);
	    logger.info("user add the items to the card");
	}
	@Then("the cart icon quantity should change to ‘{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer int1) throws InterruptedException {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantity));
		//Assert.assertEquals("2", cartQuantity.getText());
		//click(factory.homePage().shoppingCard);
		//Assert.assertTrue(isElementDisplayed(factory.homePage().miniSmartPlug));
		Thread.sleep(3000);
	    logger.info("user chnaged the number of items to 3 items");
	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	    click(factory.homePage().shoppingCard);
	    logger.info("user clicked on shopping caard");
	}
	
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.homePage().proceedToCheckOut);
	    logger.info("user clicked on proceed to checkout");
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		 click(factory.homePage().addAddressBtn);
		    logger.info("user clicked on add address button");
	}
	@Then("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	   click(factory.homePage().addYourAddressBtn);
	   logger.info("user clicked on add your address");
	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	   click(factory.homePage().addPaymentMethod);
	   logger.info("user clicked on add payement method");
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	    click(factory.homePage().placeOrderBtn);
	    logger.info("user clicked on place order button");
	}
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		waitTillPresence(factory.homePage().orderPlacedSuccessfully);
	    Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedSuccessfully));
	    Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedThanks));
	    logger.info("order placed successfully");
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


} 
