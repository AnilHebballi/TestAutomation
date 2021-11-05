package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeAdvanceSenarios {
	public ActiTimeAdvanceSenarios(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//User Name WebElement
		private WebElement username ;
		public WebElement getAdminUserName()
		{
			return username ;
		}
		//Password WebElement
		private WebElement pwd;
		public WebElement getAdminPassword()
		{
			return pwd;
		}
		// Login Button WebElement
		@FindBy(xpath="//*[@id=\'loginButton\']/div")
		private WebElement oLogin;
		public WebElement getAdminLogin()
		{
			return oLogin;
		}
		//Minimize FlyOut Window
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutWindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		//Logout Link
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getAdminLogout()
		{
			return oLogout;
		}
		// Users
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
		private WebElement oUsers;
		public WebElement getUsersButton()
		{
			return oUsers;
		}
		// Add User
		@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
		private WebElement oAddUser;
		public WebElement getAddUserButton()
		{
			return oAddUser;
		}
		//FirstName
		private WebElement firstName;
		public WebElement getFirstName()
		{
			return firstName;
		}
		//LastName
		private WebElement lastName;
		public WebElement getLastName()
		{
			return lastName;
		}
		//Add Gmail
		private WebElement email;
		public WebElement getEmail()
		{
			return email;
		}
		//Add UserName
		private WebElement userDataLightBox_usernameField;
		public WebElement getUserName1()
		{
			return userDataLightBox_usernameField;
		}
		//PassWord
		private WebElement password;
		public WebElement getPassWord()
		{
			return password;
		}
		//ReEnterPassWorword
		private WebElement passwordCopy;
		public WebElement getPasswordCopy()
		{
			return passwordCopy;
		}
		//click on Create Users to create user
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement oCreateUser;
		public WebElement getClickOnCreateUserButton()
		{
			return  oCreateUser;
		}
	//For Minimize Video
	@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
	private WebElement oMimizeVideo;
	public WebElement minimizeVideo()
	{
		return oMimizeVideo;
	}
	//Modify Users Click On User
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement oUserButton;
	public WebElement firstStepModifyPasswordSenario()
	{
		return oUserButton;
	}
	//To Modify Second Step click on First User path
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
	private WebElement oFirstUser;
	public WebElement firstUserclickOnIt()
	{
		return oFirstUser;
	}
	//2nd User path
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table")
	private WebElement oSecondUser;
	public WebElement secondUserclickOnIt()
	{
		return oSecondUser;
	}
	//3rd user path
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table")
	private WebElement oThirdUser;
	public WebElement ThirdUserclickOnIt()
	{
		return oThirdUser;
	}
	// Modify Save Changes For PassWord
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement oSaveChangesButton;
	public WebElement saveChangesClickOnIt()
	{
		return oSaveChangesButton;
	}
	//for Delete Second Step 
	// Click On first User
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
	private WebElement oDFirstUser;
	public WebElement firstUserClickIt()
	{
		return oDFirstUser;
	}
	//click on Delete Button
	private WebElement userDataLightBox_deleteBtn;
	public WebElement deleteUsers()
	{
		return userDataLightBox_deleteBtn;
	}
	// Click On Second User
		@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")
		private WebElement oDSecondUser;
		public WebElement SecondUserClickIt()
		{
			return oDFirstUser;
		}
// Click On Third User
				@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]")
				private WebElement oDThirdUser;
				public WebElement ThirdUserClickIt()
				{
					return oDThirdUser;
				}
}

