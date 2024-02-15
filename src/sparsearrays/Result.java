package sparsearrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Result {
	
    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static void matchingStrings(List<String> strings, List<String> queries) {
    	
    	List<Integer> results = new ArrayList<>();
    	HashMap<String, Integer> map = new HashMap<>();
    	
    	for(String string: strings) {
    		map.put(string, map.getOrDefault(string, 0) + 1);  
    	}
    	System.out.println(map);
    	 
    		
    	for(int i = 0; i < queries.size(); i++) {
    		results.add(map.getOrDefault(queries.get(i), 0)); 
    		System.out.println(results);
    	}
    	
    		
    	
    	//return results;
    	
    	/*Integer searchStringsIguals = 0;
    	List<Integer> resultQueryStrings = new ArrayList<>();
    	
    	//what are you going to search for
    	//determine the amount of research
    	for (int i=0; i < queries.size(); i++) {
    		//determine where to search
    		for (int s=0; s < strings.size(); s++) {    			
    			//count all data equal
    			if(queries.get(i) == strings.get(s)) 
    				searchStringsIguals++;    			    			
    		}
    		//save counts strings
    		resultQueryStrings.add(searchStringsIguals);
    		searchStringsIguals = 0;	    		
    	} 
    	
		return resultQueryStrings;*/
    	
    	
    }

}

