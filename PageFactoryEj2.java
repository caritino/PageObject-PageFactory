package trainingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryEj2 {
//	@FindBy(xpath = "//div/ul/li/a[@class = 'wpsc_product_name' and contains(text(),'Magic Mouse')]") static WebElement image;
	@FindBy(xpath = "//tr/td/input[@type = 'submit' and @name = 'btnLogin']/following-sibling::input[@name = 'btnReset']") static WebElement loginButton;
	@FindBy(xpath = "//tr/td/input[@type = 'text' and @name = 'uid']/parent") static WebElement tbUserId;
	@FindBy(xpath = "//a[contains(text(),'SELENIUM')]/ancestor::div[@class = 'canvas-middle']") static WebElement SeleniumLabel;
	
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\araba\\Downloads\\Hexaware\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://store.demoqa.com/products-page/product-category/n/");
//		driver.get("http://demo.guru99.com/Agile_Project/Agi_V1/");
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		PageFactory.initElements(driver, PageFactoryEj2.class);
		
		
		SeleniumLabel.click();
//		System.out.println(loginButton.getAttribute("value").toString());
		Thread.sleep(5000);
		
		driver.close();
		
	}
}
