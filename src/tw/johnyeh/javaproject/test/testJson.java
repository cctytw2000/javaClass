package tw.johnyeh.javaproject.test;

import java.io.InputStream;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class testJson {
	public static void main(String[] args) throws JSONException {
		// info.json
		// {
		// "id": "1",
		// "name": "Alice",
		// "age": "20",
		// "courses": [
		// "Engineering",
		// "Finance",
		// "Chemistry"
		// ]
		// }
		String resourceName = "./fun.json";
		InputStream is = testJson.class.getResourceAsStream(resourceName);
		if (is == null) {
			throw new NullPointerException("Cannot find resource file " + resourceName);
		}

		ArrayList<String> FullName = new ArrayList<String>();
		JSONTokener tokener = new JSONTokener(is);
		JSONArray object = new JSONArray(tokener);
		// System.out.println("Id : " + object.optInt("PlayerID"));
		for (int i = 0; i < object.length(); i++) {
//			System.out.println(object.get(i));
			JSONObject JB = (JSONObject) object.get(i);
//			System.out.println(JB.get("LastName"));
			String LastName_str = (String) JB.get("year");
			String FirstName_str = (String) JB.get("type");
//			System.out.println(LastName_str);
//			LastName.add(wwww);
//			FullName.add(FirstName_str + " " + LastName_str);
			System.out.println(LastName_str);

			System.out.println(FirstName_str);
		}
//		System.out.println(FullName);
	}
}
