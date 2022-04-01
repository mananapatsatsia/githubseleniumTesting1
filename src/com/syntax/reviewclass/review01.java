package com.syntax.reviewclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class review01 {
	static String url="https://syntaxprojects.com/basic-radiobutton-demo.php";
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","drivers/chromdriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get(url);
    WebElement femaleBtn=driver.findElement(By.xpath("//input[@name='optradio'and@value='Female']\"));"));
    
    femaleBtn.click();
    //check if the radio btn is enabled
    System.out.println("the female radio btsn is enabled "+femaleBtn.isEnabled());
    //check if it's displayed or not
    System.out.println("the female radio btn is displayed "+femaleBtn.isDisplayed());
    //check if it's selected or not
    System.out.println("the female radio btn is diselected "+femaleBtn.isSelected());
    //check the btn is not selected and 
    if(femaleBtn.isSelected()) {
    	femaleBtn.click();
    }
    

}
}