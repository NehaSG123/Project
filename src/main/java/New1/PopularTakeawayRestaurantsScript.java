package New1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PopularTakeawayRestaurantsScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1072983\\msedgedriver.exe");
        
        WebDriver driver=new EdgeDriver();
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    driver.get("https://www.eazydiner.com/"); 
	    
	    try {
		       int x = 0;
		       for (; x <= 38; x++) {
		          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + x + ")"), "");
		       }
		       for (; x > 0; x--) {
		          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + x + ")"), "");
		       }
	    } catch (WebDriverException wde) {} catch (Exception e) {}
	    Thread.sleep(2000);
	    
	    driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//a[@data-collection='Popular Takeaway Restaurants in Delhi']")).click();
	   
        // Scrolling down the page
       
        		    try {
        		       int i = 0;
        		       for (; i <= 40; i++) {
        		          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
        		       }
        		       for (; i > 0; i--) {
        		          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
        		       }
        		   
        		       
        		       Thread.sleep(2000);
        		       int j = 0;
        		       for (; j > -40; j--) {
        		          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + j + ")"), "");
        		       }
        		       for (; j < 0; j++) {
        		          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + j + ")"), "");
        		       }
        		    } catch (WebDriverException wde) {} catch (Exception e) {}
        		    
        		    Thread.sleep(2000);
        		    
        		 
        	
	    


	}

}
