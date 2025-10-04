package adapters;

import adapters.base.BaseAdapters;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.Project;

import static adapters.ProjectAdapters.deletes;

public class ProjectAPI extends BaseAdapters {

    public static void createProject() {
        RestAssured.baseURI = BASE_URL;

        BaseAdapters baseAdapters = new BaseAdapters();
        Response response = baseAdapters.post("index.php?/api/v2/add_project", "{\n" +
                "    \"name\": \"Project API\",\n" +
                "    \"announcement\": \"Just an API test\",\n" +
                "    \"show_announcement\": true\n" +
                "}");
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response: " + response.asString());

    }

    public static void deleteProject(String projectID) {
        RestAssured.baseURI = BASE_URL;
        BaseAdapters baseAdapters = new BaseAdapters();
        Response response = baseAdapters.delete(deletes(projectID));
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response: " + response.asString());
    }
}
