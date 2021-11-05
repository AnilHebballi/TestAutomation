package com.sgtesting.testscipts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLXpathAccess {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//enterSalaryForThePersonSachinTendulkar();
		//FromPersonRahulDravidTheNextSecondRecordEnterSalary();
		//MakeStatusAsActiveForIndianFreedomFighter();
		fromSachinTendulkarPrevious2ndRecordMakeStatusActive();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("file:///C:/Users/HP/AppData/Local/Temp/Rar$EXa27080.47305/XPathAxes_27th_OCT_2021/WebTableHTML.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	/**
	 * for fetching path(ctrl+fn+f)click on these keys
	 */
	/**
	 * following-sibling---->(right side)
	 */
	static void enterSalaryForThePersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
	}
	/**
	 * following----->downwards
	 */
	static void FromPersonRahulDravidTheNextSecondRecordEnterSalary()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input")).sendKeys("15000");
	}
	/**
	 * Preceding-sibling
	 */
	static void MakeStatusAsActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
			/**
			 * OR----->oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[2]/input")).click();
			 */
	}
	/**
	 * preceding
	 */
	static void fromSachinTendulkarPrevious2ndRecordMakeStatusActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td[1]/input")).click();
	}
}
