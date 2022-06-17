package com.TestngPractice;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	WebDriver driver;
	String url= "http://demo.seleniumeasy.com/";

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver.exe" );
		ChromeOptions options= new ChromeOptions();
		options.addArguments("start-maximized");
		driver= new ChromeDriver(options);
		driver.get(url);
		//		  driver.manage().window().maximize();
		//		  Implicit wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//		  Explicit wait
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("at4win-content")));
		//		  driver.findElement(By.linkText("Yes please!")).click();
		driver.findElement(By.id("at-cv-lightbox-close")).click();
	}
	/*
	@Test
	  public void test1() throws InterruptedException {

//		  Get title of web page
		  String pageTitle = driver.getTitle();
		  System.out.println("Page title: " + pageTitle);

//		  locators and different operations performed through them
		  driver.findElement(By.linkText("Input Forms")).click();
		  driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a")).click();
		  driver.findElement(By.cssSelector("input#user-message")).sendKeys("My name is Garima");
		  driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
		  Thread.sleep(1000);
		  String message= driver.findElement(By.id("display")).getText();
		  String expectedMessage= "My name is Garima";

//		  Checks equality
		  AssertJUnit.assertEquals(message, expectedMessage);
		  System.out.println(message);
	  }


	  @Test
	  public void test2() throws InterruptedException {
		  driver.findElement(By.linkText("Input Forms")).click();
		  driver.findElement(By.linkText("Select Dropdown List")).click();

//		  Selecting elements from drop down list
		  WebElement dropdown= driver.findElement(By.id("select-demo"));
		  Select select= new Select(dropdown);
		  select.selectByValue("Tuesday");
		  Thread.sleep(1000);
		  String message= driver.findElement(By.className("selected-value")).getText();
		  String expectedMessage= "Day selected :- Tuesday";

//		  Checks equality
		  AssertJUnit.assertEquals(message, expectedMessage);
		  System.out.println(message);
	  }

	  @Test
	  public void test3() throws InterruptedException {
		  driver.findElement(By.linkText("Table")).click();
		  driver.findElement(By.linkText("Table Data Download")).click();

		  for(int i=1; i<3; ++i) {
		  WebElement table= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/tbody"));
		  List<WebElement> rows= table.findElements(By.tagName("tr"));
		  for(WebElement row: rows) {
			  List<WebElement> cols= row.findElements(By.tagName("td"));  
			  for(WebElement col:cols) {
				  System.out.print(col.getText()+"	");

			  }
			  System.out.println();
			 }

		  driver.findElement(By.linkText("Next")).click();
//		  driver.findElement(By.linkText(String.valueOf(i))).click();
		  }	
//		  System.out.println(column);  
	  }

	  @Test
	  public void test4() {
		  Set<String> window= driver.getWindowHandles();
		  System.out.println("Number of open windows: "+window.size());

		  String msg= null;
		  for(String str: window) {

			  driver.switchTo().window(str);
			  String title=driver.getTitle();

			  if(title.matches("Learn Selenium.*")) {
				  msg="window found";
			  }
			  else { 
				  msg ="Desired window not found";
			  }
		  }
		 System.out.println(msg);
		 String heading= driver.findElement(By.xpath("/html/body/div[3]/div/section/article/div/div/div/div[1]/div/div[2]/div/h2")).getText();
		 System.out.println(heading);
	  }

	  @Test
	  public void Test5() throws InterruptedException {
		  driver.findElement(By.linkText("Alerts & Modals")).click();
		  driver.findElement(By.linkText("Javascript Alerts")).click();
		  driver.findElement(By.xpath("//div[1]/div[2]/button[text()=\"Click me!\"]")).click();
		  Thread.sleep(2000);
		  driver.switchTo().alert().accept();
		  driver.findElement(By.linkText("Others")).click();
		  driver.findElement(By.linkText("Drag and Drop")).click();
		  Thread.sleep(2000);
		  WebElement fromElement= driver.findElement(By.xpath("//span[text()=\"Draggable 1\"]"));
		  WebElement toElement= driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
		  Actions actions= new Actions(driver);
		  Action dragAndDrop =actions.clickAndHold(fromElement).moveToElement(toElement).build();
//		  actions.dragAndDrop(fromElement, toElement).build().perform();
		  dragAndDrop.perform();
		  Thread.sleep(2000);
		  String dropped= driver.findElement(By.xpath("//span[text()=\"Draggable 1\"]")).getText();
		  System.out.println(dropped);
		  if(dropped.equals("Draggable 1")) {
			  System.out.println("Drag and Drop Successful");
		  }
		  else {
			  System.out.println("Drag and Drop Unsuccessful");
		  }
	 */
	@Test
	public void test6() throws IOException, InterruptedException {
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a")).click();

//		Taking input from excel file
		File file= new File("D:\\Downloads\\Book1.xlsx");
		FileInputStream filestream= new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(filestream);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
//		Giving name for new column
		Row addCol= sheet.getRow(0);
		Cell newCol= addCol.createCell(2);
		newCol.setCellValue("Total");
		
		int rowcount= sheet.getLastRowNum()-sheet.getFirstRowNum();
		
//		Retrieving data from excel and writing on web page
		for(int i=1; i<=rowcount; i++) {
			double num1= (int) sheet.getRow(i).getCell(0).getNumericCellValue();
			double num2= (int) sheet.getRow(i).getCell(1).getNumericCellValue();
			String n1= String.valueOf(num1);
			String n2= String.valueOf(num2);
			driver.findElement(By.xpath("//*[@id=\"sum1\"]")).sendKeys(n1);
			driver.findElement(By.xpath("//*[@id=\"sum2\"]")).sendKeys(n2);
			driver.findElement(By.xpath("//button[text()=\"Get Total\"]")).click();
			Thread.sleep(2000);
			
//			Retrieving data from web page and writing back to excel
			String total= driver.findElement(By.id("displayvalue")).getText();
			System.out.println(total);
//			Creating new column in excel and writing data in it
			Row row= sheet.getRow(i);
			Cell cell= row.createCell(2);
			cell.setCellValue(total);
			
			driver.findElement(By.xpath("//*[@id=\"sum1\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"sum2\"]")).clear();
		}
		FileOutputStream fout= new FileOutputStream(file);
		workbook.write(fout);
		workbook.close();
	}
	@AfterTest
	public void tearDown() {
		 driver.quit();
	}
}




