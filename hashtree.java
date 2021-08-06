import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
public class hashtree 
	{
   	public static void main(String[] a)
		{
      		Map<String, String> map = new HashMap<String, String>();
      		map.put("1", "A");
      		map.put("2", "B");
     		map.put("4", "D");
      		map.put("3", "C");
      		map.put("5", "E");
      		map.put("6", "F");
      		map.put("8", "H");
      		map.put("7", "G");
      		map.put("9", "I");
		System.out.println(" Map Elements = "+map);
      
		Map<String, String>sorted = new TreeMap<String, String>(map); //shows sorted form only
      		System.out.println("Tree Map Elements = "+sorted);
   		}
	}
