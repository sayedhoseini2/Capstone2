package tek.sdet.framework.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// syntax for finding UI elements and storing them in POM classes 
	/**
	 * @FindBy(locatorType = "value")
	 * public WebElement nameOfElement
	 */
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton; 
	
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	
	@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;
	
	@FindBy(xpath ="//a[text()='Account']")
	public WebElement accountOption;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allIcon;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsSideBar;
	
	@FindBy(xpath ="//span[text()='Computers']")
	public WebElement computersSideBar;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeSideBar;
	
	@FindBy(xpath ="//span[text()='Sports']")
	public WebElement sportsSideBar;
	
	@FindBy(xpath ="//span[text()='Automative']")
	public WebElement automativeSideBar;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarOptionElements;
	
	
	@FindBy(xpath="/span[contains(text(),'Smart Home Lightning')]")
	public WebElement SmartHomeLightning;
	
	@FindBy(xpath="//span[contains(text(),'Plugs and Outlets')]")
	public WebElement PlugsandOutlets;

	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/img[1]")
	public WebElement smartLedBulb;

	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	public WebElement quantityDropDown;

	@FindBy(xpath="//span[contains(text(),'Add to Cart')]")
	public WebElement addToCart;
	
    @FindBy(xpath="//p[contains(text(),'Wemo Mini Smart Plug')]")
	public WebElement miniSmartPlug;
    
    @FindBy(xpath="//p[contains(text(),'Cart')]")
    public WebElement shoppingCard;
    
    @FindBy(xpath=("//span[@id='cartQuantity']"))
    public WebElement cartQuantity;
 
    @FindBy(xpath="//button[@id='proceedBtn']")
	public WebElement proceedToCheckOut;

    @FindBy(xpath="//button[@id='addAddressBtn']")
	public WebElement addAddressBtn;

    @FindBy(xpath="//button[@id='addressBtn']")
	public WebElement addYourAddressBtn;

    @FindBy(xpath="//button[@id='addPaymentBtn']")
	public WebElement addPaymentMethod;

    @FindBy(xpath="//button[@id='placeOrderBtn']")
	public WebElement placeOrderBtn;

    @FindBy(xpath="//div[contains(text(),'Order Placed Successfully')]")
	public WebElement orderPlacedSuccessfully;
    

    @FindBy(xpath="//p[contains(text(),'Order Placed, Thanks')]")
	public WebElement orderPlacedThanks;
	
	

}
