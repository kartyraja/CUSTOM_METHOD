package amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	
	
	static WebDriver driver;	

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.amazon.com/");
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("One Plus",Keys.ENTER);
getItemSearch("3");
	}
	
	public static void getItemSearch(String num) throws InterruptedException {
		Thread.sleep(5000);
		String locator = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[$]/div/div/div/div[2]/div[1]/div/div/span/a/div/img";
		locator=locator.replace("$", num);
		driver.findElement(By.xpath(locator)).click();
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
	}

}
