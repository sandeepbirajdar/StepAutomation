package stepautomate;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebUI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\sbirajdar\\OneDrive - Pivotree, Inc\\Documents\\Selenium\\FirefoxDriver\\geckodriver.exe");
		WebDriver st = new FirefoxDriver();
		// logging to step

		st.get("https://pivotree-sb01.mdm.stibosystems.com/");
		st.findElement(By.id("username")).sendKeys("sandeep.birajdar");
		st.findElement(By.id("password")).sendKeys("sandeep");
		st.findElement(By.id("kc-login")).click();
		st.findElement(By.xpath("//span[@title='VivekWebUI']")).click();
		Thread.sleep(3000);
		// initiate link
		st.findElement(By.xpath("//div[@class='gwt-Label status-selector__initiate-link-wrapper']")).click();
		Thread.sleep(3000);
		// enter sku name
		st.findElement(By.xpath("//input[@class='gwt-TextBox stibo-NameValue']")).sendKeys("Testing123");
		// select IsAvailableOnWebsite
		WebElement staticDropdown = st.findElement(By.tagName("select"));
		Select dd = new Select(staticDropdown);
		dd.selectByValue("Y");
		// select node
		st.findElement(By.xpath("//div[@title='Parent Node']")).getText();
		st.findElement(By.xpath("//i[@class='material-icons NodePickerIcon']")).click();
		st.findElement(By.xpath("//td[@class='gwt-TabBarItem-wrapper']")).click();
		st.findElement(By.xpath("//input[@class='gwt-SuggestBox']")).sendKeys("PC195683");
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton material SearchButton']")).click();
		Thread.sleep(1000);
		// OK button
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton']//div[1]")).click();

		// Save item
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton material SaveButton']")).click();
		Thread.sleep(3000);
		// start state
		st.findElement(By.xpath(
				"//div[@id='Product_Enrichment_WF']//div//div//div//div//div[@title='Show all items assigned to any user']"))
				.click();
		st.findElement(By.xpath(
				"//div[@class='workflow-states-wrapper']/div[@class='status-selector__states']/div[@class='row'][1]/div[@class='gwt-Label status-selector__link state state-StartState'][1]"))
				.click();
		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();

		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();
		Thread.sleep(3000);
		st.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(1) div:nth-child(1) span:nth-child(1)"))
				.click();

		Thread.sleep(3000);

		st.findElement(By.xpath("//div[@class='stb-rich-text-field']/textarea[@class='gwt-TextArea'][1]"))
				.sendKeys("This is mobile");

//Add reference  code
		st.findElement(By.id("stibo_tab_References")).click();
		Thread.sleep(1000);
		st.findElement(By.id("toolbar_button_Create_a_new_reference")).click();
		st.findElement(By.xpath("//i[@class='material-icons add-reference']")).click();
		Thread.sleep(2000);
		st.findElement(By.xpath("//div[@class='gwt-TabBarItem']")).click();
		st.findElement(By.xpath("//input[@class='gwt-SuggestBox']")).sendKeys("sample1");
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton material SearchButton']")).click();
		Thread.sleep(1000);
// OK button
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton']//div[1]")).click();
		Thread.sleep(1000);
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton']")).click();
		st.findElement(By.id("stibo_tab_Product_Detail")).click();

		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton material SubmitButton']")).click();
		st.findElement(By.xpath("//div[@class='button-panel']/button[@class='stibo-GraphicsButton']")).click();

		Thread.sleep(3000);
		// Enrich For Website State
		st.findElement(By.xpath(
				"//div[@id='Product_Enrichment_WF']//div//div//div//div//div[@title='Show all items assigned to any user']"))
				.click();
		st.findElement(By.cssSelector(
				"div[class='status-selector__content with-assigneePanel with-1-elements'] div[title='Enrich For Website State']"))
				.click();
		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();

		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();
		Thread.sleep(3000);

		st.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(1) div:nth-child(1) span:nth-child(1)"))
				.click();
		Thread.sleep(1000);
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton material SubmitButton']")).click();
		Thread.sleep(1000);
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton']")).click();
		Thread.sleep(1000);
//final review state
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

		WebElement staticDropdown1 = st.findElement(By.tagName("select"));
		Select dd1 = new Select(staticDropdown1);
		dd1.selectByValue("Y");
		Thread.sleep(1000);
		// reject from final review state when available to site is Y
		st.findElement(By.xpath("//div[@class='stb-Buttons']//button[2]")).click();
		Thread.sleep(1000);

		// after rejecting from final review state to Enrich For Website State
		st.findElement(By.xpath(
				"//div[@id='Product_Enrichment_WF']//div//div//div//div//div[@title='Show all items assigned to any user']"))
				.click();
		st.findElement(By.cssSelector(
				"div[class='status-selector__content with-assigneePanel with-1-elements'] div[title='Enrich For Website State']"))
				.click();
		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();

		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();
		Thread.sleep(3000);
		st.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(1) div:nth-child(1) span:nth-child(1)"))
				.click();
		Thread.sleep(3000);
		WebElement staticDropdown2 = st.findElement(By.tagName("select"));
		Select dd2 = new Select(staticDropdown2);
		dd2.selectByValue("N");
		Thread.sleep(1000);
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton material SubmitButton']")).click();
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton']")).click();
		Thread.sleep(2000);
		// again in final state
		// final review state
		st.findElement(By.xpath(
				"//div[@id='Product_Enrichment_WF']//div//div//div//div//div[@title='Show all items assigned to any user']"))
				.click();
		Thread.sleep(2000);
		st.findElement(By.xpath("//div[@class='gwt-Label status-selector__link state state-FinalReview']")).click();
		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();

		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();
		Thread.sleep(3000);
		st.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(1) div:nth-child(1) span:nth-child(1)"))
				.click();
		Thread.sleep(1000);
		// reject from final review state when available to site is N
		st.findElement(By.xpath("//div[@class='stb-Buttons']//button[2]")).click();
		Thread.sleep(3000);
		// Again in start state
		st.findElement(By.xpath(
				"//div[@id='Product_Enrichment_WF']//div//div//div//div//div[@title='Show all items assigned to any user']"))
				.click();
		Thread.sleep(3000);
		st.findElement(By.xpath(
				"//div[@class='workflow-states-wrapper']/div[@class='status-selector__states']/div[@class='row'][1]/div[@class='gwt-Label status-selector__link state state-StartState'][1]"))
				.click();
		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();

		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();
		Thread.sleep(3000);
		st.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(1) div:nth-child(1) span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton material SubmitButton']")).click();
		st.findElement(By.xpath("//div[@class='button-panel']/button[@class='stibo-GraphicsButton']")).click();
		Thread.sleep(1000);
//again in enrich state 
		st.findElement(By.xpath(
				"//div[@id='Product_Enrichment_WF']//div//div//div//div//div[@title='Show all items assigned to any user']"))
				.click();
		st.findElement(By.cssSelector(
				"div[class='status-selector__content with-assigneePanel with-1-elements'] div[title='Enrich For Website State']"))
				.click();
		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();

		Thread.sleep(3000);
		st.findElement(By.xpath("//th[@id='TableHeader_ID']//div[@class='indicator']")).click();
		Thread.sleep(3000);
		st.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(1) div:nth-child(1) span:nth-child(1)"))
				.click();
		Thread.sleep(1000);
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton material SubmitButton']")).click();
		Thread.sleep(1000);
		st.findElement(By.xpath("//button[@class='stibo-GraphicsButton']")).click();
		Thread.sleep(1000);
//Again in final review state
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
