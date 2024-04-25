package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateAddress extends BasePage
{

	public UpdateAddress(WebDriver driver) 
	{
		super(driver);
		
		
	}

@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[1]")
private WebElement MyProfile;
	
@FindBy(xpath ="//*[@id=\"root\"]/section[2]/div/div/div[3]/a[2]/div")
private WebElement Myaddresses;

@FindBy(xpath="//*[@id=root]/section[2]/div/section/div/div[2]/div[4]")
private WebElement selectedaddress;
	
@FindBy(xpath="//*[@id=\"editaddress_fl\"]/path")
private WebElement Editbutton;

@FindBy(id ="Other")
private WebElement other;

@FindBy(id="Name")
private WebElement 	UpName;

@FindBy(id="House/Office Info")
private WebElement UphouseofficeInfo;

//@FindBy(id="Street Info")
//private WebElement UpStreetinfo;

//@FindBy(id="Country")
//private WebElement UpCountry;

//@FindBy(id="State")
//private WebElement UpState;

//@FindBy(id="City")
//private WebElement UpCity;

//@FindBy(id="Landmark")
//private WebElement UPlandmark;

//@FindBy(id="Pincode")
//private WebElement UpPincode;

@FindBy(id="Phone Number")
private WebElement UpPhonenumber;

@FindBy(id="Update Address")
private WebElement Upaddressbutton;

@FindBy(xpath="//*[@id=\"8d1tzfu\"]/div[1]/div[2]")
private WebElement Toastermessage;

public WebElement getMyProfile() {
	return MyProfile;
}

public WebElement getMyaddresses() {
	return Myaddresses;
}

public WebElement getSelectedaddress() {
	return selectedaddress;
}

public WebElement getEditbutton() {
	return Editbutton;
}

public void setSelectedaddress(WebElement selectedaddress) {
	this.selectedaddress = selectedaddress;
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

//public WebElement getUpStreetinfo() {
	//return UpStreetinfo;
//}

//public WebElement getUpCountry() {
	//return UpCountry;
//}

//public WebElement getUpState() {
	//return UpState;
//}

//public WebElement getUpCity() {
	//return UpCity;
//}

//public WebElement getUPlandmark() {
	//return UPlandmark;
//}

//public WebElement getUpPincode() {
	//return UpPincode;
//}

public WebElement getUpPhonenumber() {
	return UpPhonenumber;
}

public WebElement getUpaddressbutton() {
	return Upaddressbutton;
}

public WebElement getToastermessage() {
	return Toastermessage;
}

}

