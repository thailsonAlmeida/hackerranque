package javalearn;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		//ADD Itens
	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    //Access an Item	    
	    System.out.println(capitalCities.get("England"));
	    
	    //Remove an Item
	    capitalCities.remove("England");
	    System.out.println(capitalCities);
	    
	    //Size
	    System.out.println(capitalCities.size());
	    
	    //Loop Through a HashMap
	    // Print keys
	    for (String i : capitalCities.keySet()) {
	      System.out.println(i);
	    }
	    
	    // Print values
	    for (String i : capitalCities.values()) {
	      System.out.println(i);
	    }
	    
	    // Print keys and values
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }
		
	}	
}
