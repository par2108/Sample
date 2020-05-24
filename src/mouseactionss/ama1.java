package mouseactionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ama1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\mouseactionss\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement mble = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions a=new Actions(driver);
		a.moveToElement(mble).perform();
		mble.click();
		
		WebElement acces = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
		Actions aa=new Actions(driver);
		aa.moveToElement(acces).perform();
		Thread.sleep(4000);
		WebElement pwr = driver.findElement(By.xpath("//a[text()='Power Banks']"));
		
		Actions aaa=new Actions(driver);
		aaa.moveToElement(pwr).perform();
		pwr.click();
		
		

}
}