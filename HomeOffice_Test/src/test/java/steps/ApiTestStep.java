package steps;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class ApiTestStep {
	static Response response;
	
	public static void main(String args[]){
		//getPostCode();
		//System.out.println(getStatusCode());
	}
	
	public  void getPostCode(){		
		RestAssured.baseURI = "http://api.postcodes.io/postcodes";		 
		 // Get the RequestSpecification of the request that you want to sent
		 // to the server. The server is specified by the BaseURI that we have
		 // specified in the above step.
		 RequestSpecification httpRequest = RestAssured.given();		 
		 // Make a GET request call directly by using RequestSpecification.get() method.
		 // Make sure you specify the resource name.
		 response = httpRequest.get("/SW1P4JA");
	}
	
	public int getStatusCode(){
		return response.getStatusCode();		
	}

}
