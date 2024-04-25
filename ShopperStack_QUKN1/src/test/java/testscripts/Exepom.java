package testscripts;

import org.testng.annotations.Test;

import element_Repository.Add_Wishlist;
import element_Repository.Add_to_cart;
import element_Repository.Addaddress;
import element_Repository.Allcategories;
import element_Repository.Buyfromcart;
import element_Repository.Deleteaddress;
import element_Repository.Mylikes;
import element_Repository.Profileupdate;
import element_Repository.SearchButton;
import element_Repository.UpdateAddress;
import element_Repository.Updatecart;
import element_Repository.VerifyMyorder;
import element_Repository.Verifywishlist;
import generic_Library.BaseTest;

public class Exepom extends BaseTest

{
	@Test(priority=2)
	public void wishListTestCase() throws InterruptedException
	{
		
		base_Page.getMenLink().click();
		utility_Methods.takeScreenshot(driver);
	}
	
	@Test(priority=1)
	public void MainCategories() throws InterruptedException
	{
		
		Allcategories maincatgry=new Allcategories(driver);
		maincatgry.getClickonwomenlink().click();
		Thread.sleep(3000);
		maincatgry.getClickonkidslink().click();
		Thread.sleep(3000);
		maincatgry.getClickonelectr().click();
		Thread.sleep(3000);
		maincatgry.getClickonwomenlink().click();
		Thread.sleep(3000);
	
	}

	    @Test(priority=3)
	    public void Profileupdate() throws InterruptedException
	    {
	    	
	    	Profileupdate Pfupdate =new Profileupdate(driver);
	    	Pfupdate.getAccountButton().click();
	    	Pfupdate.getMyProfile().click();
	    	Thread.sleep(3000);
	    	Pfupdate.getEditProfile().click();
	    	Thread.sleep(3000);
	    	Pfupdate.getProfileFirstname().sendKeys("Megha");
	    	Thread.sleep(3000);
	    	Pfupdate.getProfileLastname().sendKeys("hebbarjois");
	    	Thread.sleep(3000);
	    	Pfupdate.getPrfphonenumber().sendKeys("9986877314");
	    	Thread.sleep(3000);
	        Pfupdate.getSubmitbutton().click();
	    	
	    	}
	    
	    @Test(priority=4)
	    public void searchtext() throws InterruptedException
	    
	    {
	  	  SearchButton scrchbtn=new SearchButton(driver);
	  	  Thread.sleep(3000);
	  	  scrchbtn.getSearchfield().sendKeys("levis");
	  	  Thread.sleep(3000);
	  	  scrchbtn.getSearchbutton().click();
	  	  Thread.sleep(4000);
	  	  
	  	  }
	
	    @Test(priority=5)
		public void Addtocart()
		{
			
			Add_to_cart addcart= new Add_to_cart(driver);
			addcart.getMen().click();
			addcart.getPumaitem().isSelected();
			addcart.getAddtocart().click();
			addcart.getCartbutton().click();
			
		}
	   
	    @Test(priority=6)
	    public void updatecart()
		{
			
			Updatecart up = new Updatecart (driver);
			up.getCarticon().click();
			up.getPumaitemisselected().isSelected();
			up.getIncreaseitem().click();
			up.getDecreaseitem().click();
			up.getRemovefromcart().click();
			driver.switchTo().alert().accept();
			up.getPricedetails().isDisplayed();
			
		}
	    
	    @Test(priority=7)
	    public void addaddress()
	    {
	    	Addaddress address= new Addaddress(driver);
	    	address.getAccountButton().click();
	    	address.getMyProfile().click();
	    	address.getMyaddresses().click();
	    	address.getAddAddress().click();
	    	address.getHome().click();
	    	address.getName().sendKeys("John");
	    	address.getHouseofficeInfo().sendKeys("Parkier landing");
	    	address.getStreetinfo().sendKeys("church street");
	    	address.getLandmark().sendKeys("church school");
	    	address.getCountry().sendKeys("USA");
	    	address.getState().sendKeys("New York");
	    	address.getCity().sendKeys("Coopers Town");
	    	address.getPincode().sendKeys("432101");
	    	address.getPhonenumber().sendKeys("96338564355");
	    	String str =address.getToastermessage().getText();
	    	System.out.println("The toaster message is:  "+str);
	    
	    	}
	    @Test(priority=8)
	    public void updateAddress()
	    {
	    	UpdateAddress Upadd= new UpdateAddress(driver);
	    	Upadd.getAccountButton().click();
	    	Upadd.getMyProfile().click();
	    	Upadd.getMyaddresses().click();
	    	Upadd.getSelectedaddress().isSelected();
	    	Upadd.getEditbutton().click();
	    	Upadd.getOther().click();
	    	Upadd.getUpName().clear();
	    	Upadd.getUpName().sendKeys("Johnmax");
	    	Upadd.getUphouseofficeInfo().clear();
	    	Upadd.getUphouseofficeInfo().sendKeys("CoxTown");
	    	Upadd.getUpPhonenumber().clear();
	    	Upadd.getUpPhonenumber().sendKeys("9786765565");
	    	Upadd.getUpaddressbutton().click();
	        String str =Upadd.getToastermessage().getText();
	    	System.out.println("The toaster message is:  "+str);
	    
	    	}
	    @Test(priority=9)
	    public void deleteaddress()
	    {
	    	Deleteaddress dele= new Deleteaddress(driver);
	    	dele.getAccountButton().click();
	    	dele.getMyProfile().click();
	    	dele.getMyaddresses().click();
	    	dele.getDelselectedaddress().isSelected();
	    	dele.getDeleteaddress().click();
	    	driver.switchTo().alert().accept();
	    	
	    }
	    
	    @Test(priority=10)
		public void buyfromcart()
		{
			
			Buyfromcart buy = new Buyfromcart(driver);
			buy.getBeautyitem().click();
			buy.getLakme().click();
			buy.getLakme().isSelected();
			buy.getAddtocartbutton();
			buy.getCarticon().click();
			buy.getClickoncarticon();
			buy.getClickonbuynow().click();
			buy.getAddressradiobutton().click();
			buy.getClickonproceed().click();
			buy.getCodradiobutton().click();
			buy.getClickoncodproceed().click();
			buy.getOrderconfirmedpage().isDisplayed();
			
		}
			
	    @Test(priority=11)
		public void addtowishlist()
		{
			
			Add_Wishlist Addwish = new Add_Wishlist(driver);
			Addwish.getClickonelectronics().click();
			Addwish.getIphone14proselected().isSelected();
			Addwish.getClickHearticon().click();
			Addwish.getAccountButton().click();
			Addwish.getClickonwishlist().click();
			
			}
			
	    @Test(priority=12)
		public void verifywishlist()
		{
			
			Verifywishlist Addwish = new Verifywishlist(driver);
			Addwish.getAccountButton().click();
			Addwish.getClickonwishlist().click();
			Addwish.getIphone14PROisselected().isSelected();
			Addwish.getAddToCart().click();
			Addwish.getClickoncarticon().click();
			
			}
			
	    @Test(priority=13)
		public void veiftMyorder()
		{
			
			VerifyMyorder order = new VerifyMyorder(driver);
			order.getAccountButton().click();
			order.getClickonMyorder().click();
			order.getClickontrackorder().click();
			order.getPopupmessagedisplayed().isDisplayed();
			order.getClickonXicon().click();
			order.getClickoncancelorder().click();
			driver.switchTo().alert().accept();
			
			}
	    
	    @Test(priority=14)
		public void mylikes()
		{
			
			Mylikes like = new Mylikes(driver);
			like.getAccountButton().click();
			like.getClickonMyprofile().click();
			like.getDropdownlistEle().sendKeys("Electronics");
			like.getSelectwatch().sendKeys("watch");
			like.getSubmitbutton().click();
			like.getClickonMylikes().click();
			
			}
			
		}

	
	    
	    
	    
	    
	    
	
	


