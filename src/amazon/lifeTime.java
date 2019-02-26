package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lifeTime {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.lifetime.life/");
	printHead("1","2");
	}	
	
	public static void printHead(String a, String b) throws InterruptedException {
		String locator="//*[@id=\"primaryNav\"]/li[$]/a";
		locator=locator.replace("$", a);
		System.out.println(driver.findElement(By.xpath(locator)).getText());
		driver.findElement(By.xpath(locator)).click();
		
		String locator2="//*[@id=\"primaryNav\"]/li[$]/div[2]/ul/li[^]/a";
		locator2=locator2.replace("$", a);
		locator2=locator2.replace("^", b);
	System.out.println(driver.findElement(By.xpath(locator2)).getText());
	
	driver.quit();
	
	}
}
