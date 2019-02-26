package amazon;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctcTrainsBetween {
	
	
	static WebDriver driver;	

	public static void main(String[] args) throws InterruptedException, AWTException {
		
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://enquiry.indianrail.gov.in/ntes/index.html#tabs-3");
Thread.sleep(1000);
driver.findElement(By.id("ui-id-3")).click();

driver.findElement(By.id("station1")).sendKeys("CHENNAI CENTRAL");
Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(1000);
driver.findElement(By.id("station2")).sendKeys("COIMBATORE JN");
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
//driver.findElement(By.id("trnBwStnsGoBtn")).click();

getItemSearch("10:10","11:00");
	}
	
	public static void getItemSearch(String s,String d) throws InterruptedException {
	
		Thread.sleep(2000);
		List<WebElement> trow = driver.findElements(By.xpath("//*[@class='trnListBw2Stns']/tbody/tr"));
		
		for (WebElement w : trow) {
			//System.out.println(w.getText());
			List<WebElement> tdata = w.findElements(By.xpath("td"));
		
		for (int i = 0; i < tdata.size(); i++) {
			WebElement w1 = tdata.get(i);
			if(w1.getText().equals(s))
			{
				//System.out.println(w.getText());
				System.out.println("Train Number which Departs @" +s );
				System.out.println(tdata.get(1).getText());
			}
			if(w1.getText().equals(d))
			{
				//System.out.println(w.getText());
				System.out.println("Train Number which Arrives @" +d );
				System.out.println(tdata.get(1).getText());
			}
		}
		}
	
	
	}}


