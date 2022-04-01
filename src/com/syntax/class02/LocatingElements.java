package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://fb.com");
		driver.findElement(By.id("email")).sendKeys("syntax@fvdf.com");
		driver.findElement(By.id("pass")).sendKeys("syntax@f");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//div[contains(text(),'The email you entered isn�t connected to an account. ')]")).isDisplayed();
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
 	}
}
