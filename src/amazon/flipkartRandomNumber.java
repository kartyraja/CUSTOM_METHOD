package amazon;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartRandomNumber {
	
	
	static WebDriver driver;	

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@type='text']")).sendKeys("VIVO",Keys.ENTER);

Random ran=new Random();
int ranNum=ran.nextInt(24);
System.out.println("Randompage Number is" +ranNum);
getItemSearch(ranNum);
	}
	
	public static void getItemSearch(int num) throws InterruptedException {
		Thread.sleep(5000);
	int row = num;
	if(row<=4)
	{

		String locator = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/div[$]/div/a[1]/div[1]/div/div/img";
		String pageNum = Integer.toString(row);
		locator=locator.replace("$", pageNum);
		driver.findElement(By.xpath(locator)).click();
	}
	if(row>4 && row<=8)
	{
		String col="3";
		String pageNum2 = Integer.toString(row-4);
		String locator = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]/div[^]/div/div[$]/div/a[1]/div[1]/div/div/img";
		//String pageNum = Integer.toString(row);
		locator=locator.replace("^", col);
		locator=locator.replace("$", pageNum2);
		driver.findElement(By.xpath(locator)).click();
	}
	if(row>8 && row<=12)
	{
		String col="4";
		String pageNum2 = Integer.toString(row-8);
		String locator = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]/div[^]/div/div[$]/div/a[1]/div[1]/div/div/img";
		locator=locator.replace("^", col);
		locator=locator.replace("$", pageNum2);
		driver.findElement(By.xpath(locator)).click();
	}
	if(row>12 && row<=16)
	{
		String col="5";
		String pageNum2 = Integer.toString(row-12);
		String locator = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]/div[^]/div/div[$]/div/a[1]/div[1]/div/div/img";
		locator=locator.replace("^", col);
		locator=locator.replace("$", pageNum2);
		driver.findElement(By.xpath(locator)).click();
	}
	if(row>16 && row<=20)
	{
		String col="6";
		String pageNum2 = Integer.toString(row-16);
		String locator = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]/div[^]/div/div[$]/div/a[1]/div[1]/div/div/img";
		locator=locator.replace("^", col);
		locator=locator.replace("$", pageNum2);
		driver.findElement(By.xpath(locator)).click();
	}
	if(row>20 && row<=24)
	{
		String col="7";
		String pageNum2 = Integer.toString(row-20);
		String locator = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]/div[^]/div/div[$]/div/a[1]/div[1]/div/div/img";
		locator=locator.replace("^", col);
		locator=locator.replace("$", pageNum2);
		driver.findElement(By.xpath(locator)).click();
	}
	}

}
