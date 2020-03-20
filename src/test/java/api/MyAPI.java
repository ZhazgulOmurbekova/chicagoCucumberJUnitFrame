package api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.json.Json;

import java.util.List;
import java.util.Map;

public class MyAPI {

    @Test
    public void getTeacherList() {
        // Step 1. Hit API
        // HTTP method , EndPoint , Body, Header
        String url = "http://api.cybertektraining.com/teacher/1629";
        Response response = RestAssured.get(url);
        System.out.println(response.statusCode());
        System.out.println(response.asString());


        JsonPath jp = response.jsonPath();

        String firstName = jp.get("teachers[0].firstName");
        System.out.println(firstName);

        String subject = jp.get("teachers[0].subject");
        System.out.println(subject);

        Assert.assertTrue(firstName != null);

        String urlAllTeacher = "http://api.cybertektraining.com/teacher/all";
        Response response1 = RestAssured.get(urlAllTeacher);
        JsonPath jp1 = response1.jsonPath();
        // String allTeacher = jp1.get("teachers[0]");

        System.out.println(response1.statusCode());
        System.out.println(response1.asString());
    }

    @Test
    public void allTeacher() {
        String urlAllTeacher = "http://api.cybertektraining.com/teacher/all";
        Response response1 = RestAssured.get(urlAllTeacher);

        Assert.assertEquals("API Server down", 200, response1.statusCode());


        System.out.println(response1.asString());

        JsonPath jp1 = response1.jsonPath();
        int size = jp1.getList("teachers").size();
        System.out.println(size);

        for (int i = 0; i < size; i++) {
            String pathNAme = "teachers["+i+"].department";
            String pathEmail = "teachers[" + i + "].emailAddress";

            String name = jp1.get(pathNAme);
            String email = jp1.get(pathEmail);


            Assert.assertTrue(name != null);
            Assert.assertTrue(email != null);

        }
    }

    @Test
    public void department() {
        String urlAllTeacher = "http://api.cybertektraining.com/teacher/department/Computer";
        Response response = RestAssured.get(urlAllTeacher);

        JsonPath jp1 = response.jsonPath();
        int size = jp1.getList("teachers").size();

        System.out.println(response.statusCode());
        System.out.println(size);

        for (int i = 0; i < size; i++) {
            String pathDepartment = "teachers["+i+"].department";

            String department = jp1.get(pathDepartment);

            Assert.assertEquals("Department failed" +i,"Computer",department);




        }

        System.out.println(response.asString());


    }

}
