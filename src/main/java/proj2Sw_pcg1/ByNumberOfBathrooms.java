package proj2Sw_pcg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ByNumberOfBathrooms {
	String[] arraytoprintkey;
	String[] arraytoprintvalue;
	Integer x ;
	public boolean searchByNumberOfBathrooms(Integer int1, ArrayList<String> numofbathroomslist, int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable1) {
		// TODO Auto-generated method stub
		for(String s:numofbathroomslist) {
			x=Integer.parseInt(s);
			
			
			if (x==int1  ) {
				
				//System.out.println(x);
	             count--;
				

			}
		}
		System.out.println("A List of Home  that contain "+int1+" Bathroom :");

		for(String k: values) {
		
			arraytoprintvalue=k.split("_");
			

			
				if(Integer.parseInt(arraytoprintvalue[3])==int1) {
					
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
