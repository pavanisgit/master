package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericLib.BaseTest;

public class OpenTasksPage {
	
	@FindBy(xpath="//a[text()='Users']") private WebElement usersTab;
	@FindBy(xpath="//a[@class='item' and text()='Projects & Customers']") private WebElement projectsAndCustomers;
	
	public OpenTasksPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickUsersTab() {
		usersTab.click();
	}
	
	public void clickprojectsAndCustomers() {
		projectsAndCustomers.click();
	}
	
	

}
