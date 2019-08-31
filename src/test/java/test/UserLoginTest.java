package test;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class UserLoginTest extends TestBase {
	HomePage homePageObject;
	LoginPage loginPageObject;
	RegistrationPage registrationPageObject;
	
	@DataProvider(name="userDataFromExcel")
	public Object[][] userRegisterData() throws IOException
	{
		// get data from Excel Reader class 
		ExcelReader ER = new ExcelReader("LoginData");
		return ER.getExcelData();
	}

	@Test(dataProvider="userDataFromExcel")
	public void userLogin(String name , String password)  {
		homePageObject=new HomePage(driver);
		homePageObject.openLoginPage();
		loginPageObject=new LoginPage(driver);
		loginPageObject.userCanLogin(name, password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Assert.assertEquals(actual, expected);
		
	}
}
