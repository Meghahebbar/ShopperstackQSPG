package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Verifywishlist extends BasePage
{

	public Verifywishlist(WebDriver driver) 
	{
		super(driver);
		
	}
	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[3]")
	WebElement clickonwishlist;
	
	@FindBy(xpath="//*[@id=\"root\"]/section[2]/article/div/div[12]")
	WebElement iphone14PROisselected;
	
	@FindBy(xpath="//*[@id=\"root\"]/section[2]/article/div/div[12]/div[2]/div[2]/button[1]")
	WebElement AddToCart;
	
	@FindBy(xpath="//*[@id=\"cartIcon\"]")
	WebElement clickoncarticon;

	public WebElement getClickonwishlist() {
		return clickonwishlist;
	}

	public WebElement getIphone14PROisselected() {
		return iphone14PROisselected;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getClickoncarticon() {
		return clickoncarticon;
	}

	
	
//is displayed() should be used for itempage
	
	}