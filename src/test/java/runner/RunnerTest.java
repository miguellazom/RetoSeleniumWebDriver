package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/reto.feature",
        glue = "stepdefinition",
        tags = "@Reto",
        plugin = {"html:target/build/cucumber.html"}
)
public class RunnerTest {

}
