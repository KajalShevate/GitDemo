package LocatorsSection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.xpath("//input[@name='origin']")).sendKeys("new y");
	//.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		driver.findElement(By.xpath("//a[@id='ui-id-58']")).click();
		System.out.println("good job!");
		System.out.println("byyee!");
		
		driver.close();
	}

}
