package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWOrkFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://fb.com");
		WebElement createNewAcc=driver.findElement(By.linkText("Create new account"));
		Thread.sleep(2000);
        createNewAcc.click();
        Thread.sleep(2000);
        WebElement fName=driver.findElement(By.name("firstname"));
        WebElement lName=driver.findElement(By.name("lastname"));
        WebElement mobileOrEmail=driver.findElement(By.name("reg_email__"));
        WebElement pass=driver.findElement(By.id("password_step_input"));
        WebElement signUpBtn=driver.findElement(By.linkText("Sign Up"));
        WebElement closeBtn=driver.findElement(By.className("_8idr img"));
        
        fName.sendKeys("Dentist");
        lName.sendKeys("Forever");
        mobileOrEmail.sendKeys("123-123-1234");
        pass.sendKeys("Dentistry");
        signUpBtn.click();
        closeBtn.click();
        
	}

}
