package mouseactionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class editorials {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\mouseactionss\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		
		WebElement edi = driver.findElement(By.xpath("(//a[text()='EDITORIAL'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(edi);
		edi.click();
		
		WebElement enter = driver.findElement(By.xpath("//a[text()='Entertainment']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(enter);
		enter.click();
	

}
}