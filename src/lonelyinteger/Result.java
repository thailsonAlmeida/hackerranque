package lonelyinteger;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.ArrayList;
import java.util.List;

public class Result {
	
	/*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
    	
 
    	HashMap<Integer, Integer> lonelyList = new HashMap<>();
    	List<Integer> lonelyinteger = new ArrayList<>();
    	    	
    	//add integer in hashMap
    	for(int i=0; i < a.size(); i++)
    		lonelyList.put(a.get(i), 0);    		
    	
    	
    	//compare hashMap with list a
    	for(int i : lonelyList.keySet())   		
    		for(int n : a)     			
    			if(i == n) 
    				lonelyList.put(i, lonelyList.getOrDefault(i, 3) + 1);    		    		
    	  	
    	
    	//add to integer in the list and return
    	for(Integer n : lonelyList.keySet()) 
    		if(lonelyList.getOrDefault(n, 3) == 1) 
    			lonelyinteger.add(n);    		
    	
    	return lonelyinteger.get(0);
    }   
    
	
}
