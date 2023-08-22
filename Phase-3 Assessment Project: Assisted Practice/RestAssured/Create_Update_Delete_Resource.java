package in.Simplilearn.RestAssuredDemo;

import java.util.HashMap;
import java.util.UUID;


import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.is;

public class Create_Update_Delete_Resource extends TestBase
{
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	UUID uuid =UUID.randomUUID();
	int id;
	Response response;
	JsonPath jsonPath;
	
	//@BeforeMethod
	@Test(priority=0)
	public void createPayload() {
		map.put("name", "Captain Planet");
		map.put("email",uuid +"@gmail.com");
		map.put("gender","male");
		map.put("status","Active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath ="public/v2/users";
		logger.info("Payload Created");
	}
	
	 @Test(priority=1)	 
	 public void createResource() {
		 response = RestAssured
				                .given()
				                .contentType("application/json")
				                 .body(map)
						          .header("Authorization","Bearer e7d7891f1269139ed0955600f593a59a68267786dce1013a44403d2c0ab45a09")
						      .when()
						           .post()
						      .then()
						           .log().all()
						           .extract().response();
		 
		 logger.info("Resource Created Successfully");
		 jsonPath = response.jsonPath();
		 id = jsonPath.get("id");
		 System.out.println(id);
	 }
	 
	 @Test(priority=2)
	 public void VerifyResource() {
		 System.out.println("Id = " + id);
		 RestAssured
		 .given()
		       .contentType("application/json")
		       .header("Authorization","Bearer e7d7891f1269139ed0955600f593a59a68267786dce1013a44403d2c0ab45a09")
		  .when()
		      .get("https://gorest.co.in/public/v2/users/"+id)
		   .then()
		       .statusCode(200)
		       .log().all();
		 
		    Assert.assertTrue(jsonPath.get("name").equals("Captain Planet"));
	}
	 
	 @Test(priority=3)
	 public void updateResource() {
		    map.put("name", "Captainn Planett");
			map.put("email",uuid +"@gmail.com");
			map.put("gender","male");
			map.put("status","Active");
			RestAssured.baseURI = "https://gorest.co.in/";
			RestAssured.basePath ="public/v2/users/" +id;
			
			RestAssured
			.given()
		       .contentType("application/json")
		       .header("Authorization","Bearer e7d7891f1269139ed0955600f593a59a68267786dce1013a44403d2c0ab45a09")
		       .body(map)
		  .when()
		      .put()
		   .then()
		       .statusCode(200)
		       .log().all()
		       .assertThat()
		       .body("name", is("Captainn Planett"));	
		}
	 
	 @Test(priority=4)
	 public void deletResource() {
		 RestAssured.baseURI = "https://gorest.co.in";
		 RestAssured.basePath = "public/v2/users/" + id;
		 
		 RestAssured
			.given()
		       .contentType("application/json")
		       .header("Authorization","Bearer e7d7891f1269139ed0955600f593a59a68267786dce1013a44403d2c0ab45a09")
		  .when()
		      .delete()
		   .then()
		       .statusCode(204);
		       	
		}
}
		 
		 
	 
	
	


