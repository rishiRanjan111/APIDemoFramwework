package org.testing.utilities;

import io.restassured.response.Response;
//input of method -> responseobject and the jsonpath
//purpose of method->it will parse from the response based on hiven jasonpath
//output->after extracting it will return value
public class jsonParsingUsingJsonPath {
	
	public static String doParsing(String jsonPath, Response res) {
		
		String extractedValue = res.jsonPath().get(jsonPath);
		
		return extractedValue;
		
	}

}
