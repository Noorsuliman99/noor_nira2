package proj2Sw_pcg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ByRangPrice {
	String[] arraytoprintkey;
	String[] arraytoprintvalue;
	Integer x;
	public boolean searchByRangPrice(Integer int1, Integer int2, ArrayList<String> pricelist, int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable1) {
		// TODO Auto-generated method stub
		for(String s:pricelist) {
		x=Integer.parseInt(s);
		
		
		if (int1>x && x>int2) {
			
			//System.out.println(x);
             count--;
			

		}
		}
		
		System.out.println("A List of Home  that the  price between "+int1+" and " +int2+" :");

		for(String k: values) {
		
			arraytoprintvalue=k.split("_");
			

			
				if(Integer.parseInt(arraytoprintvalue[0])<int1&& Integer.parseInt(arraytoprintvalue[0])>int2) {
					
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
