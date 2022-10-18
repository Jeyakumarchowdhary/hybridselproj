package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");


//navigate
driver.navigate().to("https://www.facebook.com/");


//back
driver.navigate().back();

//forward
driver.navigate().forward();

//refresh
driver.navigate().refresh();
		// TODO Auto-generated method stub

	}

}
