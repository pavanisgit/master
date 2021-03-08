package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ActiveProjectsAndCustomers {
	
	@FindBy(xpath="//input[@value='Create New Customer'] ") private WebElement createNewCustomer;
    @FindBy(xpath="//input[@value='Create New Project'] ") private WebElement createNewProject;
	@FindBy(xpath="//select[@class='controlBorder']") private WebElement customerDD;
	@FindBy(xpath="//input[@value='  Show  ']") private WebElement searchBtn;
	public ActiveProjectsAndCustomers() {
		
		PageFactory.initElements(com.flipkart.genericLib.BaseTest.driver,this );
	}
	
	public void clickcreateNewCustomer() {
		
		createNewCustomer.click();
	}
	
	public void clickcreateNewProject() {
		
		createNewProject.click();
	}
	
	public WebElement searchcustomerDD() {
		return customerDD;

	}
	
	public void clicksearchBtn() {
		searchBtn.click();
	}
	
	
	
}


