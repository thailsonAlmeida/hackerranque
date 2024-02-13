package minmaxsum;

import java.util.ArrayList;
import java.util.List;

public class MinmaxsumResult {
	
    public static void miniMaxSum(List<Integer> arr) {
    	
    	List<Long> resSumList = new ArrayList<>();
    	long resSum = 0;
    	long[] minAndMaxResSumList = {Long.MAX_VALUE, Long.MIN_VALUE};
    	
    	    	
    	//remover uma posicao e somar
    	//somando o vetor
    	for(int i=0; i<arr.size(); i++) {
    		
    		for(int n=0; n < arr.size(); n++) {
    			if(i != n) {    				
    				resSum = resSum + arr.get(n);
    			}   	
    		}
    		//armazenar respostas no vetor
    		resSumList.add(resSum);    		
    		resSum = 0;
    	}
    	
    	//percorrer a lista para saber qual e o menor e maior numero
    	minAndMaxResSumList[0] = resSumList.get(0);
    	minAndMaxResSumList[1] = resSumList.get(0);
    	
		for(int i = 0; i < resSumList.size(); i++) {
			if(resSumList.get(i) < minAndMaxResSumList[0]) {			
				minAndMaxResSumList[0] = resSumList.get(i);
			}
			
			if(resSumList.get(i) > minAndMaxResSumList[1]) {			
				minAndMaxResSumList[1] = resSumList.get(i);
			}
    	}	
		System.out.print(minAndMaxResSumList[0] + " " + minAndMaxResSumList[1]);		
    }
}
