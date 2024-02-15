package lonelyinteger;

import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {
    	List<Integer> listInteger = new ArrayList<>();
    	listInteger.add(1);
    	listInteger.add(2);
    	listInteger.add(3);
    	listInteger.add(4);
    	listInteger.add(3);
    	listInteger.add(2);
    	listInteger.add(1);
    	
    	
    	System.out.println(Result.lonelyinteger(listInteger));
    }

}
