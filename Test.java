package stepautomate;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	static String Id1 ="P277983";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\sbirajdar\\OneDrive - Pivotree, Inc\\Documents\\Selenium\\FirefoxDriver\\geckodriver.exe");
		WebDriver st = new FirefoxDriver();
		//WebDriver st = new ChromeDriver();
		st.get("https://pivotree-sb01.mdm.stibosystems.com/");
		st.findElement(By.id("username")).sendKeys("sandeep.birajdar");
		st.findElement(By.id("password")).sendKeys("sandeep");
		st.findElement(By.id("kc-login")).click();
		st.findElement(By.xpath("//span[@title='VivekWebUI']")).click();
		Thread.sleep(3000);
		/*st.findElement(By.xpath(
				"//div[@id='Enrichment_WF']//div//div//div//div//div[@title='Show all items assigned to any user']"))
				.click();
		Thread.sleep(1000);
		st.findElement(By.xpath("//div[@class='gwt-Label status-selector__link state state-FinalReview']")).click();
		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();

		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();
		Thread.sleep(3000);
		st.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(1) div:nth-child(1) span:nth-child(1)"))
				.click();
		Thread.sleep(1000);
		st.findElement(By.xpath("//div[@class='stb-Buttons']//button[1]")).click();
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton']")).click();
		//button[@class='stibo-GraphicsButton']
		*/
		
		
		st.findElement(By.xpath(
				"//div[@id='Product_Enrichment_WF']//div//div//div//div//div[@title='Show all items assigned to any user']"))
				.click();
		Thread.sleep(1000);
		st.findElement(By.xpath("//div[@class='gwt-Label status-selector__link state state-FinalReview']")).click();
		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();

		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();
		Thread.sleep(3000);
		st.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(1) div:nth-child(1) span:nth-child(1)"))
				.click();
		Thread.sleep(1000);

		st.findElement(By.xpath("//div[@class='stb-Buttons']//button[1]")).click();
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton']")).click();

		st.close();
		
		
	}
		
		}



