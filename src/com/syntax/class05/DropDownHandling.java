package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	 static String url = "https://www.syntaxprojects.com/basic-checkbox-demo.php";

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","drivers/chromdriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get(url);
          WebElement daysDD=driver.findElement(By.id("select-demo"));
          Select select=new Select(daysDD);
          select.selectByIndex(3);
          Thread.sleep(2000);
          select.selectByVisibleText("Thursday");
          Thread.sleep(2000);

          select.selectByValue("Sunday");
          
          List<WebElement> allOptions=select.getOptions();
          int size=allOptions.size();
          System.out.println(size);
          
          for(int i=0;i<size;i++) {
        	 String option= allOptions.get(i).getText();
        	  
          }
          
          
          
	}

}
