import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class droganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		List<WebElement> allcountries=driver.findElements(By.xpath("//div[@id='countries']/div"));
		List<WebElement>allcapitals=driver.findElements(By.xpath("//div[@id='dropContent']/div"));
	
		System.out.println(allcapitals.size());
		System.out.println(allcountries.size());
		Actions action=new Actions(driver);
		for (int i = 1; i < allcapitals.size(); i+=2) {
			for (int j = 0; j < allcountries.size(); j++) {
				action.dragAndDrop(allcapitals.get(i), allcountries.get(j)).perform();
				System.out.println(allcapitals.get(i).getCssValue("background-color"));
		
				if (allcapitals.get(i).getCssValue("background-color").equals("rgb(0, 255, 0)"))
				{
					break;
				}
			}
		}
	}

}
