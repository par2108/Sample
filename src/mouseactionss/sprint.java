package mouseactionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sprint {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\mouseactionss\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		
		WebElement shop = driver.findElement(By.xpath("//a[text()='All Departments']"));
		
		Actions acc=new Actions(driver);
		acc.moveToElement(shop).perform();
		
		WebElement paa = driver.findElement(By.xpath("//a[text()='Paint']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(paa).perform();
		
	WebElement inter = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
	
	Actions act=new Actions(driver);
	act.moveToElement(inter).perform();
	
	WebElement ceill = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
	
	Actions accc=new Actions(driver);
	accc.moveToElement(ceill).perform();
	
	ceill.click();
	
	

}
}