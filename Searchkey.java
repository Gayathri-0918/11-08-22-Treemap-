package treemap;
import java.util.*;

public class Searchkey {

	public static void main(String[] args)
	{
		   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		   
		   tree_map1.put("C1", "Red");
		   tree_map1.put("C2", "Green");
		   tree_map1.put("C3", "Black");
		   tree_map1.put("C4", "White"); 
		     
		   System.out.println(tree_map1);
		         if(tree_map1.containsKey("C1"))
		         {
		             System.out.println("The Tree Map contains key C1");
		         } 
		         else 
		         {
		             System.out.println("The Tree Map does not contain key C1");
		         }

	}

}