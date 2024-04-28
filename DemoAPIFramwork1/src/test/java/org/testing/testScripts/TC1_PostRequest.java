package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonParsingUsingJsonPath;
import org.testing.utilities.jsonReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest {
	public static String returnIdvalue;
	
	@Test
	public void testcase1() throws IOException {
	Properties pr =	PropertiesHandle.LoadPropertiesFile("../DemoAPIFramwork1/URI.properties");
	String jsonRequestBody = JsonHandle.readJsonData("../DemoAPIFramwork1/src/test/java/org/testing/resources/inputRequested.json");
	Random r = new Random();
	Integer idvalue = r.nextInt();
	
	jsonRequestBody = jsonReplacement.assignValue(jsonRequestBody, "id", idvalue.toString());
	
	HTTPMethods http =new  HTTPMethods(pr);
	Response resObject = http.postMethod(jsonRequestBody, "QA_URI2");
	
	returnIdvalue = jsonParsingUsingJsonPath.doParsing("id",resObject);
	
	
	
	
	}

}
