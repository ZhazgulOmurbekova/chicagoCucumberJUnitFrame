package utilities;

import apiModel.RequestBody;
import apiModel.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

public class APIUtil {

    // CRUD Operation . one method for each operation
    // One method should handle any APIs we are hitting

    private static apiModel.ResponseBody responseBody;

    public static void hitGET(String resource) {
        String uri = Config.getProperty("baseURL") + resource;
        Response response = RestAssured.get(uri);
        System.out.println(response.asString());
        Assert.assertEquals("Get API hit failed", 200, response.statusCode());
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static apiModel.ResponseBody getResponseBody() {
        return responseBody;
    }


    public static void hitPOST(String resource, RequestBody body) {
        String uri = Config.getProperty("baseURL") + resource;
        ObjectMapper objectMapper = new ObjectMapper();
        String bodyJSON = "";

        try {
            bodyJSON = objectMapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        Response response = RestAssured.given().contentType(ContentType.JSON).body(bodyJSON).when().post(uri);

        System.out.println(response.asString());
        Assert.assertEquals("Get API hit failed", 200, response.statusCode());

        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void hitPUT(String resource, RequestBody body) {

        String uri = Config.getProperty("baseURL") + resource;
        ObjectMapper objectMapper = new ObjectMapper();
        String bodyJSON = "";

        try {
            bodyJSON = objectMapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        Response response = RestAssured.given().contentType(ContentType.JSON).body(bodyJSON).when().put(uri);

        System.out.println(response.asString());
        Assert.assertEquals("Get API hit failed", 200, response.statusCode());

        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


    public static void hitDELETE(String resource){

        String uri = Config.getProperty("baseURL") + resource;
        ObjectMapper objectMapper = new ObjectMapper();
        String bodyJSON = "";

//        try {
//            bodyJSON = objectMapper.writeValueAsString(body);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
        Response response = RestAssured.given().contentType(ContentType.JSON).body(bodyJSON).delete(uri);

        System.out.println(response.asString());
        Assert.assertEquals("Get API hit failed", 200, response.statusCode());

        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
