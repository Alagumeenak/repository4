package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaz {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:\\amazon.in");
		driver.manage().window().maximize();
		 List<WebElement>    allLink=driver.findElements(By.tagName("a"));
        for (WebElement link : allLink) {
			System.out.println(link.getText());
		}
        driver.quit();
		}

}
