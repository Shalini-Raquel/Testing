package in.Simplilearn.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETDemoBearerToken {
	
	@Test
	
	public void verifyResource() {
		RestAssured
		     .given()
		          .contentType("application/json")
		          .header("Authorization","Bearer e7d7891f1269139ed0955600f593a59a68267786dce1013a44403d2c0ab45a09")
		      .when()
		          .get("https://gorest.co.in/public/v2/users/4495044")
		       .then()
		            .statusCode(200)
		            .log().all();
	}
}


