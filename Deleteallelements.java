package treemap;
import java.util.*;
public class Deleteallelements {

	public static void main(String[] args) 
	{
		   TreeMap<String,String> tree_map1 = new TreeMap<String,String>();      
		 
		  tree_map1.put("C1", "Red");
		  tree_map1.put("C2", "Green");
		  tree_map1.put("C3", "Black");
		  tree_map1.put("C4", "White"); 
		    
		  System.out.println("Orginal TreeMap content: "+tree_map1);
		  tree_map1.clear();
		  System.out.println("The New map: "+tree_map1);

	}

}