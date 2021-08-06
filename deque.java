import java.util.*;
  
public class deque 
    {
    public static void main(String[] args)
    	{
        Deque<String> dq
            = new LinkedList<String>();
        // Add at the last
        dq.add("Element 1 (Tail)");
  
        // Add at the first
        dq.addFirst("Element 2 (Head)");
  
        // Add at the last
        dq.addLast("Element 3 (Tail)");
  
        // Add at the first
        dq.push("Element 4 (Head)");
  
        // Add at the last
        dq.offer("Element 5 (Tail)");
  
        // Add at the first
        dq.offerFirst("Element 6 (Head)");
  
        System.out.println(dq + "\n");
  
        // We can remove the first element
        // or the last element.
        dq.removeFirst();
        dq.removeLast();
        System.out.println("Deque after removing " + "first and last: " + dq);
    	}
   }