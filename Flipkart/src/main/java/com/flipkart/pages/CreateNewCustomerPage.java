package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericLib.BaseTest;

public class CreateNewCustomerPage {
	@FindBy(name="name") private WebElement customerName;
	@FindBy(name="createCustomerSubmit") private WebElement createCustomerBtn;

	public CreateNewCustomerPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getcustomerName() {
		customerName.sendKeys("pavani");
		return customerName;
	}
	
	public void clickcreateCustomerBtn() {
		createCustomerBtn.click();
	}
}
