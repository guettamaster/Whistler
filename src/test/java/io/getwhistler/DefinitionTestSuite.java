package io.getwhistler;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {
        "src/test/resources/01.EMDSignInPage.feature",
        "src/test/resources/02.CIDSignInPage.feature",
        "src/test/resources/03.CIDVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicy.feature"

})


public class DefinitionTestSuite {}
