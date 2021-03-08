package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericLib.BaseTest;

public class UsersListPage {
	
	@FindBy(xpath="//input[@value='Add New User']") private WebElement addNewUserBtn;
    @FindBy(xpath="//span[@class='successmsg']") private WebElement successMsg;
    
    public UsersListPage()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    public void clickAddNewUserBtn() {
    	addNewUserBtn.click();
    }
    
    public WebElement getSuccessMsg() {
		return successMsg;
    	
    }
    
    public String getmsg()
    {
    	return successMsg.getText();
    }
    
    
    
}



