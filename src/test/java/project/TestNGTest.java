package project;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class TestNGTest {
		
		WebDriver driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;

		@BeforeMethod
		public void setUp() {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\M1072983\\msedgedriver.exe");
	        
	        WebDriver driver=new EdgeDriver(); 
//			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.eazydiner.com/");
			
			
		}
		
		@Test(priority=1)
		public void verifyPageTitleTest() {
			String title= driver.getTitle();
			System.out.println("the page title is: "+title);
//			Assert.assertEquals(title, expected);
		}
		
		
		@Test(priority=3)
		public void BookTableScriptTest() throws InterruptedException {
			// Book table Script

				    Thread.sleep(1000);
				  //to handle allow alert box
				    if(driver.findElement(By.id("webpush-onsite")).isDisplayed()) {
				    	driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
				    	driver.findElement(By.id("allow")).click();
				    	driver.switchTo().defaultContent();
				    	}
				    
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
		
		@Test(priority=6)
		public void FoodTrendsScriptTest() throws InterruptedException {    
		    try {
			       int x = 0;
			       for (; x <= 53; x++) {
			          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + x + ")"), "");
			       }
			       for (; x > 0; x--) {
			          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + x + ")"), "");
			       }
		    } catch (WebDriverException wde) {} catch (Exception e) {}
		    Thread.sleep(2000);
		    
		    driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		    
		    driver.findElement(By.xpath("//a[@data-collection='Food Trends | Critic Recommendation in Delhi']")).click();
		   
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
	        		   
			
		}
		
		
		
		
		
		
		
		@Test(priority=9)
		public void PopularTakewaysScriptTest() throws InterruptedException {
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
		}
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}


	}

