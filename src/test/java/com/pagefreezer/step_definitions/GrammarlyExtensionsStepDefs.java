package com.pagefreezer.step_definitions;

import com.pagefreezer.utilities.ConfigurationReader;
import com.pagefreezer.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GrammarlyExtensionsStepDefs {

    @Given("User is in chrome extension page")
    public void user_is_in_chrome_extension_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("extension.url"));

    }
    @When("User see extension Grammarly on the page")
    public void user_see_extension_grammarly_on_the_page() {

    }
    @Then("User should see {string} as a title in  extension")
    public void user_should_see_as_a_title_in_extension(String string) {

    }





    @When("User click on {string} button")
    public void user_click_on_button(String string) {

    }
    @Then("User should see {string} as status")
    public void user_should_see_as_status(String string) {

    }




    @Given("User opens google docs")
    public void user_opens_google_docs() {

    }
    @When("User write {string}")
    public void user_write(String string) {

    }
    @When("User right click on wrong word")
    public void user_right_click_on_wrong_word() {

    }
    @Then("user should see another option for replace the word")
    public void user_should_see_another_option_for_replace_the_word() {

    }




    @Given("Given User opens google docs")
    public void given_user_opens_google_docs() {

    }



    @Then("user don't see another option for replace the word")
    public void user_don_t_see_another_option_for_replace_the_word() {

    }

}
