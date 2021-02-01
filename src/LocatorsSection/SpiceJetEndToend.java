package LocatorsSection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJetEndToend {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Ahmedabad (AMD)')]")).click();
		

		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='JAI']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'29')]")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Its enables!");
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		
		s.selectByValue("4");
		
		
		driver.findElement(By.name("ctl00$mainContent$ddl_Child")).click();
		
		Select s1=new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child")));
		s1.selectByValue("3");
		
		driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")).click();
		
		Select s2=new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		s2.selectByValue("AED");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).click();
				
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
		
		
	}

}
