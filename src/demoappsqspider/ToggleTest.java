package demoappsqspider;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ToggleTest{	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		WebElement drop = driver.findElement(By.cssSelector("#select3"));
		drop.click();
		Select s=new Select(drop);
		s.selectByIndex(7);
		List<WebElement> sel = s.getAllSelectedOptions();

		for(WebElement w:sel) {
			System.out.println(w.getText());
		}
		driver.close();
	}
}