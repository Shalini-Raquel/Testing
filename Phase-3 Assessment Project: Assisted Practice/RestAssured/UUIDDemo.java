package in.Simplilearn.RestAssuredDemo;

import java.util.HashMap;
import java.util.UUID;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UUIDDemo {
	
HashMap<String, String> map = new HashMap<String, String>();
	
	//predefined if we get error in statuscode use UUID it is excuting pass condition
	UUID uuid = UUID.randomUUID();
	
	@BeforeMethod
	public void createPayLoad() {
		map.put("name", "Superman");
		map.put("email", uuid+"@gmail.com");
		map.put("gender","male");
		map.put("status","active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath ="public/v2/users";
	}
	
	@Test
	
	public void createResource() {
		RestAssured
		     .given()
		          .contentType("application/json")
		          .body(map)
		          .header("Authorization","Bearer e7d7891f1269139ed0955600f593a59a68267786dce1013a44403d2c0ab45a09")
		      .when()
		           .post()
		      .then()
		           .statusCode(201)
		           .log().all();

}
}
