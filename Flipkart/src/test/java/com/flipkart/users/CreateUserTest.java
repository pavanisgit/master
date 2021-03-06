package com.flipkart.users;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.flipkart.pages.AddNewUsersPage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.OpenTasksPage;
import com.flipkart.pages.UsersListPage;
import com.flipkart.genericLib.BaseTest;
import com.flipkart.genericLib.FileLib;
import com.flipkart.genericLib.WebDriverCommonLib;


//@Listeners(com.flipkart.genericLib.MyListeners.class)
public class CreateUserTest extends BaseTest{
	
	@Test
	public void createUser() throws Throwable {
		LoginPage lp = new LoginPage();
		
		FileLib filelib = new FileLib();
		
		
		
		//initialization
		
		lp.login(filelib.readPropData(PROP_PATH,"username"), filelib.readPropData(PROP_PATH,"password"));
		
		WebDriverCommonLib wdcl = new WebDriverCommonLib();
	    wdcl.waitForPageTitle(filelib.readPropData(PROP_PATH, "openTaskPage"));
		wdcl.verifyPage(wdcl.getPageTitle(),filelib.readPropData(PROP_PATH, "openTaskPage") , "Open Task Page");
		
		OpenTasksPage otp = new OpenTasksPage();
		otp.clickUsersTab();
		
		wdcl.waitForPageTitle(filelib.readPropData(PROP_PATH, "userlistpage"));
		wdcl.verifyPage(wdcl.getPageTitle(), filelib.readPropData(PROP_PATH, "userlistpage"), "User List Page");
		
		
		UsersListPage ulp = new UsersListPage();
		ulp.clickAddNewUserBtn();
		
		wdcl.waitForPageTitle(filelib.readPropData(PROP_PATH, "addnewuserpage"));
		
		wdcl.verifyPage(wdcl.getPageTitle(), filelib.readPropData(PROP_PATH,"addnewuserpage" ), "Add New User Page");
		
		
		AddNewUsersPage anup=new AddNewUsersPage();
		
		
		anup.createUser(filelib.getData(EXCEL_PATH, "Users", 0, 1),
				         filelib.getData(EXCEL_PATH, "Users", 1, 1),
				         filelib.getData(EXCEL_PATH, "Users", 2, 1),
				         filelib.getData(EXCEL_PATH, "Users", 3, 1), 
				         filelib.getData(EXCEL_PATH, "Users", 4, 1));
		
		
		if(ulp.getSuccessMsg().isDisplayed()) {
			Reporter.log("User is created,Success message is displayed", true);
		}
		
		else {
			Reporter.log("User is not created,Success message is not displayed", true);
		}
		
	}

}
