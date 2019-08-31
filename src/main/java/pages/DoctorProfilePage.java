package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoctorProfilePage extends PageBase {

	public DoctorProfilePage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement Name=drvier.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div[2]"));
	WebElement About=drvier.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div[4]/p"));
	WebElement Phone=drvier.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div[6]"));
	WebElement Email=drvier.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div[8]"));
	WebElement Address=drvier.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div[10]/p"));
	
	public void getProfileData() {
		
		System.out.println(Name.getText().toString()+"\n"+
				           About.getText().toString()+"\n"+
				           Phone.getText().toString()+"\n"+
				           Email.getText().toString()+"\n"+
				           Address.getText().toString());
	}

}
