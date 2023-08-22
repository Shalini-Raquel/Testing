package in.Simplilearn.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class APIKeyDemo {
	
	@Test
	
	public void getWeatherInfo() {
		RestAssured
		     .given()
		          .param("q","chennai")
		          .param("appid","f6e9878115e7917641ca3e154c55f1b2")
		      .when()
		           .get("https://api.openweathermap.org/data/2.5/weather")
		      .then()
		           .statusCode(200)
		           .log().all();
	}

}
