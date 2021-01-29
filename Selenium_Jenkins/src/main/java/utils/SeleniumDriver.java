package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	private WebDriverWait waitDriver;
	public final static int TIMEOUT = 15;
	public final static int PAGE_LOAD_TIMEOUT = 15;
	private String browser;

	private SeleniumDriver() {

		browser = "CH";

		if (browser.equals("CH")) {

			//Chrome
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			waitDriver = new WebDriverWait(driver, TIMEOUT);
			driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
			// driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);

		} else if (browser.equals("ED")) {
			
			//Edge
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();

			waitDriver = new WebDriverWait(driver, TIMEOUT);
			driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
			// driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		}

	}

	public static void openPage(String url) {

		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {

		if (seleniumDriver == null) {

			seleniumDriver = new SeleniumDriver();
		}
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}

		seleniumDriver = null;
	}

}
