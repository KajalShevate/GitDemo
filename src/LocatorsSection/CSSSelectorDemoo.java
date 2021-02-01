package LocatorsSection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=us");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("loginuser1");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("password");
		driver.findElement(By.cssSelector("#Login")).click();
		WebElement error=driver.findElement(By.xpath("//div[@role='alert']"));
		if(error.isDisplayed())
		{
			System.out.println(error.getText());
		}
		else
		{
			System.out.println("ABCD");
		}
		
	}

}
