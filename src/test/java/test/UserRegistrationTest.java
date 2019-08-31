package test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class UserRegistrationTest extends TestBase{
	HomePage homePageObject;
	LoginPage loginPageObject;
	RegistrationPage registrationPageObject;
	
	@DataProvider(name="userDataFromExcel")
	public Object[][] userRegisterData() throws IOException
	{
		// get data from Excel Reader class 
		ExcelReader ER = new ExcelReader("UserData");
		return ER.getExcelData();
	}

	@Test(dataProvider="userDataFromExcel")
	public void UserCanRigister(String image , String name , String email , String phone , String password) throws InterruptedException, AWTException {
		homePageObject=new HomePage(driver);
		homePageObject.openLoginPage();
		loginPageObject=new LoginPage(driver);
		loginPageObject.openRegistrationPage();
		registrationPageObject=new RegistrationPage(driver);
		registrationPageObject.userCanRegister(image,name,email,phone,password);
		Thread.sleep(3000);
		WebElement loginMessage=driver.findElement(By.xpath("/html/body/footer/div[3]/div/div/div/div[2]"));
		Assert.assertEquals(loginMessage.getText().toString(), "go to login");
		System.out.println("user registered seccessfully");
	}

}
