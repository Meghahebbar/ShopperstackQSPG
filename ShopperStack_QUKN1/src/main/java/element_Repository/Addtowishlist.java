package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtowishlist extends BasePage{

	public Addtowishlist(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(id="beautyProducts")
	WebElement beautyitems;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div[1]")
	WebElement itempageisdisplayed;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/svg/path")
	WebElement heartsymbol;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div[2]")
	WebElement itempagedisplayed;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div[2]/div[3]/div[2]/svg/path")
	WebElement heartsymbol2;
	
	@FindBy(xpath="//*[@id=\"root\"]/section[1]/article/div[3]/div[1]/button/span[1]/div")
	WebElement Accountbutton;
	
	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[3]")
	WebElement wishlist;

	public WebElement getBeautyitems() {
		return beautyitems;
	}

	public WebElement getItempageisdisplayed() {
		return itempageisdisplayed;
	}

	public WebElement getHeartsymbol() {
		return heartsymbol;
	}

	public WebElement getItempagedisplayed() {
		return itempagedisplayed;
	}

	public WebElement getHeartsymbol2() {
		return heartsymbol2;
	}

	public WebElement getAccountbutton() {
		return Accountbutton;
	}

	public WebElement getWishlist() {
		return wishlist;
	}
	
	}
//for item page is displayed()should be used