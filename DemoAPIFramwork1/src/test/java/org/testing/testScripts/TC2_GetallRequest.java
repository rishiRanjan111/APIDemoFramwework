package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonParsingUsingJsonPath;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class TC2_GetallRequest {
	public static String returnGetIDvalue;
	
	@Test
	public void testcase2() throws IOException {
		Properties pr =	PropertiesHandle.LoadPropertiesFile("../DemoAPIFramwork1/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response resgetObject = http.getAllMethod("QA_URI2");
		
		returnGetIDvalue = jsonParsingUsingJsonPath.doParsing("[0].id", resgetObject);
	}

}

