package proj2Sw_pcg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ByArea {
	String[] arraytoprintkey;
	String[] arraytoprintvalue;
	Integer x;
	public boolean searchByArea(Integer int1, ArrayList<String> n,int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable1) {
		// TODO Auto-generated method stub
		//System.out.println(count);

		for(String s:n) {
		x=Integer.parseInt(s);
		
		
		if (int1>x) {
			
			//System.out.println(x);
             count--;
			

		}
		}
		
		System.out.println("A List of Home  that less then Area "+int1+":");

		for(String k: values) {
		
			arraytoprintvalue=k.split("_");
			

			
				if(Integer.parseInt(arraytoprintvalue[1])<int1) {
					
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
