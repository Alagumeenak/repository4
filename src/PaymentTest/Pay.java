package PaymentTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Pay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       driver.get("https://demoapps.qspiders.com/");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//section[.='Dropdown']")).click();
       Thread.sleep(1000);
       WebElement countryDropDown=driver.findElement(By.id("select3"));
       Thread.sleep(1000);
       Select selectCountry=new Select(countryDropDown);
      List<WebElement> allCountries= selectCountry.getOptions();
      for(WebElement country:allCountries) {
    	  System.out.println(country.getText());
      
    	  if(allCountries.size()-1==8)
    	  {
    		  System.out.println("Test case PAss");
    	  }
    	  else
    	  {
    		  System.out.println("Test case Fail");
    	  }
      }
      driver.quit();
	}

}
