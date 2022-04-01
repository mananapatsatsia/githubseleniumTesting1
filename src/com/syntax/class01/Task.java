package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		String sourse=driver.getPageSource();
		System.out.println(sourse);
		String title =driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(title+" "+url);
		driver.quit();
	}

}
