package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\Users\\shiva\\Documents\\Mobile-Testing\\Sparch_kakadi\\src\\test\\resources\\Sparsh\\contact.feature",
		glue = "steps"
		
		)


public class SparshRunner {
	

}
