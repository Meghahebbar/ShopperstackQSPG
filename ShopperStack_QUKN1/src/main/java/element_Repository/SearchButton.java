package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchButton extends BasePage{

	public SearchButton(WebDriver driver) {
		super(driver);
		
	}
      @FindBy(id="category")
      private WebElement categorylist;
      
      @FindBy(id="search")
      private WebElement searchfield;
      
      @FindBy(xpath="//*[@id=\"searchBtn\"]")
  	private WebElement Searchbutton;

	public WebElement getCategorylist() {
		return categorylist;
	}

	public WebElement getSearchfield() {
		return searchfield;
	}

	public WebElement getSearchbutton() {
		return Searchbutton;
	}
  	
     
	
	
}