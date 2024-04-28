package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//input parameter -> we have to give the file path
//purpose of method -> Load the any properties file
//Output parameter -> It will return object of properties file
public class PropertiesHandle {
	public static Properties LoadPropertiesFile(String filePath) throws IOException {
		
		File f = new File(filePath);// connection
		FileReader fr = new FileReader(f); // FIle Reading
		Properties pr = new Properties(); // Properties class object
		pr.load(fr);
		return pr;
		
		
	}

}
