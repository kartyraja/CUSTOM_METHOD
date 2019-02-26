package amazon;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonRandomNumber {
	
	
	static WebDriver driver;	

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.amazon.com/");
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("One Plus",Keys.ENTER);
Random ran=new Random();
int ranNum=ran.nextInt(19);
System.out.println("Randompage Number is" +ranNum);
getItemSearch(ranNum);
	}
	
	public static void getItemSearch(int num) throws InterruptedException {
		Thread.sleep(10000);
		
		String locator = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[$]/div/div/div/div[2]/div[1]/div/div/span/a/div/img";
		String pageNum = Integer.toString(num);
		locator=locator.replace("$", pageNum);
		driver.findElement(By.xpath(locator)).click();
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
	}

}
