package loca;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swap\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		//Code to find url//
		driver.get("https://www.google.com/");
		
		//code to find current url//
//		String url = driver.getCurrentUrl();
//		System.out.println("https://www.google.com/");
	
		
		//code to get title of the tab//
//		String actualtitle = driver.getTitle();
//		System.out.println("Actual title is - "+"https://www.google.com/");
		
//		//code to maximise the browser//
//		driver.manage().window().maximize();
		
//		//code to navigate the link//
//		driver.navigate().to("https://paytm.com/recharge");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
		//code for size of browser//
//		Dimension d = new Dimension(100,400);
//		driver.manage().window().setSize(d);
		
		//code to nevigate url//
//		driver.navigate().to("https://paytm.com/recharge");
		
		//set the position on screen//
		org.openqa.selenium.Dimension p	= new org.openqa.selenium.Dimension(300,400);
		driver.manage().window().setSize(p);
		
//		//code to sleep browser//
//		Thread.sleep(2000);
//		
//		//code to close browser//
//		driver.close();
		
		//code to close browser//
//		driver.quit();
		
		
		
		
		
		
		
	}
}
