package javalearn;

import java.util.HashMap;

public class GetOrDefault {
	
	public static void main(String[] args) {
		example01();
		example02();
	}
	
	private static void example01() {
		// Declare a HashMap
		HashMap<String, String> weekDays = new HashMap<>();

		// Add data to the HashMap
		weekDays.put("Monday", "Working Day");
        weekDays.put("Tuesday", "Working Day");
        weekDays.put("Wednesday", "Working Day");
        weekDays.put("Thursday", "Working Day");
        weekDays.put("Friday", "Working Day");
        weekDays.put("Saturday", "Off Day");
        weekDays.put("Sunday", "Off Day");

        // Print the data in the HashMap
        System.out.println("Working Schedule : " + weekDays + "\n");


        // Check if the given key is present in the Map
        // IF yes, its value will be returned
        String sunday = weekDays.getOrDefault("Sunday", "No Announcements Yet.");
        System.out.println("Is Sunday a working day?  " + sunday);

        // IF not, the default value passed will be returned
        String christmas = weekDays.getOrDefault("Christmas", "National Holiday");
        System.out.println("Is Christmas a working day?  " + christmas);

        // Key not present in the HashMap
        // Default Value returned
        String easter = weekDays.getOrDefault("Easter", "National Holiday");
        System.out.println("Is Easter a working day?  " + easter);
	}

	private static void example02() {
		HashMap<Object, Boolean> holidays = new HashMap<>();

		  // Add data to the HashMap
	        holidays.put("Saturday",  true);
	        holidays.put("Sunday", true);

	        // Print the data in the HashMap
	        System.out.println("Holidays: " + holidays + "\n");

	        // Key not present, default value returned
	        Object christmas = holidays.getOrDefault("Christmas", true);
	        System.out.println("Is Christmas a holiday?  " + christmas);

	        // Key not present, null returned
	        christmas = holidays.get("Christmas");
	        System.out.println("Is Christmas a holiday?  " + christmas);
	}
}
