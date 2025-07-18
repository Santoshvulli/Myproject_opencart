package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistationPage;
import testcaseBase.BaseClass;

public class TC_001AccountregisterTest extends BaseClass{
	
	
	@Test(groups= {"Sanity" , "Master"})
	public void verify_registerpage()
	{
		logger.info("Test execution started");
		HomePage hp=new HomePage(driver);
		hp.ClickMyaccount();
		hp.Clickregister();
		
		RegistationPage reg=new RegistationPage(driver);
		reg.EnterFirstName(randomString().toUpperCase());
		reg.EnterLastName(randomString().toUpperCase());
		reg.EnterEmail(randomString()+"@gmail.com");
		
		String password=randomAlphaNumeric();
		reg.EnterPassword(password);
		reg.EnterConfirmPassword(password);
		reg.EnterPhoneNumber(randomNumber());
		reg.Clickpolicy();
		reg.Clickconfirmbutton();
		
		logger.info("text conformation");
		String confmsg=reg.getconformmessage();
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
		
			Assert.assertTrue(false);
		}
					
	}

}
