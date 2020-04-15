package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	// TODO Auto-generated method stub
	public static void main(String[] args) throws Exception {	  

		System.setProperty("webdriver.chrome.driver","D:\\Day01\\Sample\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Page Opened");
		// Enter username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		// Enter Password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");	
		System.out.println("Username : admin ");
		System.out.println("Password : admin123");
		// Click Login
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Log in successfull");
		Thread.sleep(3000);
		//Click on Logout
		System.out.println("Logging off");
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Login Logout successfull");
		driver.close();
	}
}

