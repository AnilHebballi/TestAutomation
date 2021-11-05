package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSenarioAssignment7 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		createCustomer();
		createProject();
		createNewTask();
		deleteTask();
		projectDelete();
		deleteCustomer();
		logout();
		closeApplication();

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
			oBrowser.manage().window().maximize();
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
	static void login()
	{
		try
		{
			oPage.getAdminUserName().sendKeys("admin");
			oPage.getAdminPassword().sendKeys("manager");
			oPage.getAdminLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
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
			oPage.clickOnTaskButton().click();
			Thread.sleep(2000);
			oPage.clickOnAddNewButton().click();
			Thread.sleep(2000);
			oPage.clickOnNewCustomerButton().click();
			Thread.sleep(2000);
			oPage.clickOnCreateNewCustomerButton().sendKeys("Anil");
			oPage.createCustomerClick().click();
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
			oPage.clickOnAddNewButton().click();
			Thread.sleep(2000);
			oPage.newProjectClick().click();
			Thread.sleep(2000);
			oPage.enterTheProjectname().sendKeys("Java Project");
			oPage.enterOnCreateProjectclick().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createNewTask()
	{
		try
		{
			oPage.addNewTaskButtonClick().click();
			Thread.sleep(2000);
			oPage.CreateNewTaskButtonClick().click();
			Thread.sleep(2000);
			oPage.enterOnTaskName1().sendKeys("Task1");
			oPage.enterOnTaskName2().sendKeys("Task2");
			oPage.createTaskButton().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteTask()
	{
		try
		{
			oPage.ToDeleteTaskClickOnBox().click();
			Thread.sleep(2000);
			oPage.ToDeleteTaskClickOnDeleteButton().click();
			Thread.sleep(2000);
			oPage.TaskDeletePermanentlyclick().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void projectDelete()
	{
		try
		{
			oPage.enterOnProjectSettingButton().click();
			Thread.sleep(2000);
			oPage.projectActionButtonclick().click();
			Thread.sleep(2000);
			oPage.projectenterOnDeleteButton().click();
			Thread.sleep(2000);
			oPage.projectenterDeletePemanently().click();
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
			oPage.clickonSettingButton().click();
			Thread.sleep(2000);
			oPage.ActionButtonClick().click();
			Thread.sleep(2000);
			oPage.deleteCustomerdeleteButton().click();
			Thread.sleep(2000);
			oPage.deletePermnently().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oPage.getAdminLogout().click();
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
