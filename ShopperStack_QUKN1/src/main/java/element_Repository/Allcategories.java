package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Allcategories extends BasePage{

	public Allcategories(WebDriver driver) 
	{
		super(driver);
	
	}

     @FindBy(xpath="//a[@id='women']")
     WebElement clickonwomenlink;
     
     @FindBy(id="kids")
     WebElement clickonkidslink;
     
     @FindBy(id="electronics")
     WebElement clickonelectr;
     
     @FindBy(id="beautyProducts")
     WebElement clickonbeautyprd;

	public WebElement getClickonwomenlink() {
		return clickonwomenlink;
	}

	public WebElement getClickonkidslink() {
		return clickonkidslink;
	}

	public WebElement getClickonelectr() {
		return clickonelectr;
	}

	public WebElement getClickonbeautyprd() {
		return clickonbeautyprd;
	}
     
     




}




