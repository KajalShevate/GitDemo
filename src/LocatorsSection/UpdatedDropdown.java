package LocatorsSection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		
		WebElement Passenger=driver.findElement(By.id("divpaxinfo"));
		Passenger.click();
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			//i++;
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(Passenger.getText());
		System.out.println("Success");
//		driver.close();
		
	}

}
