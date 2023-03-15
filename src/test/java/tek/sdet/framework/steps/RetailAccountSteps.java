package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.datatable.DataTable;
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
		sendText(factory.accountPage().profileNameInputField, DataGeneratorUtility.data("fullName"));
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField, DataGeneratorUtility.data("phoneNumber"));
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
	   logger.info("user clicked on address option");
	}
	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> addressInfo= dataTable.asMaps(String.class, String.class);
	    selectByValue(factory.accountPage.country,DataGeneratorUtility.data(addressInfo.get(0).get("country")));
	    sendText(factory.accountPage.addressFullNameField, DataGeneratorUtility.data(addressInfo.get(0).get("fullName")));
	    sendText(factory.accountPage.addressPhoneNumberField, DataGeneratorUtility.data(addressInfo.get(0).get("phoneNumber")));
	    sendText(factory.accountPage.AddressField,DataGeneratorUtility.data(addressInfo.get(0).get("StreetAddress")));
	    sendText(factory.accountPage.apartmentField, DataGeneratorUtility.data(addressInfo.get(0).get("apt")));
	    sendText(factory.accountPage.cityField, DataGeneratorUtility.data(addressInfo.get(0).get("city")));
	    selectByValue(factory.accountPage.stateDropDown, DataGeneratorUtility.data(addressInfo.get(0).get("state")));
	    sendText(factory.accountPage.zipCodeField,DataGeneratorUtility.data(addressInfo.get(0).get("zipcode")));
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
	
	
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	    click(factory.accountPage().editAddressBtn);
	    logger.info("user clicked om edit address option");
	}
	@When("user fill new address form with below information")
	public void userFillEditAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> editAddressInfo= dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().country);
	    selectByVisibleText(factory.accountPage.country,DataGeneratorUtility.data(editAddressInfo.get(0).get("country")));
	    clearTextUsingSendKeys(factory.accountPage().addressFullNameField);
	    sendText(factory.accountPage.addressFullNameField, DataGeneratorUtility.data(editAddressInfo.get(0).get("fullName")));
	    clearTextUsingSendKeys(factory.accountPage().addressPhoneNumberField);
	    sendText(factory.accountPage.addressPhoneNumberField, DataGeneratorUtility.data(editAddressInfo.get(0).get("phoneNumber")));
	    clearTextUsingSendKeys(factory.accountPage().AddressField);
	    sendText(factory.accountPage.AddressField,DataGeneratorUtility.data(editAddressInfo.get(0).get("StreetAddress")));
	    clearTextUsingSendKeys(factory.accountPage().apartmentField);
	    sendText(factory.accountPage.apartmentField, DataGeneratorUtility.data(editAddressInfo.get(0).get("apt")));
	    clearTextUsingSendKeys(factory.accountPage().cityField);
	    sendText(factory.accountPage.cityField, DataGeneratorUtility.data(editAddressInfo.get(0).get("city")));
	    clearTextUsingSendKeys(factory.accountPage().stateDropDown);
	    selectByVisibleText(factory.accountPage.stateDropDown, DataGeneratorUtility.data(editAddressInfo.get(0).get("state")));
	    clearTextUsingSendKeys(factory.accountPage().zipCodeField);
	    sendText(factory.accountPage.zipCodeField,DataGeneratorUtility.data(editAddressInfo.get(0).get("zipcode")));
	    logger.info("user added new addss information provided in data table");;
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
	   click(factory.accountPage().updateAddressBtn);
	   logger.info("user clicked on update address button");
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence((factory.accountPage().addressUpdatedSuccessfully));
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedSuccessfully));
		logger.info("Address updated successfully");
	}



	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	   click(factory.accountPage().removeAddressBtn);
	   logger.info("user clicked on remove address button");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	   
	    logger.info("address removed");;
	}


	
	
	
	
	
	
	
	
	
	
	
	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> updatePassword = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassword,DataGeneratorUtility.data(updatePassword.get(0).get("previousPassword")));
		sendText(factory.accountPage().newPassword,DataGeneratorUtility.data(updatePassword.get(0).get("newPassword")));
		sendText(factory.accountPage().confirmPassword, DataGeneratorUtility.data(updatePassword.get(0).get("confirmPassword")));
	    logger.info("user filled the updatePassword information form" +"with updated password of "+ DataGeneratorUtility.data(updatePassword.get(0).get("newPassword")));
	   	}
	
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage.changePassword);
	    logger.info("user clicked on chnaged password button");
	}
	@Then("a message should be displayed2 {string}")
	public void aMessageShouldBeDisplayed2() {
		waitTillPresence(factory.accountPage.passwordUpdatedMessage);
	   //Assert.assertEquals(expectedMessage, factory.accountPage.passwordUpdatedMessage.getText());
	    Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordUpdatedMessage));
	    logger.info("Password Updated Successfully");
	}
	
		
	
	
	
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPaymentMethod);
	    logger.info("user clicked on add a payment method");
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(io.cucumber.datatable.DataTable dataTable) {
		   List<Map<String, String>> addPayementMethod = dataTable.asMaps(String.class, String.class);
		   sendText(factory.accountPage().cardNumber, DataGeneratorUtility.data(addPayementMethod.get(0).get("cardNumber")));
		   sendText(factory.accountPage().nameOnCard, DataGeneratorUtility.data(addPayementMethod.get(0).get("nameOnCard")));
		   selectByVisibleText(factory.accountPage.expirationMonth,DataGeneratorUtility.data(addPayementMethod.get(0).get("expirationMonth")));
		    //selectByVisibleText(factory.accountPage.expirationMonth,DataGeneratorUtility.data(addPayementMethod.get(0).get("expirationYear")));
           sendText(factory.accountPage.securityCode,DataGeneratorUtility.data(addPayementMethod.get(0).get("securityCode")));;
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		  click(factory.accountPage().paymentSubmitBtn);
		  logger.info("user clicked on add card button");
	}
	@Then("a message should be seen {string}")
	public void aMessageShouldBeSeen(String string) {
		waitTillPresence(factory.accountPage.paymentAddedMessage);
		   //Assert.assertEquals(expectedMessage, factory.accountPage.passwordUpdatedMessage.getText());
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentAddedMessage));
	    logger.info("Payment Method Added Successfully");
	}

	
	
	
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().existingCardInfo);
	    click(factory.accountPage().editPaymentMethod);
	    logger.info("User clicked on edit payement method");
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String, String>> editPayementMethod = dataTable.asMaps(String.class, String.class);
		 clearTextUsingSendKeys(factory.accountPage().cardNumber);
		   sendText(factory.accountPage().cardNumber, DataGeneratorUtility.data(editPayementMethod.get(0).get("cardNumber")));
		   clearTextUsingSendKeys(factory.accountPage().nameOnCard);
		   sendText(factory.accountPage().nameOnCard, DataGeneratorUtility.data(editPayementMethod.get(0).get("nameOnCard")));
		   clearTextUsingSendKeys(factory.accountPage().expirationMonth);
		   selectByVisibleText(factory.accountPage.expirationMonth,DataGeneratorUtility.data(editPayementMethod.get(0).get("expirationMonth")));
		   //selectByVisibleText(factory.accountPage.expirationMonth,DataGeneratorUtility.data(addPayementMethod.get(0).get("expirationYear")));
		   clearTextUsingSendKeys(factory.accountPage().securityCode);
          sendText(factory.accountPage.securityCode,DataGeneratorUtility.data(editPayementMethod.get(0).get("securityCode")));
		
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	  click(factory.accountPage().updateYourCard);
	  logger.info("user clicked on updateYourCard");
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().paymentUpdatedMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentUpdatedMessage));
		logger.info("Payent method updated" );
	}


	
	
	
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
	 click(factory.accountPage().existingCardInfo);
	 click(factory.accountPage().removeCardInfo);
	 logger.info("user clicked on remove the card info");
	 
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
	    waitTillPresence(factory.accountPage().newCardInfoPage);
	    Assert.assertTrue(isElementDisplayed(factory.accountPage().newCardInfoPage));
	    logger.info("card informationed is removed");
	    
	}
	
}
