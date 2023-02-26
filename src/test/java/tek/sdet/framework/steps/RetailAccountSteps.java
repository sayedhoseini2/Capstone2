package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField, phoneValue);
		logger.info("user updated Name and Phone values ");
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().profileUpdateButton);
		logger.info("user clicked on Update button");
	}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	   click(factory.accountPage().addAddressIcon);
	   //check above addaddressoption? it is addAdresssIcon method for me
	   logger.info("user clicked on address option");
	}
	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> addressInfo= dataTable.asLists(String.class);
	    selectByVisibleText(factory.accountPage.country,DataGeneratorUtility.data(addressInfo.get(0).get(0)));
	    sendText(factory.accountPage.addressFullNameField, DataGeneratorUtility.data(addressInfo.get(0).get(1)));
	    sendText(factory.accountPage.addressPhoneNumberField, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
	    sendText(factory.accountPage.AddressField,DataGeneratorUtility.data(addressInfo.get(0).get(3)));
	    sendText(factory.accountPage.apartmentField, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
	    sendText(factory.accountPage.cityField, DataGeneratorUtility.data(addressInfo.get(0).get(5)));
	    selectByVisibleText(factory.accountPage.stateDropDown, DataGeneratorUtility.data(addressInfo.get(0).get(6)));
	    sendText(factory.accountPage.zipCodeField,DataGeneratorUtility.data(addressInfo.get(0).get(7)));
	    logger.info("user added new addss information provided in data table");	    
	}
	@When("User click Add address button")
	public void userClickAddAddressButton() {
	   click(factory.accountPage.addYourAddessBtn);
	   logger.info("user clicked on add address button");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		waitTillPresence(factory.accountPage.addressAddedMessage);
		Assert.assertEquals(expectedMessage, factory.accountPage.addressAddedMessage.getText());
	    logger.info("Address Added Successfully");
	}
}
