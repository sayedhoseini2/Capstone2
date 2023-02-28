package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy(xpath="//button[@id='logoutBtn']")
	public WebElement logoutBtn;
	
	@FindBy(id ="nameInput")
	public WebElement profileNameInputField;
	
	@FindBy(id="personalPhoneInput")
	public WebElement profilePhoneNumberField;
	
	@FindBy(xpath ="//button[text()='Update']")
	public WebElement profileUpdateButton;
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
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
	

}
