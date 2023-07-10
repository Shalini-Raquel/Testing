package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Located {

	public static void main(String[] args) {
		//1) Opem the browser
				ChromeDriver driver = new ChromeDriver();
				
				//2) Navigate to application
				driver.get("https://facebook.com");
				
				//3) Enter invalid username 'batman554466@gmail.com' in the 'Email address or phone number text box
				driver.findElement(By.id("email")).sendKeys("batman554466@gmail.com");
				
				//4) Enter invalid password 'password@123' in the 'password' textbox
				driver.findElement(By.id("pass")).sendKeys("password@123");
				
				//5) Click Login Button
				driver.findElement(By.name("login")).click();
				
				//6) Close the Browser
				driver.quit();
			}

		}


	


