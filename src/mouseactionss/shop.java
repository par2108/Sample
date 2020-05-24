package mouseactionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\mouseactionss\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/");
		driver.manage().window().maximize();
	
		WebElement mele = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions a=new Actions(driver);
		a.moveToElement(mele).perform();
		
		WebElement range = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		Actions aa=new Actions(driver);
		aa.moveToElement(range).perform();
		range.click();
		
		WebElement sur = driver.findElement(By.xpath("//img[@id='det_img_107504753']"));
		Actions aaa=new Actions(driver);
		aaa.moveToElement(sur).perform();
		sur.click();
		
				
	
}
}