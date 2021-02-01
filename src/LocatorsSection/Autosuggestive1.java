package LocatorsSection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autosuggestive1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.qatarairways.com/en/homepage.html");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//span[contains(text(),'Round trip')]")).click();
		driver.findElement(By.id("T7-from")).sendKeys("pun");
		driver.findElement(By.xpath("//strong[contains(text(),'Punta Cana')]")).click();
		
		driver.findElement(By.xpath("//input[@id='T7-to']")).sendKeys("cal");
		
		driver.findElement(By.xpath("//span[contains(text(),'San Francisco International Airport(SFO)')]")).click();
		
		//driver.findElement(By.xpath("//input[@id='T7-departure_1']")).click();
		driver.findElement(By.xpath("//td[@data-title='r4c4']")).click();
		driver.findElement(By.xpath("//td[@data-title='r1c3']")).click();
//		driver.findElement(By.id("T7-arrival_1")).click();
	//	driver.findElement(arg0)
		
//		driver.findElement(By.xpath("//a[@class='ui-state-default.ui-state-highlight.ui-state-active']")).click();
		/*
		driver.findElement(By.xpath("T7-passengers")).click();
		driver.findElement(By.id("adults")).click();
		Select s=new Select(driver.findElement(By.id("adults")));
		
		s.selectByValue("2");
		driver.findElement(By.id("ConfirmPassengerSelection")).click();
		*/
		//driver.findElement(By.id("T7-promo")).sendKeys("xyz123");
		
		//driver.findElement(By.xpath("span[contains(text(),Business/First]")).click();
		
		
		
		
		
		
		

	}

}
