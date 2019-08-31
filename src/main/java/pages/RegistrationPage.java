package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends PageBase {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	WebElement userImage=drvier.findElement(By.xpath("//*[@id=\"registration\"]/div/div[1]/div"));
	WebElement userName=drvier.findElement(By.name("user"));
	WebElement Email=drvier.findElement(By.name("email"));
	WebElement phoneNumber=drvier.findElement(By.name("phone"));
	WebElement Password=drvier.findElement(By.name("password"));
	WebElement confirmPassword=drvier.findElement(By.name("password-confirm"));
	WebElement SignUpButton=drvier.findElement(By.xpath("//*[@id=\"registration\"]/div/div[7]/input")); 
	
	public void userCanRegister(String image , String name , String email , String phone , String password) throws InterruptedException, AWTException {
		FileUploadWithRobot(userImage , image);
		setTextElementText(userName , name);
		setTextElementText( Email, email);
		setTextElementText(phoneNumber , phone);
		setTextElementText(Password , password);
		setTextElementText(confirmPassword , password);
		clickButton(SignUpButton);
	}
	
	//public WebElement loginMessage=drvier.findElement(By.xpath("/html/body/footer/div[3]/div/div/div/div[2]"));

}
