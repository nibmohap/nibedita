
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Question1{   
public static void main(String args[]){   

	TreeSet al = new TreeSet(); 
	TreeSet a2 = new TreeSet();
  al.add( "Ravi");   
  al.add("Vijay");   
  al.add("Ravi");   
  al.add("Ajay"); 
  al.add("Bonty");
  al.add("Monty");
  a2=(TreeSet)al.descendingSet();
  Iterator iterator= a2.iterator();
  Iterator<String> itr=al.iterator();
  while(itr.hasNext()){   
  System.out.println(itr.next());   
  }  
  System.out.println("---------------------------");
  while(iterator.hasNext()){   
	  System.out.println(iterator.next());   
	  } 
 
 
}  }

