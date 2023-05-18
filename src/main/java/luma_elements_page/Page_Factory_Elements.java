package luma_elements_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma_Base_page.Super_class;
import luma_genaric_functions.CommonMethods;
import luma_genaric_functions.Waithelper;

public class Page_Factory_Elements extends Super_class {// "extends" java inheritance concept

	public Page_Factory_Elements() {

		PageFactory.initElements(driver, this);
		// PageFactory.initElements(driver, this);// this(current class property class)
		// is java reserve keyword &
		// pageFactory.initElements coming from Selenium
		// pageFactoryElements is a constructor from java
	}

	// How we can store the webElement

	@FindBy(linkText = "Sign In") // Store all the webElement by@findby annotation.
	@CacheLookup // In order to find the cache memory so that my test case performance will be
					// faster.
	private WebElement signIn; // WebElement we declare the locator object name exam:Clicking signIn

	public WebElement getSignIn() {// Encapsulation concept: private access modifier & getter methood
		return signIn;
	}
//user_name//

	@FindBy(id = "email")
	@CacheLookup
	private WebElement UserName;

	public WebElement getUserName() {
		return UserName;
	}
//Password//

	@FindBy(xpath = "(//input[@type='password'])[1]")
	@CacheLookup
	private WebElement Password;

	public WebElement getPassword() {
		return Password;
	}

//signButtion//

	@FindBy(id = "send2")
	@CacheLookup
	private WebElement signButtion;

	public WebElement getsignButtion() {
		return signButtion;
	}

	// MenModule//

	@FindBy(id = "ui-id-5")
	@CacheLookup
	private WebElement SelectMenModule;

	public WebElement getSelectMenModule() {
		return SelectMenModule;
	}

	// topsfromeMenModule//

	@FindBy(id = "ui-id-17")
	@CacheLookup
	private WebElement SelecttopsfromeMenModule;

	public WebElement getSelecttopsfromeMenModule() {
		return SelecttopsfromeMenModule;
	}

	// clickJacket//

	@FindBy(id = "ui-id-19")
	@CacheLookup
	private WebElement clickJacket;

	public WebElement getclickJacket() {
		return clickJacket;
	}

	// clickPrFitJacket//

	@FindBy(xpath = "//img[@alt='Proteus Fitness Jackshirt']")
	@CacheLookup
	private WebElement clickPrFitJacket;

	public WebElement getclickPrFitJacket() {
		return clickPrFitJacket;
	}

	// size//

	@FindBy(xpath = "(//div[@class='swatch-option text'])[3]")
	@CacheLookup
	private WebElement selectsize;

	public WebElement getselectsize() {
		return selectsize;
	}

	// color//

	@FindBy(xpath = "//div[@id='option-label-color-93-item-50']")
	@CacheLookup
	private WebElement selectcolor;

	public WebElement getselectcolor() {
		return selectcolor;
	}

	// Quantity//

	@FindBy(xpath = "//input[@id='qty']")
	@CacheLookup
	private WebElement selectQuantity;

	public WebElement getselectQuantity() {
		return selectQuantity;
	}

	/// --ClickonAddtocart//

	@FindBy(xpath = "//button[@id='product-addtocart-button']")
	@CacheLookup
	private WebElement ClickonAddtocart;

	public WebElement getClickonAddtocart() {
		return ClickonAddtocart;
	}

	// shopping cart//

	@FindBy(xpath = "//a[normalize-space()='shopping cart']")
	@CacheLookup
	private WebElement clickshoppingcart;

	public WebElement getclickshoppingcart() {
		return clickshoppingcart;
	}

	// -proceed to checkout//

	@FindBy(xpath = "//button[@data-role='proceed-to-checkout']")
	@CacheLookup
	private WebElement clickPrcdChkt;

	public WebElement getclickPrcdChkt() {
		return clickPrcdChkt;
	}

	// ---newaddress//

	@FindBy(xpath = "//*[text()='New Address']")
	@CacheLookup
	private WebElement newaddress;

	public WebElement getnewaddress() {
		return newaddress;
	}

	// FristName//
	@FindBy(xpath = "//input[@name='firstname']")
	@CacheLookup
	private WebElement firstName;

	public WebElement getfirstName() {
		return firstName;
	}

	// LastName//

	@FindBy(xpath = "//input[@name='lastname']")
	@CacheLookup
	private WebElement lastName;

	public WebElement getlastName() {
		return lastName;
	}

	// Company//

	@FindBy(xpath = "//input[@name='company']")
	@CacheLookup
	private WebElement company;

	public WebElement getcompany() {
		return company;
	}

	// StAdress//

	@FindBy(xpath = "//*[@name='street[0]']")
	@CacheLookup
	private WebElement stAdress;

	public WebElement getstAdress() {
		return stAdress;
	}

	// City//

	@FindBy(xpath = "//input[@name='city']")
	@CacheLookup
	private WebElement city;

	public WebElement getcity() {
		return city;
	}

	// State//

	@FindBy(xpath = "//*[@name='region_id']")
	@CacheLookup
	private WebElement state;

	public WebElement getstate() {
		return state;
	}

	// ZipCode//

	@FindBy(xpath = "//*[@name='postcode']")
	@CacheLookup
	private WebElement zipCode;

	public WebElement getzipCode() {
		return zipCode;
	}

	// Country//

	@FindBy(xpath = "//*[@name='country_id']")
	@CacheLookup
	private WebElement country;

	public WebElement getcountry() {
		return country;
	}

	// PhoneNumber//

	@FindBy(xpath = "//*[@name='telephone']")
	@CacheLookup
	private WebElement phone;

	public WebElement getphone() {
		return phone;
	}

	// ship here//

	@FindBy(xpath = "//*[text()='Ship here']")
	@CacheLookup
	private WebElement shiphere;

	public WebElement getshiphere() {
		return shiphere;
	}

	// radial button//

	@FindBy(xpath = "//*[@class='radio']")
	@CacheLookup
	private WebElement ShipRadio;

	public WebElement getShipRadio() {
		return ShipRadio;
	}

	// click on next button//

	@FindBy(xpath = "(//*[@type='submit'])[2]")
	@CacheLookup
	private WebElement ClickNext;

	public WebElement getClickNext() {
		return ClickNext;
	}
	// checkBox//

	@FindBy(id = "billing-address-same-as-shipping-checkmo")
	@CacheLookup
	private WebElement checkBox;

	public WebElement getCheckBox() {
		return checkBox;
	}

	// ---place order button(getPlaceOrder//

	@FindBy(xpath = "(//*[@type='submit'])[3]")
	@CacheLookup
	private WebElement PlaceOrder;

	public WebElement getPlaceOrder() {
		return PlaceOrder;
	}

	/// ---------confirmation message//

	@FindBy(xpath = "//*[text()='Thank you for your purchase!']")
	@CacheLookup
	private WebElement confirmationmessage;

	public WebElement getconfirmationmessage() {
		return confirmationmessage;
	}

//------------//
	public void applicationLogin() throws InterruptedException {

		Waithelper.seleniumWait(getSignIn());
		CommonMethods.actionClick(getSignIn());

		Waithelper.seleniumWait(getUserName());
		getUserName().sendKeys(prop.getProperty("userName"));

		Waithelper.seleniumWait(getPassword());
		getPassword().sendKeys(prop.getProperty("passWord"));

		Waithelper.seleniumWait(getsignButtion());
		CommonMethods.actionClick(getsignButtion());

	}

	public void newAddress() {
		Waithelper.seleniumWait(getnewaddress());
		CommonMethods.jsClick(getnewaddress());

		Waithelper.seleniumWait(getfirstName());
		getfirstName().clear();
		getfirstName().sendKeys("Afroza");

		Waithelper.seleniumWait(getlastName());
		getlastName().clear();
		getlastName().sendKeys("Ak");

		Waithelper.seleniumWait(getcompany());
		getcompany().clear();
		getcompany().sendKeys("Global");

		Waithelper.seleniumWait(getstAdress());
		getstAdress().clear();
		getstAdress().sendKeys("16090 44th");

		Waithelper.seleniumWait(getcity());
		getcity().clear();
		getcity().sendKeys("Brooklya");

		Waithelper.seleniumWait(getstate());
		CommonMethods.dropdwn(getstate(), "New York");

		Waithelper.seleniumWait(getzipCode());
		getzipCode().clear();
		getzipCode().sendKeys("11208");

		Waithelper.seleniumWait(getcountry());
		CommonMethods.dropdwn(getcountry(), "United States");

		Waithelper.seleniumWait(getphone());
		getphone().clear();
		getphone().sendKeys("1234598");

		getshiphere().click();

	}

}
