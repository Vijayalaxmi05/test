package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args)  {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijayalaxmi\\OneDrive\\Desktop\\geckodriver-v0.31.0-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
    	driver.get("https://kite.zerodha.com/");
    	driver.manage().window().maximize();
    	
   
	   
	    
	    
	}
}
