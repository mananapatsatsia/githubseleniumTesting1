package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class recap {
	

	
	    public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://fb.com");
	        driver.manage().window().maximize();

	        String title = driver.getTitle();

	        String expectedTitle = "Facebook - Log In or Sign Up";

	            if (title.equals(expectedTitle)){
	                System.out.println("title is correct  "+ title);
	            } else{
	                System.out.println("Title is incorrect" );
	            }

	    }

}
