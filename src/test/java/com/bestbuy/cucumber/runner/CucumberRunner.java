package com.bestbuy.cucumber.runner;


import com.bestbuy.testbase.TestBase1;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature/")

public class CucumberRunner extends TestBase1 {
}
