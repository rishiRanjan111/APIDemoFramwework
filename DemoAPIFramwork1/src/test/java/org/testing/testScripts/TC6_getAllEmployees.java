package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

import org.testing.utilities.jsonParsingUsingJsonPathforInteger;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_getAllEmployees {
	
	public static Integer returnGetIDvalue;
	
	@Test
	public void testcase6() throws IOException {
		Properties pr =	PropertiesHandle.LoadPropertiesFile("../DemoAPIFramwork1/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response resgetObject = http.getAllMethod("Real_API_employees_get");
		
		returnGetIDvalue = jsonParsingUsingJsonPathforInteger.doParsing("[0].id", resgetObject);
	}

}
