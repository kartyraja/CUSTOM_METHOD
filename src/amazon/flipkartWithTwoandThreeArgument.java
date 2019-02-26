package amazon;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartWithTwoandThreeArgument {
	
	
	static WebDriver driver;	

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
getItemSearch("5","4","2");
	}
	
	public static void getItemSearch(String num,String num2,String num3) throws InterruptedException {

		String topLocator= "//div[@id=\"container\"]/div/div[2]/div/ul/li[$]";
	    topLocator =topLocator.replace("$", num);
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(topLocator))).perform();
		Thread.sleep(1000);
		String botLocator="//div[@id=\"container\"]/div/div[2]/div/ul/li[$]/ul/li/ul/li[^]/ul/li[#]/a";
botLocator =botLocator.replace("$", num);
botLocator =botLocator.replace("^", num2);
botLocator =botLocator.replace("#", num3);
		driver.findElement(By.xpath(botLocator)).click();
		
	}

}
