package com.vmware.in.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.vmware.in.jsonstructure.FieldAttributes;

public class JsonReader {
	
	public static void main(String[] args) {
		final String JSON_FILE = "input.json";
		Gson gson = new Gson();
		
		JsonReader reader = new JsonReader();
		
		try {
			String json = reader.readFile(JSON_FILE);
			Type type = new TypeToken<List<Map<String, FieldAttributes>>>(){}.getType();
			List<Map<String, FieldAttributes>> jsonList = gson.fromJson(json, type);
			
			for (Map<String, FieldAttributes> map : jsonList) {
				
				Set<String> keys = map.keySet();
				
				for (String key : keys) {
					System.out.println("key :"+key);
					
				}
				
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String readFile(String jSON_FILE) throws IOException {
		InputStream is = getClass().getClassLoader().getResourceAsStream(jSON_FILE);
		
		InputStreamReader isreader = new InputStreamReader(is);
		
		BufferedReader bf = new BufferedReader(isreader);
		
		StringBuilder sb = new StringBuilder();
		
		String read = bf.readLine();
		
		while(read != null) {
			sb.append(read);
			read = bf.readLine();
		}
		
		return sb.toString();
	}

}
