package mouseactionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragbank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\mouseactionss\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement src = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		Actions acc=new Actions(driver);
		acc.dragAndDrop(src, des).perform();
	}

}											
