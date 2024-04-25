package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mylikes extends BasePage{

	public Mylikes(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[1]")
	WebElement ClickonMyprofile;
	
	@FindBy(xpath="//*[@id=\"root\"]/section[2]/div/div/div[3]/a[4]/div")
	WebElement ClickonMylikes;
	
	@FindBy(xpath="Category")
	WebElement dropdownlistEle;
	
	@FindBy(xpath="Category Type")
	WebElement selectwatch;
	
	@FindBy(xpath="Submit")
	WebElement submitbutton;
	
	@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[6]")
	WebElement Mylikes;

	public WebElement getClickonMyprofile() {
		return ClickonMyprofile;
	}

	public WebElement getClickonMylikes() {
		return ClickonMylikes;
	}

	public WebElement getDropdownlistEle() {
		return dropdownlistEle;
	}

	public WebElement getSelectwatch() {
		return selectwatch;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getMylikes() {
		return Mylikes;
	}
	
	
}
//how to set value for category list and category type