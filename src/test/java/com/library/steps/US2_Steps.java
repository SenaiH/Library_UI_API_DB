package com.library.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class US2_Steps {
    @Given("Path param is {string}")
    public void path_param_is(String pathParam) {

    }
    @Then("{string} field should be same with path param")
    public void field_should_be_same_with_path_param(String path) {

    }
    @Then("following fields should not be null")
    public void following_fields_should_not_be_null(List<String> paths) {

    }
}
