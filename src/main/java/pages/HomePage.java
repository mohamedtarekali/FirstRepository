package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	WebElement loginButton=drvier.findElement(By.xpath("/html/body/header/div/div/div/ul/li[2]/a"));
	WebElement userName=drvier.findElement(By.name("name"));
	WebElement Email=drvier.findElement(By.name("email"));
	WebElement Subject=drvier.findElement(By.name("subject"));
	WebElement Message=drvier.findElement(By.name("message"));
	WebElement sendButton=drvier.findElement(By.xpath("//*[@id=\"CONTACT\"]/input[4]"));
	public WebElement doctorLinkProfile=drvier.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div[2]/div/div/div[1]/a[2]"));
	
	public void userSendToCustomerService(String name , String email , String subject , String message) {
		setTextElementText(userName, name);
		setTextElementText(Email, email);
		setTextElementText(Subject, subject);
		setTextElementText(Message, message);
		clickButton(sendButton);
	}
	
	
	public void openLoginPage() {
		clickButton(loginButton);
	}
	
	

}
