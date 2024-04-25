package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_to_cart extends BasePage
{

	public Add_to_cart(WebDriver driver) 
	{
		super(driver);
	}
 
	@FindBy(id="men")
	WebElement men;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div[6]")
	WebElement pumaitem;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div[6]/div[3]/div[2]/button")
	WebElement Addtocart;
	
	@FindBy(id="//*[@id=\"cartIcon\"]")
	WebElement cartbutton;

	public WebElement getMen() {
		return men;
	}

	public WebElement getPumaitem() {
		return pumaitem;
	}

	public WebElement getAddtocart() {
		return Addtocart;
	}

	public WebElement getCartbutton() {
		return cartbutton;
	}

	}

//is displayed() use for puma item


