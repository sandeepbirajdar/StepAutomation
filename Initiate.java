package stepautomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Initiate {

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
		st.findElement(By.xpath("//div[@class='gwt-Label status-selector__initiate-link-wrapper']")).click();
		Thread.sleep(3000);
		//enter sku name 
		st.findElement(By.xpath("//input[@class='gwt-TextBox stibo-NameValue']")).sendKeys("Testing123");
		//select IsAvailableOnWebsite
		WebElement staticDropdown = st.findElement(By.tagName("select"));
		Select dd= new Select(staticDropdown);
		dd.selectByValue("N");
		//Enter ShortDescription
		//st.findElement(By.xpath("//textarea[@class='gwt-TextArea']")).sendKeys("This is testing item");
		//Thread.sleep(1000);
		//st.findElement(By.xpath(null)
		//Enter Parent Node
		st.findElement(By.xpath("//div[@title='Parent Node']")).getText();
		st.findElement(By.xpath("//i[@class='material-icons NodePickerIcon']")).click();
		st.findElement(By.xpath("//td[@class='gwt-TabBarItem-wrapper']")).click();
		st.findElement(By.xpath("//input[@class='gwt-SuggestBox']")).sendKeys("PC195683");
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton material SearchButton']")).click();
		Thread.sleep(2000);
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton']//div[1]")).click();

		//Save item
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton material SaveButton']")).click();
		st.close();
	}

}
