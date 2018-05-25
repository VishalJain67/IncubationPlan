import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class BasicAPI {

	@Test
	public void mapApiTest() {
		
		//BaseUrl or host
		RestAssured.baseURI= "https://maps.googleapis.com";
		
		//given block- request headers, parameters, request cookies, body(for POST request)
		given().
		       param("location","-33.8670522,151.1957362").
		       param("radius","1500").
		       param("key","AIzaSyD93aeGhO1MiB5cGhUApA").
		       param("type","restaurant").
		       param("keyword","cruise").
		when().
		       get("/maps/api/place/nearbysearch/json").
		then().
		       assertThat().statusCode(200).and().contentType(ContentType.JSON).and()
		       .body("results[0].place_id", equalTo("ChIJi6C1MxquEmsR9-c-3O48ykI")).
		       and().body("results[0].name",equalTo("Cruise Bar, Restaurant & Events")).
		       and().header("Server", "scaffolding on HTTPServer2");
		       
		       
		
		//given block
		//we can give header like .header("key","value")
		//for cookie .cookie("key","value")
		//for body   .body(......)
		       
		       
		//when block - we hit the resource with that specific request type
		//get(resource)
		//put(resource)
		//post(resource)
		       
		       
		//then block- response
		//assertions to validate response.it is correct or not
		//header level validations can also be done 
		//and().contentType(ContentType.JSON);
		//and().header("Server", "scaffolding on HTTPServer2");
		//status code validations
		//Body validations (using equalTo, contains etc)
		
		
		
		//extract block- pull out the body response
		 
		       
	}

}
