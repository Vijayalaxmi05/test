package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		
//		Launching of Browser
		
          System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijayalaxmi\\OneDrive\\Desktop\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          
//          IRCTC Website
          
       //  By id
          driver.findElement(By.id("destination"));
          
       //  By name
          driver.findElement(By.name(null));
     
       //  By Linked Text
          driver.findElement(By.linkText("CONTACT US"));
          
       //  By Partial Link Text
          driver.findElement(By.partialLinkText("CONTACT"));
     
       //  By Classname
          driver.findElement(By.className("search_btn loginText ng-star-inserted"));
          
       //  By Tagname
          driver.findElement(By.tagName("button"));
          
     
       //  By    
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
	}
}
