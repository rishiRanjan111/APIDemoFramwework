package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;


import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonParsingUsingJsonPath;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC8_PostRealCreate {
	public static String returnIdvalue;
	
	@Test
	public void testcase8() throws IOException {
	Properties pr =	PropertiesHandle.LoadPropertiesFile("../DemoAPIFramwork1/URI.properties");
	String jsonRequestBody = JsonHandle.readJsonData("../DemoAPIFramwork1/src/test/java/org/testing/resources/realinputrequest.json");
	
	
	
	HTTPMethods http =new  HTTPMethods(pr);
	Response resObject = http.postMethod(jsonRequestBody, "Real_create_API");
	
	returnIdvalue = jsonParsingUsingJsonPath.doParsing("id",resObject);
	
	}
	

}
