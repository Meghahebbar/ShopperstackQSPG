package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Updatecart extends BasePage 

{

	public Updatecart(WebDriver driver) 
	{
		super(driver);
		
	}

	@FindBy(id="cartIcon")
	WebElement carticon;
	
	@FindBy(xpath="//*[@id=\"root\"]/section[2]/article/div[1]/div[1]/div[2]")
	WebElement pumaitemisselected;
	
	@FindBy(xpath="//*[@id=\"increase\"]")
	WebElement increaseitem;
	
	@FindBy(xpath="//*[@id=\"decrease\"]")
	WebElement decreaseitem;
	
	@FindBy(xpath="//*[@id=\"root\"]/section[2]/article/div[1]/div[1]/div[2]/div[2]/div[3]/button")
	WebElement Removefromcart;
	
	@FindBy(xpath ="//*[@id=\"root\"]/section[2]/article/div[1]/div[2]")
	WebElement pricedetails;

	public WebElement getCarticon() {
		return carticon;
	}

	public WebElement getPumaitemisselected() {
		return pumaitemisselected;
	}

	public WebElement getIncreaseitem() {
		return increaseitem;
	}

	public WebElement getDecreaseitem() {
		return decreaseitem;
	}

	public WebElement getRemovefromcart() {
		return Removefromcart;
	}

	public WebElement getPricedetails() {
		return pricedetails;
	}
}
//is displayed() should be used for pumaitempage and price details