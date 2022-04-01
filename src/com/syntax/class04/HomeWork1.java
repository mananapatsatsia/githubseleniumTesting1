package com.syntax.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.navigate().to("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
         driver.manage().window().maximize();
         }

}
