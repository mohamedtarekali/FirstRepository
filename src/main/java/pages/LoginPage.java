package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	WebElement registraionButton=drvier.findElement(By.xpath("//*[@id=\"Login\"]/div/div[3]/a"));
	WebElement UserName=drvier.findElement(By.name("user"));
	WebElement Password=drvier.findElement(By.name("password"));
	WebElement LoginButton=drvier.findElement(By.id("SignIn"));
	
	public void openRegistrationPage() {
		clickButton(registraionButton);
	}
	
	public void userCanLogin(String name , String password) {
		setTextElementText(UserName, name);
		setTextElementText(Password, password);
		clickButton(LoginButton);
	}

}
