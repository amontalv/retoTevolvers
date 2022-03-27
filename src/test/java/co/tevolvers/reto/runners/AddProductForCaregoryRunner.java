package co.tevolvers.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\co.tevolvers.reto.front.feature\\addproductforcategory.feature",
glue = "co.tevolvers.reto.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class AddProductForCaregoryRunner {
}
