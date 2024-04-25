package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Buyfromcart extends BasePage {

	public Buyfromcart(WebDriver driver)
	{
		super(driver);
	
	}
	
	@FindBy(id="beautyProducts")
	WebElement beautyitem;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div[1]")
	WebElement lakme;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/button")
	WebElement Addtocartbutton;
	
	@FindBy(id="//*[@id=\"cartIcon\"]")
	WebElement carticon;

    @FindBy(xpath="//*[@id=\"cartIcon\"]/path")
    WebElement Clickoncarticon;
    
    @FindBy(xpath="//*[@id=\"buynow_fl\"]/span")
    WebElement Clickonbuynow;
    
    @FindBy(xpath="//*[@id=\"36787\"]")
    WebElement addressradiobutton;
    
    @FindBy(xpath="//*[@id=\"root\"]/div[4]/div[3]/button")
    WebElement Clickonproceed;
    
    @FindBy(xpath="//*[@id=\"root\"]/section[2]/article/div/form/div[1]/div/label[2]/span[1]/input")
    WebElement codradiobutton;
    
    @FindBy(xpath="//*[@id=\"root\"]/section[2]/article/div/form/div[3]/button")
    WebElement Clickoncodproceed;
    
    @FindBy(xpath="//*[@id=\"root\"]/div[4]")
    WebElement orderconfirmedpage;

	public Object getBeautyitem;
    
    //@FindBy(xpath="//*[@id=\"97t84c8\"]/div[1]/div[2]")
    //WebElement Tostermessage;

	public WebElement getBeautyitem() {
		return beautyitem;
	}

	public WebElement getLakme() {
		return lakme;
	}

	public WebElement getAddtocartbutton() {
		return Addtocartbutton;
	}

	public WebElement getCarticon() {
		return carticon;
	}

	public WebElement getClickoncarticon() {
		return Clickoncarticon;
	}

	public WebElement getClickonbuynow() {
		return Clickonbuynow;
	}

	public WebElement getAddressradiobutton() {
		return addressradiobutton;
	}

	public WebElement getClickonproceed() {
		return Clickonproceed;
	}

	public WebElement getCodradiobutton() {
		return codradiobutton;
	}

	public WebElement getClickoncodproceed() {
		return Clickoncodproceed;
	}

	public WebElement getOrderconfirmedpage() {
		return orderconfirmedpage;
	}
    
    }
//orderconfirmedpage isDisplayed()to be used