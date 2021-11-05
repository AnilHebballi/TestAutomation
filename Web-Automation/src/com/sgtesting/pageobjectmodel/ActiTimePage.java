package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
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
	//Delete User click on user button or Modify take same 
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")
	private WebElement oDeleteUser1;
	public WebElement getClickOnUserButtonToDeleteOrModify()
	{
		return oDeleteUser1;
	}
	//Delete user Click on Delete Button
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getClickOnDeleteButtonToDelete()
	{
		return userDataLightBox_deleteBtn;
	}
	
	//Modify Click On Save Changes
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement oClickOnSaveChanges;
	public WebElement saveChangesButton()
	{
		return oClickOnSaveChanges;
	}
	//Create Customer go to Task
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")
	private WebElement oClickOnTask;
	public WebElement clickOnTaskButton()
	{
		return oClickOnTask;
	}
	// click on Add New Button To Create Customer Or Project
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")
	private WebElement oClickOnAddNew;
	public WebElement clickOnAddNewButton()
	{
		return oClickOnAddNew;
	}
	// To Create new Customer Click On New Customer
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement oClickOnNewCustomer;
	public WebElement clickOnNewCustomerButton()
	{
		return oClickOnNewCustomer;
	}
	//To Create New Customer 
	private WebElement customerLightBox_nameField;
	public WebElement clickOnCreateNewCustomerButton()
	{
		return customerLightBox_nameField;
	}
	//create customer button
	private WebElement customerLightBox_commitBtn;
	public WebElement createCustomerClick()
	{
		return customerLightBox_commitBtn;
	}
	// Modify Or Delete Customer Entry Button
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oClickSettingEntryButton;
	public WebElement clickonSettingButton()
	{
		return oClickSettingEntryButton;
	}
	//click on ActionButton to delete customer
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
	private WebElement oClickOnAction;
	public WebElement ActionButtonClick()
	{
		return oClickOnAction;
	}
	//click on delete button to delete customer
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement oClickOnDelete;
	public WebElement deleteCustomerdeleteButton()
	{
		return oClickOnDelete;
	}
	//delete Permanently
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement  deletePermnently()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	//ModifyCustomer Click Created NameField
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement oCreatedNameField;
	public WebElement CreatedNameFieldClick()
	{
		return oCreatedNameField;
	}
	//Click On Enter CustomerName toModify
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement oEnterOnCustomerName;
	public WebElement enterOncustumerNameclick()
	{
		return oEnterOnCustomerName;
	}
	// Create New Project 
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement oNewProject;
	public WebElement newProjectClick()
	{
		return oNewProject;
	}
	//enter the project Name
	private WebElement projectPopup_projectNameField;
	public WebElement enterTheProjectname()
	{
		return projectPopup_projectNameField;
	}
	//enter on Create Project Button
	private WebElement projectPopup_commitBtn;
	public WebElement enterOnCreateProjectclick()
	{
		return projectPopup_commitBtn;
	}
	// For Delete Project Or Modify Project Name
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement oClickOnProjectSettingButton;
	public WebElement enterOnProjectSettingButton()
	{
		return oClickOnProjectSettingButton;
	}
	//for Delete Poject again click on Setting button 
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]") 
	private WebElement oAgainClickOnProjectSettingButton;
	public WebElement AgainClickOnProjectSettingButtonToDeleteProject()
	{
		return oAgainClickOnProjectSettingButton;
	}
	//For Delete Project Click On Actions Button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oActionButtonclick;
	public WebElement projectActionButtonclick()
	{
		return oActionButtonclick;
	}
	//For Delete Project Click On Delete Button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement oDeleteButton;
	public WebElement projectenterOnDeleteButton()
	{
		return oDeleteButton;
	}
	//For delete Project  click On Delete Permanently
	private WebElement projectPanel_deleteConfirm_submitBtn;
	public WebElement projectenterDeletePemanently()
	{
		return projectPanel_deleteConfirm_submitBtn;
	}
	//For Modify Project click On name Field first
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement oDescription;
	public WebElement modifyProjetDescriptionField()
	{
		return oDescription;
	}
	// For Modify Project Reenter the Project name
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement oreEnterModifiedProjectName;
	public WebElement ModifiedPrijectNameEnter()
	{
		return oreEnterModifiedProjectName;
	}
	//click on desciption path to modify the project name
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement oClickElseWhereToModifyProject;
	public WebElement ModifyProjectClickOnElseWhere()
	{
		return oClickElseWhereToModifyProject;
	}
	//click on Add new Task Button 
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement oAddNewTaskButtonclick;
	public WebElement addNewTaskButtonClick()
	{
		return oAddNewTaskButtonclick;
	}
	//click on Create New Task Button tocreate new task
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement oCreateNewTaskClick;
	public WebElement CreateNewTaskButtonClick()
	{
		 return oCreateNewTaskClick;
	}
	//click on Enter Task Name1
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement oEnterTaskName1;
	public WebElement enterOnTaskName1()
	{
		 return oEnterTaskName1;
	}
	//click on Enter Task Name2
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")
	private WebElement oEnterTaskName2;
	public WebElement enterOnTaskName2()
	{
		 return oEnterTaskName2;
	}
	// click on Create Task Button 
	private WebElement createTasksPopup_commitBtn;
	public WebElement createTaskButton()
	{
		return createTasksPopup_commitBtn;
	}
	//For delete Tasks click on Box
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/table/tbody/tr/td[1]")
	private WebElement oToDeleteTaskClickOnBox;
	public WebElement ToDeleteTaskClickOnBox()
	{
		 return oToDeleteTaskClickOnBox;
	}
	// Then Click On Delete Button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[3]/div/div/div[4]")
	private WebElement oClickOnDeleteButtonToDeleteTask;
	public WebElement ToDeleteTaskClickOnDeleteButton()
	{
		 return oClickOnDeleteButtonToDeleteTask;
	}
	//To Delete Task cliclk on DeletePermanently
	private WebElement deleteTaskPopup_deleteConfirm_submitBtn;
	public WebElement TaskDeletePermanentlyclick()
	{
		 return deleteTaskPopup_deleteConfirm_submitBtn;
	}

}

