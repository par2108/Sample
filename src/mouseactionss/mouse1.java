package mouseactionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\mouseactionss\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	
	WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Actions acc=new Actions(driver);
	acc.dragAndDrop(src, des).perform();
	
	WebElement amnt = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement sen = driver.findElement(By.xpath("//li[@class='placeholder']"));
	Actions a=new Actions(driver);
	a.dragAndDrop(amnt, sen).perform();
	
	WebElement sel = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement les = driver.findElement(By.xpath("//li[@class='placeholder']"));
	Actions aa=new Actions(driver);
	aa.dragAndDrop(sel, les).perform();
	
	
	WebElement bank = driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement bankk = driver.findElement(By.xpath("//li[@class='placeholder']"));
	Actions accc=new Actions(driver);
	accc.dragAndDrop(bank, bankk).perform();
}
}
