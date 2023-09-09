package com.library.steps;

import com.library.utility.LibraryAPI_Util;
import io.cucumber.java.en.Given;

import static io.restassured.RestAssured.given;

public class US5_Steps {
    @Given("I logged Library api with credentials {string} and {string}")
    public void i_logged_library_api_with_credentials_and(String email, String password) {

    }
    @Given("I send token information as request body")
    public void i_send_token_information_as_request_body() {

    }
}
