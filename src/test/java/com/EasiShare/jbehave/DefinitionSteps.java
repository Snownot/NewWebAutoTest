package com.EasiShare.jbehave;

import com.EasiShare.servisce.ApiSteps;
import com.EasiShare.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Steps
    ApiSteps apiSteps;

    @Given("user is on the home page")
    public void userOpenWebPage() {
        endUser.openWebPage();
    }

    @When("user see fields for '$login' and '$password' , he is input '$userName' and '$secretKey' and click button")
    public void userTryLogin(String login, String password, String userName, String secretKey) {
        endUser.enters(login, userName);
        endUser.enters(password, secretKey);
        endUser.clickButton("button");
    }

    @Given("create request to the service API")
    public void createRequest() {

    }
}
