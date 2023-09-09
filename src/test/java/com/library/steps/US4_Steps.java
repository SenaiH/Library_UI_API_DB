package com.library.steps;

import com.library.pages.BookPage;
import com.library.pages.LoginPage;
import com.library.utility.BrowserUtil;
import com.library.utility.ConfigurationReader;
import com.library.utility.DB_Util;
import com.library.utility.LibraryAPI_Util;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US4_Steps {
    @Then("created user information should match with Database")
    public void created_user_information_should_match_with_database() {

    }

    /**
     * US 04 UI RELATED STEPS
     */


    @Then("created user should be able to login Library UI")
    public void created_user_should_be_able_to_login_library_ui() {

    }


    @Then("created user name should appear in Dashboard Page")
    public void created_user_name_should_appear_in_dashboard_page() {

    }
}