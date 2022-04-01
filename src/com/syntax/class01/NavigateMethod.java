package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("http:/www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
        Thread.sleep(2000);//pause the execution
		
		driver.navigate().refresh();
		driver.close();
	}

}
