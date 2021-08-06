import java.util.*;
public class hset
	{
  	public static void main(String[] args) 
		{
     		// Create a empty hash set
        	HashSet<String> h_set = new HashSet<String>();
     		// use add() method to add values in the hash set
          	h_set.add("Red");
          	h_set.add("Green");
          	h_set.add("Black");
          	h_set.add("White");
		h_set.add("Yellow");
		for (String element : h_set)
             		System.out.println("1st set:"+element);

          	HashSet<String> h_set2 = new HashSet<String>();
          	h_set2.add("Red");
          	h_set2.add("Pink");
          	h_set2.add("Black");
          	h_set2.add("Orange");
		h_set2.add("Yellow");
		for (String element : h_set2)
             		System.out.println("2st set:"+element);

          	//comparison output in hash set
          	
         	for (String element : h_set)
             		System.out.println(h_set2.contains(element) ? "Yes" : "No");
          	      
     		}
	}