package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testcaseBase.BaseClass;

public class TC_002LoginTest extends BaseClass {
	
	@Test(groups= {"Regression" , "Master"})
	public void Verify_login()
	{
		HomePage hp=new HomePage(driver);
		hp.ClickMyaccount();
		hp.ClickLoginbutton();
		
		LoginPage lp=new LoginPage(driver);
		lp.Enteremail(p.getProperty("email"));
		lp.Enterpassword(p.getProperty("password"));
		lp.ClickLoginbuttononloginpage();
		
		MyAccountPage myaccount=new MyAccountPage(driver);
	    boolean targetpage=myaccount.getMyAccountconfirmmessage();
		
	    try {
		Assert.assertTrue(targetpage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("exicution is finished");
		
		
	}

}
