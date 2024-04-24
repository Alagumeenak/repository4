package PaymentTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
/**
 * To handle multiple dropdown 
 * @author Admin
 *
 */
public class HandleMultipleDropdown {
	//Common Test gvhhkkhbkbkhv
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       driver.get("https://demoapps.qspiders.com/");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//section[.='Dropdown']")).click();
       Thread.sleep(2000);
       //click on multi select link
       driver.findElement(By.partialLinkText("Multi Select")).click();
       Thread.sleep(1000);
       //find country dropdown
       WebElement countryDropdown=driver.findElement(By.id("select-multiple-native"));
       
       //select  class object
       Select selectCountry=new Select(countryDropdown);
       //select France
       selectCountry.selectByIndex(4);
       Thread.sleep(1000);
       //Select India
       selectCountry.selectByValue("India");
       Thread.sleep(1000);
       selectCountry.selectByVisibleText("Canada");
       Thread.sleep(1000);
       System.out.println("**************All Selected Countries***********");
       List<WebElement> allSelectedCountries=selectCountry.getAllSelectedOptions();
       for (WebElement selectedCountry : allSelectedCountries) {
    	   
    	   System.out.println(selectedCountry.getText());
		
	}
       System.out.println("\n *******************First Selected Country***********");
       System.out.println(selectCountry.getFirstSelectedOption().getText());
      Thread.sleep(1000);
      System.out.println(selectCountry.getWrappedElement().getText());
       WebElement selectCountries= selectCountry.getWrappedElement();
       System.out.println(selectCountries);
       selectCountry.deselectByValue("India");
       selectCountry.deselectByIndex(4);
       selectCountry.deselectByVisibleText("Canada");
  for (WebElement selectedCountry : allSelectedCountries) {
    	   
    	   System.out.println(selectedCountry.getText());
    	   selectCountry.deselectAll();
		driver.quit();
	}
    		   
      
	}
}
