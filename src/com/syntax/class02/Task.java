package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_MainContent_username"))
				.sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password"))
				.sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		String title=driver.getTitle();
		String expectedTitle="Web Orders";
		if(title.equals(expectedTitle)) {
		System.out.println("The title is correct");
		}else {
			System.out.println("Wrong page");
		}
		driver.findElement(By.id("ctl00_logout")).click();
		driver.quit();
		
	}

}
