package treemap;
import java.util.*;

public class Searchvalue {

	public static void main(String[] args) 
	{
		   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		   
		   tree_map1.put("C1", "Red");
		   tree_map1.put("C2", "Green");
		   tree_map1.put("C3", "Black");
		   tree_map1.put("C4", "White"); 
		     
		  if(tree_map1.containsValue("Green"))
		  {
		             System.out.println("The TreeMap contains value Green");
		         } 
		  else
		  {
		             System.out.println("The TreeMap does not contain value Green");
		         }

	}

}
