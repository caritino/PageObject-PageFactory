package trainingSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryEj1 {
	 @FindBy(name = "q")	static WebElement searchBar;
	 @FindBy(name = "btnK") static WebElement searchButton;
	 
	 public static void search(String something) throws InterruptedException {
		 searchBar.sendKeys(something);
		 searchBar.sendKeys(Keys.ENTER);
///		 Thread.sleep(5000);
//		 searchButton.click();
	 }
	 
	 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\araba\\Downloads\\Hexaware\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		PageFactory.initElements(driver, PageFactoryEj1.class);

		search("Esta es una prueba con Page Factory");
	}
}
