package proj2Sw_pcg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ByPlacement {

	String[] arraytoprintkey;
	String[] arraytoprintvalue;
	public String searchByPlacement(String string, ArrayList<String> placementlist, int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable1) {
		// TODO Auto-generated method stub	// TODO Auto-generated method stub
	//	System.out.print(count);

		for(String s:placementlist) {
		
			if (string.equals(s)) {
			//	System.out.print(s);
				count--;
				
					
			}
			
					
				
			}
		System.out.println("A List of Home  that matches the Placment "+string+":");

		for(String k: keys) {
			
			arraytoprintkey=k.split("_");


			
				if(arraytoprintkey[2].equals(string)) {
					
						System.out.print(k);
						System.out.println(" "+dataTable1.get(k));
						
				}

				
		}
		System.out.println();
		if(count==0) {
			return string;
		}
		
		return null;
	}
		
}
