package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Deleteaddress extends BasePage
{

	public Deleteaddress(WebDriver driver) 
	{
		super(driver);
	
	}

	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[1]")
	private WebElement MyProfile;
	
	@FindBy(xpath ="//*[@id=\"root\"]/section[2]/div/div/div[3]/a[2]/div")
	WebElement Myaddresses;
	
	@FindBy(xpath="//*[@id=root]/section[2]/div/section/div/div[2]/div[4]")
	private WebElement delselectedaddress;
	
	@FindBy(id="//*[@id=\"root\"]/section[2]/div/section/div/div[2]/div[3]/div[2]/div/button/span[1]/svg/path")
	private WebElement Deleteaddress;

	public WebElement getMyProfile() {
		return MyProfile;
	}

	public WebElement getMyaddresses() {
		return Myaddresses;
	}

	public WebElement getDelselectedaddress() {
		return delselectedaddress;
	}

	public WebElement getDeleteaddress() {
		return Deleteaddress;
	}
	
	
	
}

	