package TestsAPI;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Get_And_PostRequest {
    @Test
    public void test_get(){
        baseURI="https://reqres.in/api";
        given().get("/users?page=2").then().statusCode(200).
                body("data[3].first_name", equalTo("Bryon")).
                body("data.first_name",hasItems("Bryon"));

    }

    @Test
    public void testPost(){
        Map <String,Object> map = new HashMap<String,Object>();
        map.put("name","Littin");
        map.put("Job","Teacher");
        System.out.println(map);
        //converting to Json file
        JSONObject request = new JSONObject(map);
        System.out.println(request);

        //you can also Json Object instead of map
        request.put("Name","Shaquille o neal");
        request.put("Job","Gym");
        System.out.println(request.toJSONString());

        baseURI="https://reqres.in/api";
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).when().
                //end point /users
                post("/users").then().statusCode(201).log().all();
    }
}
