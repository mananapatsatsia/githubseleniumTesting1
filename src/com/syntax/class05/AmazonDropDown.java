package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {

	
		public static String url = "http://amazon.com";

		public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		    WebDriver driver = new ChromeDriver();
		    driver.get(url);
		    WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
		    Select select = new Select(categoriesDD);

		    List<WebElement> options = select.getOptions();
		    for(WebElement option:options) {
		        String optionText = option.getText();
		        System.out.println(optionText);
		    }

		    select.selectByValue("search-alias=appliances");
		}
	

}
