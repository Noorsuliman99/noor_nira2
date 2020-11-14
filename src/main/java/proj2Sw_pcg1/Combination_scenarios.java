package proj2Sw_pcg1;

import java.util.ArrayList;
import java.util.Set;

public class Combination_scenarios {
	String[] arraycom;
	public boolean bycombinationSearch(String string,String string2,Set<String> keys  , int count) {
		// TODO Auto-generated method stub

		for (String key : keys) {
			arraycom=key.split("_");
			if (string.equals(arraycom[0]) && string2.equals(arraycom[2])) {   
			
		
				//System.out.print(s);
				//System.out.print(s1);
			
	            count--;
		}
			}
			
			if(count==0) {
				
				return true;
				
			}
		return false;
	}

}





