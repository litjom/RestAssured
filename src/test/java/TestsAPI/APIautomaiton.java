package TestsAPI;


import com.mongodb.util.JSON;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class APIautomaiton {

    @Test
    public void test_1 (){
        Response response = get("https://reqres.in/api/users?page=2");


        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.print(response.getStatusCode());
        System.out.println(response.getHeader("content-type"));

        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode,200);

    }

    @Test
    public void test_2(){
         baseURI="https://reqres.in/api";
        given().get("users?page=2").then().statusCode(200).body("data[1].id",equalTo(8))
                .log().all();
    }
    //given -All input details
    //when - Subtmit api response- resource, http ,method
    //Then -Validate the response
    @Test
    public void Rahushetty() {
        baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all().queryParam("key", "qaclick123").
                header("Content-Type", "application/json").
                body("{\\r\\n\" +\n" +
                        "\"\\\"place_id\\\":\\\"\"+placeId+\"\\\",\\r\\n\" +\n" +
                        "\"\\\"address\\\":\\\"\"+newAddress+\"\\\",\\r\\n\" +\n" +
                        "\"\\\"key\\\":\\\"qaclick123\\\"\\r\\n\" +\n" +
                        "\"}").when().post("map/api/place/add/json")
                .then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
                .header("server", "Apache/2.4.18(Ubuntu)") //asserting the correct server
                .extract().response().asString(); //extracting reponse

        System.out.println(response);
        //How to extract specifce varaibles
        JsonPath js = new JsonPath(response); //for parsing JSON
        String placeid = js.getString("place_id");   //path of JSON -parent/child
        //What if you have to add a place Id and update place with new address and
        // validate the new response in the address
        System.out.println(placeid);
    }
@Test
        public void putrequest(){
    given().log().all().queryParam("key","Qaclick123").
            header("Content-Type","application/json")
            .body("")  //we need to give the body
            .when().put("maps/api/place/update/json")
            .then().assertThat().statusCode(200).body("msg",equalTo("address succesfully added"));
        }

@Test
    public void Extraction(){
        String newaddress = "Summerwalk,Africa";
      String getplaceResponse =  given().log().all().
                queryParam("key","quicklatest")
                .queryParam("place_id","placeId")
                .when().get()
                .then().assertThat().log().all().statusCode(200).extract().response().asString();

    JsonPath js20 = new JsonPath(getplaceResponse);
    String actual =js20.getString("address");

}


}
