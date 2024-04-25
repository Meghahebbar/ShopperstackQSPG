package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addaddress extends BasePage
{

	public Addaddress(WebDriver driver)
	{
		super(driver);

	}

	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[1]")
	private WebElement MyProfile;
	
	@FindBy(xpath ="//*[@id=\"root\"]/section[2]/div/div/div[3]/a[2]/div")
	WebElement Myaddresses;
	
	@FindBy(xpath ="//*[@id=\"root\"]/section[2]/div/section/div/div/a/button")
	private WebElement 	AddAddress;
	
	@FindBy(xpath ="//*[@id=\"Address Type\"]/section/label[1]/span[2]")
	private WebElement Home;
	
	@FindBy(id="Name")
	private WebElement 	Name;
	
	@FindBy(id="House/Office Info")
	private WebElement houseofficeInfo;
	
	@FindBy(id="Street Info")
	private WebElement Streetinfo;
	
	@FindBy(id="Country")
	private WebElement Country;
	
	@FindBy(id="State")
	private WebElement State;
	
	@FindBy(id="City")
	private WebElement City;
	
	@FindBy(id="Landmark")
	private WebElement landmark;
	
	@FindBy(id="Pincode")
	private WebElement Pincode;
	
	@FindBy(id="Phone Number")
	private WebElement Phonenumber;
	
	@FindBy(id="addAddress")
	private WebElement addaddressbutton;
	
	@FindBy(xpath="//*[@id=\"n15hdq8\"]/div[1]")
	private WebElement Toastermessage;

	public WebElement getMyProfile() {
		return MyProfile;
	}

	public WebElement getMyaddresses() {
		return Myaddresses;
	}

	public WebElement getAddAddress() {
		return AddAddress;
	}

	public WebElement getHome() {
		return Home;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getHouseofficeInfo() {
		return houseofficeInfo;
	}

	public WebElement getStreetinfo() {
		return Streetinfo;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getLandmark() {
		return landmark;
	}

	public WebElement getPincode() {
		return Pincode;
	}

	public WebElement getPhonenumber() {
		return Phonenumber;
	}

	public WebElement getAddaddressbutton() {
		return addaddressbutton;
	}

	public WebElement getToastermessage() {
		return Toastermessage;
	}

}