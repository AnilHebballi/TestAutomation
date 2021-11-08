package com.sgtesting.objectmap;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenarioAssignment2 {
	public static WebDriver oBrowser=null;
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginAdmin();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
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
	static void createUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonusersimagexpath")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonadduserbuttonxpath")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonfirstnamefieldname")).sendKeys("user");
			oBrowser.findElement(objectmap.getLocator("clickonlastnamefield")).sendKeys("demo");
			oBrowser.findElement(objectmap.getLocator("clickonemailnamefield")).sendKeys("user@gmail.com");
			oBrowser.findElement(objectmap.getLocator("clickonusernamefield")).sendKeys("demouser");
			oBrowser.findElement(objectmap.getLocator("clickonpasswordfield")).sendKeys("1234");
			oBrowser.findElement(objectmap.getLocator("clickonpasswordcopyfield")).sendKeys("1234");
			oBrowser.findElement(objectmap.getLocator("clickoncreateuserbutton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifyUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickoncreatedusernamebar")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonfirstnamefieldname")).clear();
			oBrowser.findElement(objectmap.getLocator("clickonfirstnamefieldname")).sendKeys("user1");
			/*oBrowser.findElement(objectmap.getLocator("clickonlastnamefield")).clear();
			oBrowser.findElement(objectmap.getLocator("clickonlastnamefield")).sendKeys("demo1");
			oBrowser.findElement(objectmap.getLocator("clickonemailnamefield")).clear();
			oBrowser.findElement(objectmap.getLocator("clickonemailnamefield")).sendKeys("user@gmail.com");
			oBrowser.findElement(objectmap.getLocator("clickonusernamefield")).clear();
			oBrowser.findElement(objectmap.getLocator("clickonusernamefield")).sendKeys("userdemo1");
			oBrowser.findElement(objectmap.getLocator("clickonpasswordfield")).clear();
			oBrowser.findElement(objectmap.getLocator("clickonpasswordfield")).sendKeys("user1");
			oBrowser.findElement(objectmap.getLocator("clickonpasswordcopyfield")).clear();
			oBrowser.findElement(objectmap.getLocator("clickonpasswordcopyfield")).sendKeys("user1");*/
			oBrowser.findElement(objectmap.getLocator("clickonsavechangesbutton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickoncreatedusernamebar")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickondeleteuserbutton")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
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
