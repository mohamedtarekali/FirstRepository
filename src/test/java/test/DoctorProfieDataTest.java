package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DoctorProfilePage;
import pages.HomePage;

public class DoctorProfieDataTest extends TestBase {
	
	HomePage homePageObject;
	DoctorProfilePage doctorProfileObject;
	
	@Test
	public void userGetProfileData() {
		homePageObject=new HomePage(driver);
		String doctorName=homePageObject.doctorLinkProfile.getText().toString();
		homePageObject.doctorLinkProfile.click();
		doctorProfileObject=new DoctorProfilePage(driver);
		doctorProfileObject.getProfileData();
		Assert.assertEquals(doctorName,doctorProfileObject.Name.getText().toString());
		
		
	}

}
