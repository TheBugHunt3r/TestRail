package adapters;

import adapters.base.BaseAdapters;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.TestCase;

import static adapters.base.BaseAdapters.BASE_URL;

public class TestCasesAdapters {

    public static final String ADD_CASE_ENDPOINT = "index.php?/api/v2/add_case/%s";

    public static void createTestCase() {
        RestAssured.baseURI = BASE_URL;


        BaseAdapters baseAdapters = new BaseAdapters();
        Response response = baseAdapters.post("index.php?/api/v2/add_case/1", "{\n" +
                "    \"title\": \"This is a test case\",\n" +
                "    \"type_id\": 1,\n" +
                "    \"priority_id\": 3,\n" +
                "    \"estimate\": \"3m\",\n" +
                "    \"refs\": \"RF-1, RF-2\",\n" +
                "    \"custom_steps_separated\": [\n" +
                "        {\n" +
                "            \"content\": \"Step 1\",\n" +
                "            \"expected\": \"Expected Result 1\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"content\": \"Step 2\",\n" +
                "            \"expected\": \"Expected Result 2\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"shared_step_id\": 3\n" +
                "        },\n" +
                "    \"labels\": [\n" +
                "     ‘label1, ‘label5’,7,9,10,’label8’\n" +
                "       ]\n" +
                "    ]\n" +
                "}");
        TestCase testCase = new TestCase("Login with valid credentials", "These are the preconditions for a test case");
        Response response1 = TestCasesAdapters.addCase(1,testCase);
        System.out.println("Status code: " + response1.getStatusCode());
        System.out.println("Response: " + response1.asString());
    }

    public static Response addCase(int sectionId, TestCase testCase) {
        String endpoint = String.format(ADD_CASE_ENDPOINT, sectionId);
        BaseAdapters baseAdapters = new BaseAdapters();
        return baseAdapters.post(endpoint, testCase);
    }
}
