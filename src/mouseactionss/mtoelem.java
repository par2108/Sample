package mouseactionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mtoelem {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\mouseactionss\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));

WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
Actions acc=new Actions(driver);
acc.dragAndDrop(src, des).perform();

WebElement srcc = driver.findElement(By.xpath("//a[text()=' SALES ']"));
WebElement dess = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
Actions accc=new Actions(driver);
accc.dragAndDrop(srcc, dess).perform();


WebElement amnt = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
WebElement crdt = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
Actions a=new Actions(driver);
a.dragAndDrop(amnt, crdt).perform();

WebElement debt = driver.findElement(By.xpath("//a[text()=' -5000 ']"));
WebElement amntt = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
Actions act=new Actions(driver);
act.dragAndDrop(debt, amntt).perform();


	
	}
	

}
