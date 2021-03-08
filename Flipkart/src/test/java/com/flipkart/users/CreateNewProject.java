package com.flipkart.users;

import com.flipkart.genericLib.BaseTest;
import com.flipkart.genericLib.FileLib;
import com.flipkart.genericLib.WebDriverCommonLib;
import com.flipkart.pages.ActiveProjectsAndCustomers;
import com.flipkart.pages.CreateNewProjectPage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.OpenTasksPage;

public class CreateNewProject extends BaseTest{
	
	public void createProjects() throws Throwable {
		
		
		FileLib filelib = new FileLib();
        LoginPage lp=new LoginPage();
	lp.login(filelib.readPropData(PROP_PATH, "username"), filelib.readPropData(PROP_PATH,"password"));
        
	
	WebDriverCommonLib wdcl = new WebDriverCommonLib();
 wdcl.waitForPageTitle(filelib.readPropData(PROP_PATH, "openTaskPage"));
	wdcl.verifyPage(wdcl.getPageTitle(),filelib.readPropData(PROP_PATH, "openTaskPage") , "Open Task Page");
	
	OpenTasksPage otp = new OpenTasksPage();
	
	otp.clickprojectsAndCustomers();
             
	ActiveProjectsAndCustomers apac=new ActiveProjectsAndCustomers();
	apac.clickcreateNewProject();
	
	CreateNewProjectPage cnpp = new CreateNewProjectPage();
	cnpp.clickcustomerDD();
	cnpp.getprojectTab();
	cnpp.getprojectTab();
	}

}
