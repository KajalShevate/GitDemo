package LocatorsSection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://google.com");
		//driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("sdjshjdhsd");
		
		driver.get("https://facebook.com");
		//driver.findElement(By.xpath("//div[@class='_4bl7._9ji4']/div/div/form/div/div/input")).sendKeys("sdsds");
		
	/*	driver.findElement(By.id("email")).sendKeys("ewewewewe");
		driver.findElement(By.id("pass")).sendKeys("dsewewe");
		driver.findElement(By.xpath("//div[@class='_6ltg']/button")).click();
		driver.close();
	*/
		
		driver.get("https:amazon.in");
		//driver.findElement(By.xpath("//div[@class='nav-fill']/div/form/div/div/input")).sendKeys("realme mobiles");
		driver.findElement(By.xpath("//div[@class='nav-right']/div/span/input")).click();
		driver.findElement(By.xpath(".//*div[@id='nav-xshop']/following-sibling::a[3]")).click();
	
	}
}
