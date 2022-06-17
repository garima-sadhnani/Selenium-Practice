package com.TestngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDropDemo {
	WebDriver driver;
	String url= "https://demo.guru99.com/test/drag_drop.html";
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver.exe" );
		  ChromeOptions options= new ChromeOptions();
		  options.addArguments("start-maximized");
		  driver= new ChromeDriver(options);
		  driver.get(url);
	}
	
	@Test
	public void test() throws InterruptedException {
		WebElement from= driver.findElement(By.linkText("BANK"));
		WebElement to= driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol"));
		Actions action= new Actions(driver);
//		action.clickAndHold(from).moveToElement(to).build().perform();
		action.dragAndDrop(from, to).perform();
		Thread.sleep(2000);
	}
	
	@AfterTest
	  public void tearDown() {
		  driver.quit();
	  }
}
