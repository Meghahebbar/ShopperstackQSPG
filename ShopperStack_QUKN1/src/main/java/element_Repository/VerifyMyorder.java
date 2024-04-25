package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyMyorder extends BasePage
{

	public VerifyMyorder(WebDriver driver)
	{
		super(driver);
		
	}

     @FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[4]")
     WebElement clickonMyorder;
     
     @FindBy(xpath="//*[@id=\"panel2a-header\"]/div/div/div/div[4]/div/button[2]")
     WebElement clickontrackorder;
     
     @FindBy(xpath="/html/body/div[6]/div[3]")
     WebElement popupmessagedisplayed;
     
     @FindBy(xpath="/html/body/div[6]/div[3]/div[1]/svg")
     WebElement clickonXicon;
     
     @FindBy(xpath="//*[@id=\"panel2a-header\"]/div/div/div/div[5]/div/button")
     WebElement clickoncancelorder;
     
     @FindBy(xpath="/html/body/div[3]/div[3]/div")
     WebElement cancelorderpage;
     
    //handle the alert
     
     @FindBy(xpath="//*[@id=\"n03xffu\"]/div[1]/div[2]")
     WebElement Toastermessage;

	public WebElement getClickonMyorder() {
		return clickonMyorder;
	}

	public WebElement getClickontrackorder() {
		return clickontrackorder;
	}

	public WebElement getPopupmessagedisplayed() {
		return popupmessagedisplayed;
	}

	public WebElement getClickonXicon() {
		return clickonXicon;
	}

	public WebElement getClickoncancelorder() {
		return clickoncancelorder;
	}

	public WebElement getCancelorderpage() {
		return cancelorderpage;
	}

	public WebElement getToastermessage() {
		return Toastermessage;
	}
     
     
     
     
     
     
     
     
     







}




