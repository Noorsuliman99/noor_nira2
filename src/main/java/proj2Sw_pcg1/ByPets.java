package proj2Sw_pcg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ByPets {
	String[] arraytoprintkey;
	String[] arraytoprintvalue;
	public String searchByPetslist(String string, ArrayList<String> petslist, int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable1) {
		// TODO Auto-generated method stub
for(String s:petslist) {
			
			if (string.equals(s)) {
				
				
				
				count--;
				
			}
		
			}
System.out.println("A List of Home  that matches the "+string+" Pets"+":");

for(String k: keys) {
	
	arraytoprintkey=k.split("_");


	
		if(arraytoprintkey[3].equals(string)) {
			
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
