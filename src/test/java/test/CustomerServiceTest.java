package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;

public class CustomerServiceTest extends TestBase{
	
	HomePage homePageObject;
	
	@DataProvider(name="userDataFromExcel")
	public Object[][] userRegisterData() throws IOException
	{
		// get data from Excel Reader class 
		ExcelReader ER = new ExcelReader("CustomerServiceData");
		return ER.getExcelData();
	}
	
	@Test(dataProvider="userDataFromExcel")
	public void userCanSendToCustomerService(String name , String email , String subject , String message) throws InterruptedException {
		homePageObject=new HomePage(driver);
		homePageObject.userSendToCustomerService(name, email, subject, message);
		Thread.sleep(3000);
		WebElement sendMessage=driver.findElement(By.xpath("/html/body/footer/div[3]/div/div/div/div[2]"));
		Assert.assertEquals(sendMessage.getText().toString(), "Your Message send");
		System.out.println("message sent successfully to customer service");
	}


}
