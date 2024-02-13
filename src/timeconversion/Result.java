package timeconversion;


public class Result {
	
	/*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
     
    public static String timeConversion(String s) {	
    	
    	Integer hhInteger;
    	String[] hhmmss = {};
    	
    	//add hour in array
    	hhmmss = s.split(":");
    	hhInteger = Integer.parseInt(hhmmss[0]);
    	
    	//is PM?
    	if(s.toUpperCase().endsWith("PM")){    
    		hhInteger = Integer.parseInt(hhmmss[0]); //convert hh to Integer
    		//-12?
    		if(hhInteger < 0){    			
    			hhmmss[0] = "00";
    			return hhmmss[0] + ":" + hhmmss[1] +  ":" + hhmmss[2].substring(0,2);    		
    		}
    		else if(hhInteger == 12 && s.endsWith("PM")){
        		hhmmss[0] = "12";
    			return hhmmss[0] + ":" + hhmmss[1] +  ":" + hhmmss[2].substring(0,2);
        	} 
    		else{    			
    			hhInteger = Integer.parseInt(hhmmss[0]) + 12; 
    			
    			if(hhInteger == 24){
    				hhmmss[0] = "00";
    				return hhmmss[0] + ":" + hhmmss[1] +  ":" + hhmmss[2].substring(0,2);    				
    			}else {
    				hhInteger = Integer.parseInt(hhmmss[0]) + 12;
    				hhmmss[0] = String.valueOf(hhInteger);
    				return hhmmss[0] + ":" + hhmmss[1] +  ":" + hhmmss[2].substring(0,2); 
    			}    			
    		}    		
    	}
    	
    	//-12 and AM?
    	else if(hhInteger < 0 && s.endsWith("AM")){
    		hhmmss[0] = "00";
			return hhmmss[0] + ":" + hhmmss[1] +  ":" + hhmmss[2].substring(0,2);
    	}
    	//12 and AM?
    	else if(hhInteger == 12 && s.endsWith("AM")){
    		hhmmss[0] = "00";
			return hhmmss[0] + ":" + hhmmss[1] +  ":" + hhmmss[2].substring(0,2);
    	}    	 
    	return hhmmss[0] + ":" + hhmmss[1] +  ":" + hhmmss[2].substring(0,2); 
    }   

}

