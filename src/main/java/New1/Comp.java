package New1;


import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

 

public class Comp{

 

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
          System.setProperty("webdriver.edge.driver", "C:\\Users\\M1072983\\msedgedriver.exe");
          
          WebDriver driver=new EdgeDriver();
          driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
          driver.get("https://www.eazydiner.com/");
          if(driver.findElement(By.id("webpush-onsite")).isDisplayed())
                {
                 driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
                 driver.findElement(By.id("allow")).click();
                 driver.switchTo().defaultContent();
                 }
          
         driver.findElement(By.id("srchbar")).click();
         driver.findElement(By.xpath("//a[@data-city='Pune']")).click();
         
         
         
         driver.findElement(By.xpath("//span[text()='Delivery']")).click();
         
         driver.findElement(By.xpath("//*[@id=\"restaurants\"]/div[3]/div/div[3]/div[2]/div[2]/a")).click();
         
       
         
       
         
        driver.findElement(By.xpath("//*[@id=\"eazy-booking\"]/div/div/div/div/ul/li[1]")).click();
        
        
        Select obj=new Select(driver.findElement(By.xpath("//select[@class='w-100 grey-dark select']")));
        
        obj.selectByValue("4");
        
        driver.findElement(By.xpath("//*[@id=\"slotForm\"]/div/div/button")).click();
    }

 

}