package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import utils.SeleniumDriver;

public class AfterActions {
	
	String screenshotdir = System.getProperty("user.dir") + "/test-output/Screenshots/";
	
	
	@After
	public static void tearDown(Scenario scenario) {
		
		WebDriver driver=SeleniumDriver.getDriver();
    	
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes, "image/png");
            
         }
		
		SeleniumDriver.tearDown();
	}

}
