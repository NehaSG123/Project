package New1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class BookTableScript {

	public static void main(String[] args) throws InterruptedException {
		// Book table Script

		 System.setProperty("webdriver.edge.driver", "C:\\Users\\M1072983\\msedgedriver.exe");
         
         WebDriver driver=new EdgeDriver();
	    driver.get("https://www.eazydiner.com/"); 
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//span[text()='Book a Table']")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@id='restaurants']/div[3]/div/div[3]/div[2]/div[2]/a")).click();
	    
	    driver.findElement(By.xpath("//button[contains(text(),'Continue to book a table')]")).click();
	    driver.findElement(By.xpath("//input[@id='guest_name']")).sendKeys("Neha Gudekar");
	    driver.findElement(By.xpath("//*[@id='guest-form']/div/div[2]/div/div/input")).sendKeys("8312364876");
	    
	    driver.findElement(By.xpath("//input[@id='guest_email']")).sendKeys("nehagudekar17@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='checkout-button']")).click();
	 
	}

}
