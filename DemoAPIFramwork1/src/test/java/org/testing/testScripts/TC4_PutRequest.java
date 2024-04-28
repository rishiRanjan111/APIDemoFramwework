package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;


import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonReplacement;
import org.testng.annotations.Test;



public class TC4_PutRequest {
	
	@Test
	public void testcase4() throws IOException {
		Properties pr =	PropertiesHandle.LoadPropertiesFile("../DemoAPIFramwork1/URI.properties");
		String jsonRequestBody = JsonHandle.readJsonData("../DemoAPIFramwork1/src/test/java/org/testing/resources/inputRequestForUpdate.json");
		
		
		jsonRequestBody = jsonReplacement.assignValue(jsonRequestBody, "id", TC2_GetallRequest.returnGetIDvalue);
		
		HTTPMethods http =new  HTTPMethods(pr);
		http.putMethod(jsonRequestBody, "QA_URI2", TC2_GetallRequest.returnGetIDvalue);

}
}
