package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChormeBrowserDemo {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		closeApplication();

	}
    private static void launchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
    		oBrowser=new ChromeDriver();
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void navigate()
    {
    	try
    	{
    		oBrowser.get("http://localhost/login.do");
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void closeApplication()
    {
    	try
    	{
    		oBrowser.close();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
