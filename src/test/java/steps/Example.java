package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Example {
    @Given("I want to write a step with name1")
    public void i_want_to_write_a_step_with_name1() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hi");
    }
    @When("I check for the {int} in step")
    public void i_check_for_the_in_step(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hi");
    }
    @Then("I verify the success in step")
    public void i_verify_the_success_in_step() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hi");
    }

}
