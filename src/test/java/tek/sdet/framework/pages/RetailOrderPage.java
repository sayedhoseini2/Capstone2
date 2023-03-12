package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath="//a[@id='orderLink']")
	public WebElement orderLink;
	
	@FindBy(xpath="//p[contains(text(),'Insignia 32-inch Class F20 Series Smart HD 720p Fi')]")
	public WebElement firstOrderOnList;

	@FindBy(xpath="//button[@id='cancelBtn']")
	public WebElement cancelOrderBtn;

	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement cancelReasonInput;

	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement cancelSubmitBtn;

	@FindBy(xpath="//p[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement yourOrderHasBeenCancelled;
	
    @FindBy(xpath="//button[@id='returnBtn']")
	public WebElement returnBtn;

    @FindBy(xpath="//select[@id='dropOffInput']")
	public WebElement dropOffInput;

    @FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement returnOrder;
        
    @FindBy(xpath="/p[contains(text(),'Return was successfull')]")
	public WebElement returnWasSuccessfull;

    @FindBy(xpath="//button[@id='reviewBtn']")
	public WebElement reviewBtn;

    @FindBy(xpath="//input[@id='headlineInput']")
	public WebElement headLineInput;

    @FindBy(xpath="//textarea[@id='descriptionInput']")
	public WebElement descriptionInput;

    @FindBy(xpath="//button[@id='reviewSubmitBtn']")
	public WebElement reviewSubmitBtn;

    @FindBy(xpath="//div[contains(text(),'Your review was added successfully')]")
	public WebElement reviewAddedMessage;
	
	
	
}
