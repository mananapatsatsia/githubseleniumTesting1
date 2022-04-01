package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.navigate().to("http://www.uitestpractice.com/Students/Form");
         driver.manage().window().maximize();
         WebElement marriedRadioBtn=driver.findElement(By.xpath("//label[contains(text(),'Martial Status:')]/parent::div//label[2]/input"));
        boolean isMarriedRadioBtn= marriedRadioBtn.isEnabled();
         System.out.println(isMarriedRadioBtn);
         
         if(!isMarriedRadioBtn) {
        	 System.out.println("Not enabled");
         }else {
        	 System.out.println("Enabled");
         }
         
         boolean isDispld=marriedRadioBtn.isDisplayed();
         System.out.println(isDispld);
         
         boolean isSelected=marriedRadioBtn.isSelected();
         System.out.println(isSelected);
         marriedRadioBtn.click();
         System.out.println(isSelected); 
	}

}
