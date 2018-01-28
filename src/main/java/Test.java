import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Test {
	
	 public static void main(String [] args) {
		  
		  Map<String, Map<String, Map<String, String>>> testMap = new HashMap<>();
		  
		  Map<String, String> third = new HashMap<>();
		  third.put("jay", "briyani");
		  third.put("hema", "thani");
		  third.put("evano", "briyani");
		  
		  Map<String, String> third2 = new HashMap<>();
		  third2.put("jay1", "briyani");
		  third2.put("hema1", "thani");
		  third2.put("evano1", "briyani");
		  
		  Map<String, Map<String, String>> second = new HashMap<>();
		  second.put("veg", third);
		  
		  Map<String, Map<String, String>> second2 = new HashMap<>();
		  second2.put("non veg", third2);
		  
		  
		  Map<String, Map<String, Map<String, String>>> first = new HashMap<>();
		  
		  first.put("male", second);
		  first.put("feamle", second2);
		  
		  
		  for(Entry<String, Map<String, Map<String, String>>>  first1   : testMap.entrySet()) {
		 	 
		 	 
		 	 for(  Entry<String, Map<String, String>> second1 :first1.getValue().entrySet()) {
		 		 
		 		 for(  Entry<String, String> third1 :second1.getValue().entrySet()) {
		 			 
		 			 System.out.println( first1.getKey()+first1.getValue() +second1.getKey()+
		 					 second1.getValue()+  third1.getKey()+ third1.getValue());
		 			 
		 		 }
		 		 
		 	 }
		  }
	  }
	  

}
