package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC7_getParticularProduct {
	
	@Test
	public void testcase7() throws IOException {
		Properties pr =	PropertiesHandle.LoadPropertiesFile("../DemoAPIFramwork1/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		http.getParticularMethodInt("Real_API_employees_get", TC6_getAllEmployees.returnGetIDvalue);
	}

}
