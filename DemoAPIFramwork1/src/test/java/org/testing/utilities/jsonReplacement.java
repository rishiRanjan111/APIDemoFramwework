package org.testing.utilities;

import java.util.regex.Pattern;

// input -- data, variableName, VariableValue
public class jsonReplacement {
	
	public static String assignValue(String body, String variableName, String variableValue) {
		
		body=body.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return body;
		
	}

}
