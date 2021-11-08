package com.sgtesting.objectmap;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenarioAssignment6 {
	public static WebDriver oBrowser=null;
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginAdmin();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		 deleteCustomer();
		 logoutAdmin();
		 closeApplication();

	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/user/submit_tt.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginAdmin()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginusernametxtfield")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpasswordtxtfield")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginloginbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageminimizeflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickontaskimagebox")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonaddnewbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonnewcustomerbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonnewcustomernamefield")).sendKeys("demo");
			oBrowser.findElement(objectmap.getLocator("clickoncreatecustomerbutton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{
			
			oBrowser.findElement(objectmap.getLocator("clickonaddnewbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonnewproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("entertheprojectname")).sendKeys("java project");
			oBrowser.findElement(objectmap.getLocator("clickoncreateprojectbutton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonprojectsettingsbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectnamelabelclick")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("reentertheprojectname")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("reentertheprojectname")).sendKeys("project java");
			oBrowser.findElement(objectmap.getLocator("clickonprojectsettingsbutton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonprojectsettingsbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonprojectactionbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonprojectdeleteoptionbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonprojectdeletepermanentlybutton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickoncustomersettingsbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickoncustomeractionbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickondeletebuttontodeletecustomer")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickondeletepermanentlybutton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutAdmin()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
