package Webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");		
		WebElement searchtb = driver.findElement(By.id("twotabsearchtextbox"));
		if(searchtb.isDisplayed())  {
			System.out.println("pass:elementis displayed");
			searchtb.sendKeys("phone");
		}
		
		else
			
		{
			
			System.out.println("Fail:element is not displayed");
			
			
			
			
		}
		Thread.sleep(3000);

		
		driver.close();
		}

		

	}


