import java.util.*;
class map
	{
	public static void main(String args[])
	    	{
        	Map<String, Integer> hm = new HashMap<String, Integer>();
  
       		hm.put("a", new Integer(100));
        	hm.put("b", new Integer(200));
        	hm.put("c", new Integer(300));
        	hm.put("d", new Integer(400));
  
        // Traversing through the map, the insertion order is not retained in the hashmap.
		System.out.print("initial map contents:");
       		for (Map.Entry<String, Integer> me : hm.entrySet())
 			{
            		System.out.print(me.getKey() + ":");
            		System.out.println(me.getValue());
        		}
		System.out.print("map contents after updation:");
		hm.put("c",new Integer(500));
		for (Map.Entry<String, Integer> me : hm.entrySet())
 			{
            		System.out.print(me.getKey() + ":");
            		System.out.println(me.getValue());
        		}
		hm.remove("a");
		System.out.print("map contents after removal:");
		for (Map.Entry<String, Integer> me : hm.entrySet())
 			{
            		System.out.print(me.getKey() + ":");
            		System.out.println(me.getValue());
        		}
    		}
	}