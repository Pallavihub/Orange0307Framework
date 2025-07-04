package testLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;

public class LoginPageTest extends LoginPage{
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		LoginPage loginPage =new LoginPage();
	}
	
	
	
}
