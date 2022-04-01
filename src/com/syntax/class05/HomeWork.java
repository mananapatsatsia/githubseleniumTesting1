package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork {
	static String url="https://www.facebook.com/";
         public static void main(String[] args) throws InterruptedException {
        	 System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe" );
        	 WebDriver driver=new ChromeDriver();
        	 driver.get(url);
        	 driver.manage().window().maximize();
        	 driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
        	 Thread.sleep(3000);
        	WebElement monthDD=driver.findElement(By.id("month"));
        	monthDD.click();
        	 Select select=new Select(monthDD);
        	 List<WebElement>allMonth=select.getOptions();
        	int month=allMonth.size();
        	System.out.println(month);
        	
        	for(int i=0;i<month;i++) {
        		String result=allMonth.get(i).getText();
        		System.out.println(result);
        	}
       	     Thread.sleep(3000);
         	WebElement dayDD=driver.findElement(By.id("day"));
             dayDD.click();
       	 Select select1=new Select(dayDD);
    	 List<WebElement>allDays=select1.getOptions();
    	 int days=allDays.size();
    	 System.out.println(days);
    	 for(int i=0;i<days;i++) {
    		 String result2=allDays.get(i).getText();
    		 
    		 System.out.println(result2);
    	 }
    	 Thread.sleep(3000);
      	WebElement yearDD=driver.findElement(By.id("year"));
      	yearDD.click();
    	 Select select2=new Select(yearDD);
 	 List<WebElement>allYears=select2.getOptions();
 	 int years=allYears.size();
 	 System.out.println(years);
 	 for(int i=0;i<years;i++) {
 		 String result3=allYears.get(i).getText();
 		 
 		 System.out.println(result3);
 	 }
 	 select.selectByIndex(9);
 	 Thread.sleep(2000);
 	 select1.selectByValue("7");
 	Thread.sleep(5000);
 	select2.selectByValue("1982");
    	 
    driver.quit();	 

       	 

}
}
