package sparsearrays;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static void main(String[] args) throws IOException {	
    	List<String> listString = new ArrayList<>();
    	List<String> listQuey = new ArrayList<>();
    	
    	
    	
    	listString.add("4");
    	listString.add("aba");
    	listString.add("baba");
    	listString.add("aba");
    	listString.add("xzxb");
    	listString.add("3");
    	listString.add("aba");
    	listString.add("xzxb");
    	listString.add("ab");
    	
    	listQuey.add("aba");
    	listQuey.add("baba");
    	listQuey.add("xzxb");
    	
    	
    	Result.matchingStrings(listString, listQuey);
    }

}
