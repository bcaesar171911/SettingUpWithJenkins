package runner;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
        plugin = {"json:target/positive/cucumber.json", 
        		  "pretty", "html:target/positive/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/features",
        glue = {"steps"}
        ,tags = {"@Login"}       
        )
public class RunCuke extends AbstractTestNGCucumberTests {
	
	String screenshotdir = System.getProperty("user.dir") + "\\test-output\\Screenshots\\";
	
	@BeforeClass
    public void setup() throws IOException {
        
		if((new File(screenshotdir)).exists()) {
			FileUtils.cleanDirectory(new File(screenshotdir));
		}


    }
	
	
	@AfterClass
	public void teardown() {
		
		
	}

}
