package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount extends BasePage
{

	public CreateAccount(WebDriver driver) 
	{
		super(driver);
		
	}
	    @FindBy(xpath ="//*[@id=\"Create Account\"]/span[1]")
	    private WebElement CreateAccount; 
	    
	    @FindBy(id="First Name")
	    private WebElement Firstname; 
	    
	    @FindBy(id="Last Name")
	    private WebElement Lastname; 
	    
	    @FindBy(id="Female")
	    private WebElement GenderFemale;
	    
	    @FindBy(id="Phone Number")
	    private WebElement Phonenumber; 
	    
	    @FindBy(id="Email Address")
	    private WebElement Emailaddress ; 
	    
	    @FindBy(id="Password")
	    private WebElement password; 
	    
	    @FindBy(id="Confirm Password")
	    private WebElement Confirmpassword;
	    
	    @FindBy(id="RegisterButton")
	    private WebElement RegisterButton;

		public WebElement getCreateAccount() {
			return CreateAccount;
		}

		public WebElement getFirstname() {
			return Firstname;
		}

		public WebElement getLastname() {
			return Lastname;
		}
		
		public WebElement Female () {
			return GenderFemale;
		}

		public WebElement getPhonenumber() {
			return Phonenumber;
		}

		public WebElement getEmailaddress() {
			return Emailaddress;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getConfirmpassword() {
			return Confirmpassword;
		} 
		
		public WebElement getRegisterButton() {
			return RegisterButton;
		}
}

		//public void performCreateAccount(String Firtsname, String Lastname,String Phonenumber,String Email,String password, String Confirmpassword)
		//{
		//getCreateAccount().click();
		//getFirstname().sendKeys(Firstname);
		//getLastname().sendKeys(Lastname);
		//getGenderFemale().click();
		//getPhonenumber().sendKeys(Phonenumber);
		//getEmailaddress().sendKeys(Email);
		//getPassword().sendKeys(password);
		//getConfirmpassword().sendKeys(Confirmpassword);
		//getRegisterButton().click();
		
		//}

