package com.flipkart.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoContants{
      public static  WebDriver driver;
      
      @BeforeClass
      public void runBrowser() throws Throwable {
    	  FileLib filelib = new FileLib();
    	String browser = filelib.readPropData(PROP_PATH, "browser");
    	  if (browser.equals("chrome")) {
    		  
    		  System.setProperty(CHROME_PATH, CHROME_VALUE);
    		  driver=new ChromeDriver();
    	  }
    	  else if(browser.equals("firefox")) {
    		  System.setProperty(GECKO_PATH, GECKO_VALUE);
    		  driver=new FirefoxDriver();
    	}
    	  else {
    		  System.out.println("Dabba fellow , give me a correct key");
    	  }
    	  
    String appUrl = filelib.readPropData(PROP_PATH, "url");
    driver.get(appUrl);
    
    WebDriverCommonLib wdcl = new WebDriverCommonLib();
    wdcl.verifyPage(wdcl.getPageTitle(), filelib.readPropData(PROP_PATH,"loginpage"), "Login Page");
    
    }
      @AfterClass
      public void tearDown() throws Throwable {
    	  Thread.sleep(4000);
    	  
    	  driver.quit();
    	  
      }
      
  
}
