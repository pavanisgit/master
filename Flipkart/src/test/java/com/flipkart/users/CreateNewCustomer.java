package com.flipkart.users;

import org.testng.annotations.Test;

import com.flipkart.genericLib.BaseTest;
import com.flipkart.genericLib.FileLib;
import com.flipkart.genericLib.WebDriverCommonLib;
import com.flipkart.pages.ActiveProjectsAndCustomers;
import com.flipkart.pages.CreateNewCustomerPage;
import com.flipkart.pages.CreateNewProjectPage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.OpenTasksPage;

public class CreateNewCustomer extends BaseTest {
	
	@Test
	public void CreateCustomer() throws Throwable {
		
FileLib filelib = new FileLib();
               LoginPage lp=new LoginPage();
		lp.login(filelib.readPropData(PROP_PATH, "username"), filelib.readPropData(PROP_PATH,"password"));
               
		
		WebDriverCommonLib wdcl = new WebDriverCommonLib();
	    wdcl.waitForPageTitle(filelib.readPropData(PROP_PATH, "openTaskPage"));
		wdcl.verifyPage(wdcl.getPageTitle(),filelib.readPropData(PROP_PATH, "openTaskPage") , "Open Task Page");
		
		OpenTasksPage otp = new OpenTasksPage();
		
		otp.clickprojectsAndCustomers();
	                
		ActiveProjectsAndCustomers apac=new ActiveProjectsAndCustomers();
		apac.clickcreateNewCustomer();
		apac.searchcustomerDD();
		apac.clicksearchBtn();
		
		CreateNewCustomerPage cncp = new CreateNewCustomerPage();
		cncp.getcustomerName();
		cncp.clickcreateCustomerBtn();
		
		
		
		
	}

}
