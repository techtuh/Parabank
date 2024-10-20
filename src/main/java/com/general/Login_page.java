package com.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Login_page {
	
	WebDriver driver = new ChromeDriver();
	

	public void getLogin() {
		
		driver.manage().window().maximize();
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("(//*[@class='input'])[1] ")).sendKeys("rezwanislam857@gmail.com");
		driver.findElement(By.xpath("(//*[@class='input'])[2] ")).sendKeys("Boston2023");
		driver.findElement(By.xpath(" //*[@value='Log In']")).click();
		//driver.findElement(By.xpath(" "));
	}
	
	
	
	public static void main(String[] args) { 
		
		Login_page obj = new Login_page();
		obj.getLogin();
		
	}

}
