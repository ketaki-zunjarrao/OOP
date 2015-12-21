package com.techlabs.map.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		LinkedHashMap<String, String> states = new LinkedHashMap<String, String>();
		// HashMap<String, String> states = new HashMap<String, String>();

		states.put("MH", "Maharashtra");
		states.put("KL", "Kerala");
		states.put("AP", "Andhra-Pradesh");
		states.put("MH", "Madhya-phradesh");
		
		//Scanner keyboard=new Scanner(System.in);
		//System.out.println("Enter a key");
		//String key=keyboard.next();
		//if(states.containsKey(key))
		//System.out.println("The value for "+key
			//	+states.get(key.toUpperCase()));

		//String key = "AP";
		//if(!states.containsKey(key))
		//	states.get(key);
		//else {
			//System.out.println("");
		//}
		
		for(Map.Entry<String, String> temp : states.entrySet()){
			System.out.println("Key is: "+temp.getKey()+" Value is: "+temp.getValue()
					);
		}
		}
		
		
		
		//System.out.println(states);

	}
