package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericLib.BaseTest;
import com.flipkart.genericLib.*;

public class AddNewUsersPage {
	
	@FindBy(name="username") private WebElement usernameTb;
	@FindBy(xpath="//input[@type='password']") private WebElement passwordTb;
	@FindBy(name="passwordTextRetype") private WebElement  passwordRetypeTb;
    @FindBy(name="firstName")  private WebElement firstNameTb;
    @FindBy(name="lastName") private WebElement laststNameTb;
    @FindBy(xpath="//input[@value='   Create User   ']") private WebElement createUserBtn;
    
  public  AddNewUsersPage(){
	  PageFactory.initElements(BaseTest.driver, this);
    	}
  
  public void createUser(String un,String pwd,String rPwd,String fn,String ln) {
	   
	  usernameTb.sendKeys(un);
	  passwordTb.sendKeys(pwd);
	  passwordRetypeTb.sendKeys(rPwd);
	  firstNameTb.sendKeys(fn);
	  laststNameTb.sendKeys(ln);
	  createUserBtn.click();
  }
}
