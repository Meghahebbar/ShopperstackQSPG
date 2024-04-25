package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Profileupdate extends BasePage {

	public Profileupdate(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[1]")
	private WebElement MyProfile;
	
	@FindBy(xpath="//*[@id=\"root\"]/section[2]/div/section/section/div[1]/button")
	private WebElement EditProfile;
	
	@FindBy(id="First Name")
	private WebElement ProfileFirstname;
	
	@FindBy(id="Last Name")
	WebElement ProfileLastname;
	
	@FindBy(id="Phone Number")
	private WebElement Prfphonenumber;
	
	//@FindBy(id="Country")
	//private WebElement PrfCountry;
	
	//@FindBy(id="State")
	//private WebElement PrfState;
	
	//@FindBy(id="City")
	//private WebElement PrfCity;
	
	@FindBy(id="submit")
	private WebElement Submitbutton;

	public WebElement getMyProfile() {
		return MyProfile;
	}

	public WebElement getEditProfile() {
		return EditProfile;
	}

	public WebElement getProfileFirstname() {
		return ProfileFirstname;
	}

	public WebElement getProfileLastname() {
		return ProfileLastname;
	}

	public WebElement getPrfphonenumber() {
		return Prfphonenumber;
	}

	//public WebElement getPrfCountry() {
		//return PrfCountry;
	//}

	//public WebElement getPrfState() {
		//return PrfState;
	//}

	//public WebElement getPrfCity() {
		//return PrfCity;
	//}

	public WebElement getSubmitbutton() {
		return Submitbutton;
	}

    
	
}
