package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericLib.BaseTest;

public class CreateNewProjectPage {
	@FindBy(name="customerId") private WebElement customerDD;
	@FindBy(name="name") private WebElement projectTab;
	@FindBy(xpath="//input[@value='Create Project']") private WebElement projectBtn;
	
	public CreateNewProjectPage() {
		
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickcustomerDD() {
		customerDD.click();
	}
	
	public void getprojectTab() {
		projectTab.sendKeys("actitime");
	}

	public void clickprojectBtn() {
		projectBtn.click();
	}
}
