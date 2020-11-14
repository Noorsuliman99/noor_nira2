package proj2Sw_pcg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ByTybe {

private ByTybe type ;
private ByPlacement placement ;
private ByAmenities amenities ;
private ByMaterial material ;
private ByPets pets ;
private ByPrice price ;
private ByRangPrice rangprice ;
private ByRangArea rangarea ;
private ByArea area ;
private ByNumberOfBedrooms nob ;
private ByNumberOfBathrooms nobath ;
private ByLeaseLength leaselength ;
String[] arraytoprintkey;
String[] arraytoprintvalue;
//int flag=0;
	public String searchByType(String string, ArrayList<String> Arr,int count,Set<String> keys,Collection<String> values,Map<String,String> data) {
		
	//	System.out.print(count);
	
		
		for(String s:Arr) {

			if (string.equals(s)) {   
			
				//flag++;
			
				
	         
	            count--;
			}
	        
			/////////////////////////////////////////////////
		}
			
		//for(int i=0;i<flag;i++) {
			System.out.println("A List of Home  that matches the  type  "+string+":");
			for(String k: keys) {
			
			arraytoprintkey=k.split("_");
        
        
				
				if(arraytoprintkey[0].equals(string)) {
					
						System.out.print(k);
						System.out.println(" "+data.get(k));
						
				}
        
				
        }
		
			System.out.println();

		if(count==0) {
			
			return string;
			
		}
		
		return null;
		}
	}