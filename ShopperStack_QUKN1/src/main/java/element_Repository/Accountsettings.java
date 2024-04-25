package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Accountsettings extends BasePage
{

	public Accountsettings(WebDriver driver) 
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
	
	@FindBy(xpath="//*[@id=\"editaddress_fl\"]/path")
	private WebElement Editbutton;
	
	@FindBy(id ="Other")
	private WebElement other;
	
	@FindBy(id="Name")
	private WebElement 	UpName;
	
	@FindBy(id="House/Office Info")
	private WebElement UphouseofficeInfo;
	
	@FindBy(id="Street Info")
	private WebElement UpStreetinfo;
	
	@FindBy(id="Country")
	private WebElement UpCountry;
	
	@FindBy(id="State")
	private WebElement UpState;
	
	@FindBy(id="City")
	private WebElement UpCity;
	
	@FindBy(id="Landmark")
	private WebElement UPlandmark;
	
	@FindBy(id="Pincode")
	private WebElement UpPincode;
	
	@FindBy(id="Phone Number")
	private WebElement UpPhonenumber;
	
	@FindBy(id="Update Address")
	private WebElement Upaddressbutton;
	
	@FindBy(id="//*[@id=\"root\"]/section[2]/div/section/div/div[2]/div[1]/div[2]/div/button/span[1]/svg/path")
	private WebElement Deleteaddress;
	
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
   public WebElement getEditbutton() {
		return Editbutton;
	}

   public WebElement getOther() {
		return other;
	}

   public WebElement getUpName() {
		return UpName;
	}

    public WebElement getUphouseofficeInfo() {
		return UphouseofficeInfo;
	}
    public WebElement getUpStreetinfo() {
		return UpStreetinfo;
	}

    public WebElement getUpCountry() {
		return UpCountry;
	}
     public WebElement getUpState() {
		return UpState;
	}
    public WebElement getUpCity() {
		return UpCity;
	}

    public WebElement getUPlandmark() {
		return UPlandmark;
	}

    public WebElement getUpPincode() {
		return UpPincode;
	}

    public WebElement getUpPhonenumber() {
		return UpPhonenumber;
	}

   public WebElement getUpaddressbutton() {
		return Upaddressbutton;
	}

    public WebElement getDeleteaddress() {
		return Deleteaddress;
	}
}

   // public void performaddaddresses(String name,String Houseofficeinfo,String Streetinfo,String Landmark,String Country,String State,String City,String Pincode,String Phonenumber)
    //{
		
    //getMyProfile().click();
    //getMyaddresses().click();
    //getAddAddress().click();
    //getHome().click();
    //getName().sendKeys(name);
    //getHouseofficeInfo().sendKeys(Houseofficeinfo);
    //getStreetinfo().sendKeys(Streetinfo);
    //getLandmark().sendKeys(Landmark);
    //Select Ctry=new Select(Country);
    //Ctry.selectByVisibleText("India");
    //Select St=new Select(State);
    //St.selectByVisibleText("Karnataka");
    //Select Cty=new Select(City);
    //Cty.selectByVisibleText("Mandya");
    //getPincode().sendKeys(Pincode);
    //getPhonenumber().sendKeys(Phonenumber);
    //getAddAddress().click();
		
    //	}
    //public void performUpdateAddresses(String Upname,String UpHouseofficeinfo,String UpStreetinfo,String UpLandmark,String UpCountry,String UpState,String UpCity,String UpPincode,String UpPhonenumber)
             
    //{
    //getEditbutton().click();
    //getOther().click();
    //getName().sendKeys(Upname);
    //getHouseofficeInfo().sendKeys(UpHouseofficeinfo);
    //getStreetinfo().sendKeys(UpStreetinfo);
    //getLandmark().sendKeys(UpLandmark);
    //Select Ctry=new Select(Country);
    //Ctry.selectByVisibleText("India");
    //Select St=new Select(State);
    //St.selectByVisibleText("Karnataka");
    //Select Cty=new Select(City);
    //Cty.selectByVisibleText("Mandya");
    //getPincode().sendKeys(UpPincode);
    //getPhonenumber().sendKeys(UpPhonenumber);
    //getUpaddressbutton().click();
    //
    //  }
    
//public void performDeleteaddress()
    //{
    // getDeleteaddress().click();
    //}
    

    //}
	
	







