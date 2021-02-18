package io.getwhistler;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {
        "src/test/resources/01.EMDSignInPage.feature",
        "src/test/resources/02.CIDSignInPage.feature",
        "src/test/resources/03.CIDVerifyingThatTheLexiconHasTheNeverBlockOptionSelectedInTheBlockingPolicy.feature",
        "src/test/resources/05.RASignInPage.feature",
        "src/test/resources/06.RAVerifyingThatViolationSentAndDisplayedOnEmail.feature",
        "src/test/resources/07.RAVerifyingTheContentInsideTheEmailWithTheViolation.feature"
})


public class DefinitionTestSuite {}
