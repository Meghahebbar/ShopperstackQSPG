package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends BasePage
{

	public ForgotPassword(WebDriver driver) 
	{
		super(driver);
		
	}
	    @FindBy(id="Forgot Password?")
	    private WebElement ForgotPassword; 
	    
        @FindBy(xpath="//*[@id=\"email\"]")
	    private WebElement Youremail; 
	    
	    @FindBy(xpath="//*[@id=\"root\"]/section[2]/article/div[1]/div[2]/button")
	    private WebElement ProceedButton ; 
	    
	    public WebElement getForgotPassword() {
			return ForgotPassword;
		}

        public WebElement getYouremail() {
			return Youremail;
		}

        public WebElement getProceedButton() {
			return ProceedButton;
		}

public void performLogin(String Youremail)
		{
			
			getYouremail().sendKeys(Youremail);
			getProceedButton().click();

	  }
}