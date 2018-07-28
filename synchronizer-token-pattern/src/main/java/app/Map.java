package app;

import java.util.HashMap;

public class Map {
	public static HashMap<String, String> hashMap = new HashMap<String, String>();
	
	public void setValue(String key,String value){
		hashMap.put(key, value);
	}
	
	public String getValue(String key){
		return hashMap.get(key);
	}
}
