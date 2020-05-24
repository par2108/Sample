package mouseactionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class flip3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\mouseactionss\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	
	WebElement txtuser = driver.findElement(By.xpath("//input[@type='text']"));
	txtuser.sendKeys("8489455815");
	
		WebElement men = driver.findElement(By.xpath("//span[text()='Women']"));
	Actions acc=new Actions(driver);
	acc.moveToElement(men).perform();
	
	WebElement foot= driver.findElement(By.xpath("//a[text()='Footwear']"));
	Actions a=new Actions(driver);
	a.moveToElement(foot).perform();
	foot.click();
	
	
	WebElement homes = driver.findElement(By.xpath("//a[text()='Flats']"));
	
	Actions accc=new Actions(driver);
	accc.moveToElement(homes).perform();
	homes.click();
}
}
