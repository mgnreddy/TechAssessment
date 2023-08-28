package restClient;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.TextReader;

public class Perform {
	
	public static Response response;

	public static String BaseURI="https://reqres.in";
	public static String EndPoint="/api/users/2";
	
	public static String URI=BaseURI+EndPoint;
		
		public static Response getMethod(String URI,Map<String,String> headers) {
			Response response = null;
			response = RestAssured.given()
					    .baseUri(URI)
					    .headers(headers)
					    .contentType(ContentType.JSON)
					    .when().log().all()
					    .get();
	
			
			System.out.println("\n\nResponse\n--------------------------\n");
			System.out.println("API Response Status Code -->> "+response.getStatusCode());
			Assert.assertEquals(response.getStatusCode(), 200);
			return response;
		}
		
	    
	  
	     public static Response postMethod(String URI,Map<String,String> headers,String Body) throws FileNotFoundException {
	    	 TextReader tr= new TextReader();
	    	 StringBuffer readFile = new StringBuffer();
	    	 
	    	 Response response = null;
	    	 readFile=tr.readTextFile(Body);
			//System.out.println(fr);

			
			response = RestAssured.given()
					    .baseUri(URI)
					    .headers(headers)
					    .contentType(ContentType.JSON)
					    .body(readFile.toString())
					    .when().log().all()
					    .post();
			
			System.out.println("\n\nResponse\n--------------------------\n");
			System.out.println("API Response Status Code -->> "+response.getStatusCode());
			Assert.assertEquals(response.getStatusCode(), 201);
	    	 return response;
			}
			

}
