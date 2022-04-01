package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.manage().window().maximize();
		WebElement FirstName=driver.findElement(By.id("customer.firstName"));
		WebElement lName=driver.findElement(By.name("customer.lastName"));
		WebElement address=driver.findElement(By.id("customer.address.street"));
		WebElement city=driver.findElement(By.id("customer.address.city"));
		WebElement state=driver.findElement(By.name("customer.address.state"));
		WebElement zip=driver.findElement(By.name("customer.address.zipCode"));
		WebElement phone=driver.findElement(By.id("customer.phoneNumber"));
		WebElement ssn=driver.findElement(By.id("customer.ssn"));
		WebElement userName=driver.findElement(By.id("customer.username"));
		WebElement pass=driver.findElement(By.id("customer.password"));
		WebElement confirmPass=driver.findElement(By.id("repeatedPassword"));
		WebElement register=driver.findElement(By.className("button"));
		FirstName.sendKeys("Volodimir");
		lName.sendKeys("Zelenskii");
		address.sendKeys("100 Test street");
		city.sendKeys("Kiev");
		state.sendKeys("Ukraine");
		zip.sendKeys("12345");
		phone.sendKeys("123-456-7890");
		ssn.sendKeys("123-45-1234");
		userName.sendKeys("SlavaUkraine");
		pass.sendKeys("Test");
		confirmPass.sendKeys("Test");
		Thread.sleep(2000);
		register.click();
		driver.quit();
		
	}

}
