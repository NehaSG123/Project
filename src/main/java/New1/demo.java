package New1;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

 

public class demo{

 

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
          System.setProperty("webdriver.edge.driver", "C:\\Users\\M1072983\\msedgedriver.exe");
          
          WebDriver driver=new EdgeDriver();
          driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
          driver.get("https://www.eazydiner.com/");
          
          
          String title= driver.getTitle();
          System.out.println("the page title is: "+title);
          

    }}
