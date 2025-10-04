package adapters.base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.PropertyReader;

public class BaseAdapters {


    protected static String user = System.getProperty("user", PropertyReader.getProperty("user"));
    protected static String key = System.getProperty("key", PropertyReader.getProperty("key"));

    protected static final String BASE_URL = "https://saucedemo111234555.testrail.io/";


    public Response get(String endpoint) {
        return RestAssured
                .given()
                .auth().preemptive().basic(user, key)
                .contentType("application/json")
                .get(BASE_URL + endpoint);
    }

    public Response post(String endpoint, Object body) {
        return RestAssured
                .given()
                .auth().preemptive().basic(user, key)
                .contentType("application/json")
                .body(body)
                .post(BASE_URL + endpoint);
    }

    public Response delete(String endpoint) {
        return RestAssured
                .given()
                .auth().preemptive().basic(user, key)
                .contentType("application/json")
                .post(BASE_URL + endpoint);
    }
}
