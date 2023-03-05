package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//input[@id='previousPasswordInput']")
	public WebElement previousPassword;
	
	@FindBy(xpath="//input[@id='newPasswordInput']")
	public WebElement newPassword;
	
	@FindBy(xpath="//input[@id='confirmPasswordInput']")
	public WebElement confirmPassword;
	
	@FindBy(xpath="//button[@id='credentialsSubmitBtn']")
	public WebElement changePassword;
	
	@FindBy (xpath="//div[contains(text(),'Password Updated Successfully')]")
	public WebElement passwordUpdatedMessage;
		
	@FindBy(xpath="//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy(id="logoutBtn")
	public WebElement logoutBtn;
	
	@FindBy(id ="nameInput")
	public WebElement profileNameInputField;
	
	@FindBy(id="personalPhoneInput")
	public WebElement profilePhoneNumberField;
	
	@FindBy(xpath ="//button[text()='Update']")
	public WebElement profileUpdateButton;
	
	@FindBy(xpath="//div[contains(text(),'Personal Information Updated Successfully')]")
		
	public WebElement personalInfoUpdateSuccessMessage;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/*[1]")
	public WebElement addAddressIcon;
	@FindBy(css = "#countryDropdown")
	public WebElement countryDropDown;
	@FindBy(css = "#fullNameInput")
	public WebElement addressFullNameField;
	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement addressPhoneNumberField;
	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement AddressField;
    @FindBy(xpath = "//input[@id='apartmentInput']")
    public WebElement apartmentField;
    @FindBy(css = "#cityInput")
	public WebElement cityField;
	@FindBy(xpath = "//select[@name='state']")
    public WebElement stateDropDown;
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipCodeField;
	@FindBy(css = "#addressBtn")
	public WebElement addYourAddessBtn;
	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement addressAddedMessage;

	public WebElement country;
	
	@FindBy(xpath="//p[contains(text(),'Add a payment method')]")
	public WebElement addPaymentMethod;
	
	@FindBy(xpath="//input[@id='cardNumberInput']")
	public WebElement cardNumber;
	
	@FindBy(xpath="//input[@id='nameOnCardInput']")
	public WebElement nameOnCard;
	
	@FindBy(xpath="//select[@id='expirationYearInput']")
	public WebElement expirationYear;
	
	@FindBy(xpath="//select[@id='expirationMonthInput']")
	public WebElement expirationMonth;
	
	@FindBy(xpath="//input[@id='securityCodeInput']")
	public WebElement securityCode;
	
	@FindBy(xpath="//button[@id='paymentSubmitBtn']")
	public WebElement paymentSubmitBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement paymentAddedMessage;

	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
	public WebElement editPaymentMethod;
	
	@FindBy(xpath="//button[@id='paymentSubmitBtn']")
	public WebElement updateYourCard;
	
    @FindBy(xpath="//div[contains(text(),'Payment Method updated Successfully')]")
	public WebElement paymentUpdatedMessage;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement existingCardInfo;
    
    
    @FindBy(xpath="//button[contains(text(),'remove')]")
	public WebElement removeCardInfo;
	
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h1[1]")	
	public WebElement newCardInfoPage;
	

}
