package proj2Sw_pcg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ByAmenities {
	String[] arraytoprintkey;
	String[] arraytoprintami;
	public String searchByAmenitieslist(String string, ArrayList<String> amenitieslist, int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable1) {
		// TODO Auto-generated method stub
for(String s:amenitieslist) {
			
			if (string.equals(s)) {
		//	System.out.println(s);
				count--;
				
					
			}
			
			}
System.out.println("A List of Home  that matches the Amenities "+string+":");

for(String k: keys) {
	
	arraytoprintkey=k.split("_");
	

	arraytoprintami=arraytoprintkey[4].split(",");
	for(String h:arraytoprintami) {
		if(h.equals(string)) {
			
				System.out.print(k);
				System.out.println(" "+dataTable1.get(k));
				
		}

		
}}
System.out.println();
		if(count==0) {
			return string;
		}
			
		return null;
	}

}
