package proj2Sw_pcg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ByRangArea {
	String[] arraytoprintkey;
	String[] arraytoprintvalue;
	Integer x;
	public boolean searchByRangArea(Integer int1, Integer int2, ArrayList<String> arealist, int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable1) {
		// TODO Auto-generated method stub

		for(String s:arealist) {
		x=Integer.parseInt(s);
		
		
		if (int1>x && x>int2) {
			
			
             count--;
			

		}
		}
		System.out.println("A List of Home  that the  Area between "+int1+" and " +int2+" :");

		for(String k: values) {
		
			arraytoprintvalue=k.split("_");
			

			
				if(Integer.parseInt(arraytoprintvalue[1])<int1&& Integer.parseInt(arraytoprintvalue[1])>int2) {
					
					for(String v: keys) {
						if(dataTable1.get(v).equals(k))
						System.out.print(v);
						}
					System.out.println(" "+k);
					
						
						
				}

				
		}
		System.out.println();
		if(count==0) {
			return true;
		}
		
		
		return false;
	}

}
