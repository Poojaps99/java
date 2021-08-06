import java.util.LinkedHashSet; 
  
public class LHSet
{      
      // Main Method
    public static void main(String[] args) 
    {  
        LinkedHashSet<String> ls = new LinkedHashSet<String>();    
        // Adding element to LinkedHashSet  
        ls.add("A");  
        ls.add("B");  
        ls.add("C");  
        ls.add("D"); 
  
        // This will not add new element as A already exists 
        ls.add("A"); 
        ls.add("E");  
  
        System.out.println("Size of LinkedHashSet = " + ls.size());  
        System.out.println("Original LinkedHashSet:" + ls);  
        System.out.println("Removing D from LinkedHashSet: " +ls.remove("D"));          
        System.out.println("Checking if A is present=" + ls.contains("A"));
        System.out.println("Updated LinkedHashSet: " + ls);  
    }  
}  

 