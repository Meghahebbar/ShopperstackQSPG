package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Wishlist extends BasePage{

	public Add_Wishlist(WebDriver driver) 
	{
		super(driver);
		
	}
       @FindBy(id="electronics")
       WebElement clickonelectronics;
       
       @FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div/div[1]")
       WebElement iphone14proselected;
       
       @FindBy(id="//*[@id=\"root\"]/div[4]/div/div/div/div[1]/div[3]/div[2]/svg/path")
       WebElement clickHearticon;
       
       @FindBy(id="//*[@id=\"account-menu\"]/div[3]/ul/li[3]")
       WebElement clickonwishlist;

	public WebElement getClickonelectronics() {
		return clickonelectronics;
	}

	public WebElement getIphone14proselected() {
		return iphone14proselected;
	}

	public WebElement getClickHearticon() {
		return clickHearticon;
	}

	public WebElement getClickonwishlist() {
		return clickonwishlist;
	}
       
       }
