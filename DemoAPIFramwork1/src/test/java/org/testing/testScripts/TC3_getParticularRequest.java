package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC3_getParticularRequest {
	
	@Test
	public void testcase3() throws IOException {
		Properties pr =	PropertiesHandle.LoadPropertiesFile("../DemoAPIFramwork1/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		http.getParticularMethod("QA_URI2", TC2_GetallRequest.returnGetIDvalue);
	}

}
