import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Student_Roll {
	public static void main(String args[]){ 
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(001, "nibedita");
		h.put(002, "midhu");
		h.put(003, "chaitu");
		 //Set<Integer> keys = h.keySet();  
		 //System.out.println(keys);
		  ArrayList<Integer> key = new ArrayList<Integer>(h.keySet());
		 for(Integer ke: key){            
			 System.out.println("Value of "+ke+" is: "+h.get(ke));         } 
		 System.out.println();
		
	        for(int i=key.size(); i>=1;i--){
	            System.out.println("Value of "+i
	            		+" is: "+h.get(i));
	        }
	}
	
}
