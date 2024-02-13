package plusmine;

//import java.util.ArrayList;
import java.util.List;

public class Result {
	
	 /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
  
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
   
    //how many positive, negative and neutral arrays?    
    Double positiveTotalDoubleToList = 0.0;
    Double negativeTotalDoubleToList = 0.0;
    Double zeroTotalDoubleToList = 0.0 ;
    
    //positive
    for (Integer integer : arr) {
		if(integer > 0) {
			positiveTotalDoubleToList += 1.0 ;
		}
	}    
    
  //negative
    for (Integer integer : arr) {
		if(integer < 0) {
			negativeTotalDoubleToList += 1.0 ;
		}
	}    
    
    //zero
    for(Integer integer : arr) {
    	if(integer == 0) {
    		zeroTotalDoubleToList += 1.0 ;
    	}
    }
    
    //Array Francion    
    System.out.printf("%.6f %n", positiveTotalDoubleToList / arr.size());
    System.out.printf("%.6f %n", negativeTotalDoubleToList / arr.size());
    System.out.printf("%.6f %n", zeroTotalDoubleToList / arr.size());

    }
    
    /* Write your code here V00
    
    //how many positive, negative and neutral arrays?
    List<Integer> positiveList = new ArrayList<>();
    List<Integer> negativeList = new ArrayList<>();
    List<Integer> zeroList = new ArrayList<>();
    
    Double positiveTotalDoubleToList = 0.0;
    Double negativeTotalDoubleToList = 0.0;
    Double zeroTotalDoubleToList = 0.0 ;
    
    //positive
    for (Integer integer : arr) {
		if(integer > 0) {
			positiveList.add(integer);
			positiveTotalDoubleToList += 1.0 ;
		}
	}    
    
  //negative
    for (Integer integer : arr) {
		if(integer < 0) {
			negativeList.add(integer);
			negativeTotalDoubleToList += 1.0 ;
		}
	}    
    
    //zero
    for(Integer integer : arr) {
    	if(integer == 0) {
    		zeroList.add(integer);
    		zeroTotalDoubleToList += 1.0 ;
    	}
    }
    
    //Array Francion    
    System.out.printf("%.6f %n", positiveTotalDoubleToList / arr.size());
    System.out.printf("%.6f %n", negativeTotalDoubleToList / arr.size());
    System.out.printf("%.6f %n", zeroTotalDoubleToList / arr.size());

    }*/

}
