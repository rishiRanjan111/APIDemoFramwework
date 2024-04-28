package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

//input parameter -> Json filepath
//Purpose of this method -> read json data
//output parameter -> return json data in string format
public class JsonHandle {
	public static String readJsonData(String filePath) throws FileNotFoundException {
		File f = new File(filePath);
		FileInputStream fi=new FileInputStream(f);
		JSONTokener jt = new JSONTokener(fi);
		JSONObject js = new JSONObject(jt);
		return js.toString();
	}

}
