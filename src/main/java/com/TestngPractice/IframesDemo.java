package com.TestngPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class IframesDemo {
	WebDriver driver;
	
@SuppressWarnings("deprecation")
@BeforeTest
public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver.exe" );
	ChromeOptions options= new ChromeOptions();
	options.addArguments("start-maximized");
	driver=new ChromeDriver(options);
	driver.get("https://www.html-code-generator.com/demo/html/iframe");
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
}
	
  @Test
  public void f() throws InterruptedException {
	  driver.switchTo().frame("myFrame");
	  WebElement rainbow= driver.findElement(By.xpath("//*[@aria-label=\"CSS Rainbow Text\"]"));
	  JavascriptExecutor j= (JavascriptExecutor) driver;
	  j.executeScript("arguments[0].click();", rainbow);
	  Thread.sleep(2000);
	  String img= driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[2]/div[1]/article/div[4]/div[2]/div/div[1]/textarea")).getText();
	  System.out.println(img);
	  driver.switchTo().parentFrame();
	  driver.switchTo().frame("myFrame2");
	  driver.findElement(By.xpath("//span[text()=\"Convert to image\"]")).click();
	  Thread.sleep(2000);
	  List<WebElement> c= driver.findElements(By.id("canvas_img"));
	  System.out.println(c.size());
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
