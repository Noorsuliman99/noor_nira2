package proj2Sw_pcg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proj2Sw_pcg1.ByAmenities;
import proj2Sw_pcg1.ByArea;
import proj2Sw_pcg1.ByLeaseLength;
import proj2Sw_pcg1.ByMaterial;
import proj2Sw_pcg1.ByNumberOfBathrooms;
import proj2Sw_pcg1.ByNumberOfBedrooms;
import proj2Sw_pcg1.ByPets;
import proj2Sw_pcg1.ByPlacement;
import proj2Sw_pcg1.ByPrice;
import proj2Sw_pcg1.ByRangArea;
import proj2Sw_pcg1.ByRangPrice;
import proj2Sw_pcg1.ByTybe;
import proj2Sw_pcg1.Combination_scenarios;


public class searchHomeStep {
	boolean r;
	boolean e;
	boolean cm;
	int count;
    ByPrice p;
	ByTybe t;
	ByLeaseLength ll;
	ByPlacement pl ;
	ByMaterial m ;
	ByAmenities a ;
	ByArea ar;
	ByPets pets;
	ByRangPrice rp ;
	ByRangArea ra ;
	ByNumberOfBathrooms nob ;
	ByNumberOfBedrooms nobed;
	Combination_scenarios com ; 
	
	
	
	Map<String,String> dataTable;

	private String spec ,spec1;
	private int price;
	private int area;
	private int numofbedrooms ;
	private int numofbathrooms ;
	
	
	ArrayList<String> pricelist=new ArrayList<String>();
	ArrayList<String> arealist=new ArrayList<String>();
	ArrayList<String> typelist=new ArrayList<String>();
	ArrayList<String> placementlist=new ArrayList<String>();
	ArrayList<String> amenitieslist=new ArrayList<String>();
	ArrayList<String> materiallist=new ArrayList<String>();
	ArrayList<String> petslist=new ArrayList<String>();
	ArrayList<String> numofbedroomslist=new ArrayList<String>();
	ArrayList<String> numofbathroomslist=new ArrayList<String>();
	ArrayList<String> leaseLengthlist=new ArrayList<String>();
	ArrayList<String> combination=new ArrayList<String>();
	
	//ArrayList<ArrayList<String>> listOLists = new ArrayList<ArrayList<String>>();
	
	
	String[] arraykey=null;
	String[] arrayamenties=null;
	String[] arrayvalue=null;
	Set<String> keys ;
	Collection<String> values; 
	String result ,result1 ;
	Map<String,String> dataTable1;
		@Given("these homes are contained in the system")
		public void theseHomesAreContainedInTheSystem(Map<String,String> dataTable) {
			dataTable1=dataTable;
			keys= dataTable.keySet();
			values= dataTable.values();
    for (String key : keys) {
	arraykey =key.split("_");
	
	typelist.add(arraykey[0]);
	materiallist.add(arraykey[1]);
	placementlist.add(arraykey[2]);
	petslist.add(arraykey[3]);
	amenitieslist.add(arraykey[4]);
	combination.add(arraykey[0]);
	combination.add(arraykey[2]);
	arrayamenties=arraykey[arraykey.length-1].split(",");
	for(int i=0 ; i<arrayamenties.length ;i++) {
	amenitieslist.add(arrayamenties[i]);
    }
	}
for (String value : values) {
	arrayvalue=value.split("_");
	pricelist.add(arrayvalue[0]);
	arealist.add(arrayvalue[1]);
	numofbedroomslist.add(arrayvalue[2]);
	numofbathroomslist.add(arrayvalue[3]);
	leaseLengthlist.add(arrayvalue[4]);
}

 



//for(String b :pricelist) {
	//System.out.println("nira"+b);		

	
//}
//for(String b :typelist) {
	//System.out.println("nira"+b);		

	
//}

		

		}


			@When("I search about home by {string}")
			public void iSearchAboutHomeBy(String string) {
			  
				 count=0;
		if(string.equals("HOUSE")||string.equals("APARTMENT")) {
					 
				 
				for(String d:typelist) {
				if(string.equals(d)) {count++;}	
				}
				this.spec=string;
				boolean f=true;
				 t=new ByTybe();
				result=t.searchByType(string,typelist,count,keys,values,dataTable1);}
		
		else if(string.equals("WOOD")||string.equals("BRICK")||string.equals("STONE")) {
			 
			 
			for(String d:materiallist) {
			if(string.equals(d)) {count++;}	
			}
			this.spec=string;
			boolean f=true;
			 m=new ByMaterial();
			result=m.searchByMaterial(string,materiallist,count,keys,values,dataTable1);}
				 
				 
				 else if(string.equals("CITY")||string.equals("VILLAGE")) {
					 
						
						for(String d:placementlist) {
						if(string.equals(d)) {count++;}	
						}
						this.spec=string;
						boolean f=true;
						 pl=new ByPlacement();
						result=pl.searchByPlacement(string,placementlist,count,keys,values,dataTable1);}
				 
				 else if(string.equals("ELEVATOR")||string.equals("GARAGEPARKING")||string.equals("FIREPLACE")||
						 string.equals("AIRCONDITIONING")||string.equals("BALCONY")||string.equals("SWIMMINGPOOL")) {
					 
						
						for(String d:amenitieslist) {
						if(string.equals(d)) {count++;}	
						}
						this.spec=string;
						boolean f=true;
						 a=new ByAmenities();
					result=a.searchByAmenitieslist(string,amenitieslist,count,keys,values,dataTable1);}
				
				 else if(string.equals("YES")||string.equals("NO")) {
					 
						
						for(String d:petslist) {
						if(string.equals(d)) {count++;}	
						}
						this.spec=string;
						boolean f=true;
						pets=new ByPets();
						result=pets.searchByPetslist(string,petslist,count,keys,values,dataTable1);}
				//System.out.println(result);
				//System.out.println(result);
				 
			
			  
			  
				
			}




		@Then("A list of homes that matches the  type specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		 
			assertEquals(result,spec);
		}

		

			@Then("A list of homes that matches the  material specification should be returned and printed on the console")
			public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
				assertEquals(result,spec);	
			}



	
		@Then("A list of homes that matches the  placement specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePlacementSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		  
			assertEquals(result,spec);
		}
		
		@Then("A list of homes that matches the  amenties specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAmentiesSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		 
			assertEquals(result,spec);
			
		}
		

		
			@Then("A list of homes that matcshes the pets specification should be returned and printed on the console")
			public void aListOfHomesThatMatcshesThePetsSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
				assertEquals(result,spec);
			}






		@When("I search about home with price less than {int}")
			public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
			  
			count=0;
			for(String d:pricelist) {
				
			if((Integer.parseInt(d))<(int1)) {count++;
			}	
			}
			//System.out.println(count);
			 p=new ByPrice();
			r=p.searchByPrice(int1,pricelist,count,keys,values,dataTable1);
			//System.out.print(r);
			
			}
		@Then("A list of homes that matches the price specification should be returned and printed on the console")
			public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			   
			String d=Boolean.toString(r);
			assertEquals("true", d);
			
			
			
			}


		@When("I search about home with area less than {int}")
		public void iSearchAboutHomeWithAreaLessThan(Integer int1) {
		  
		count=0;
		for(String d:arealist) {
			
		if((Integer.parseInt(d))<(int1)) {count++;
		}	
		}
		//System.out.println(count);
		 ar=new ByArea();
		r=ar.searchByArea(int1,arealist,count,keys,values,dataTable1);
		//System.out.print(r);
		
		}
	@Then("A list of homes that matches the area specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAreaSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		   
		String d=Boolean.toString(r);
		assertEquals("true", d);
		
		
		
		}

	
		@When("I search about home with price less than {int} and more than {int}")
		public void iSearchAboutHomeWithPriceLessThanAndMoreThan(Integer int1, Integer int2) {
			count=0;
			for(String d:pricelist) {
				
			if((Integer.parseInt(d))<(int1) && (Integer.parseInt(d))>(int2) ) {count++;
			}	
			}
			//System.out.println(count);
			 rp=new ByRangPrice();
			r=rp.searchByRangPrice(int1,int2,pricelist,count,keys,values,dataTable1);
			//System.out.print(r);
		}
		
		
			@Then("A list of homes that matches the rang price specification should be returned and printed on the console")
			public void aListOfHomesThatMatchesTheRangPriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
				String d=Boolean.toString(r);
				assertEquals("true", d);
			}



			@When("I search about home with area less than {int} and more than {int}")
			public void iSearchAboutHomeWithAreaLessThanAndMoreThan(Integer int1 , Integer int2) {
			  
			count=0;
			for(String d:arealist) {
				
			if((Integer.parseInt(d))<(int1)&& (Integer.parseInt(d))>(int2)) {count++;
			}	
			}
			//System.out.println(count);
			 ra=new ByRangArea();
			r=ra.searchByRangArea(int1,int2,arealist,count,keys,values,dataTable1);
			//System.out.print(r);
			
			}
		@Then("A list of homes that matches the rang area specification should be returned and printed on the console")
			public void aListOfHomesThatMatchesTheRangAreaSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			   
			String d=Boolean.toString(r);
			assertEquals("true", d);

		}
		
		
		

			@When("I search about home with {int} numberofbedrooms")
			public void iSearchAboutHomeBy(Integer int1) {
				count=0;
				for(String d:numofbedroomslist) {
					
				if((Integer.parseInt(d))== int1) {count++;
				
				}
				
				}
				    nobed=new ByNumberOfBedrooms();
					r=nobed.searchByNumberOfBedrooms(int1,numofbedroomslist,count,keys,values,dataTable1);
			}


		

			@Then("A list of homes that matches the numberofbedrooms specification should be returned and printed on the console")
			public void aListOfHomesThatMatchesTheNumberofbedroomsSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
				String d=Boolean.toString(r);
				assertEquals("true", d);
			}


			
				@When("I search about home with {int} numberofbathrooms")
				public void iSearchAboutHomeWithNumberofbathrooms(Integer int1) {
					count=0;
					for(String d:numofbathroomslist) {
						
					if((Integer.parseInt(d))== int1) {count++;
					
					}
					
					}
					    nob=new ByNumberOfBathrooms();
						r=nob.searchByNumberOfBathrooms(int1,numofbathroomslist,count,keys,values,dataTable1);
				}


				

				@Then("A list of homes that matches the numberofbathrooms specification should be returned and printed on the console")
				public void aListOfHomesThatMatchesTheNumberofbathroomsSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
					String d=Boolean.toString(r);
					assertEquals("true", d);
				}



					@When("I search about Lease length home with {int} mounth")
					public void iSearchAboutLeaseLengthHomeWithMounth(Integer int1) {
					    // Write code here that turns the phrase above into concrete actions
					    //throw new io.cucumber.java.PendingException();
						count=0;
						for(String d:leaseLengthlist) {
							
						if((Integer.parseInt(d))== int1) {count++;
						
						}
						
						}
						    ll=new ByLeaseLength();
							r=ll.searchByleaseLength(int1,leaseLengthlist,count,keys,values,dataTable1);
						
					}



					@Then("A list of homes that matches Lease length the  specification should be returned and printed on the console")
					public void aListOfHomesThatMatchesLeaseLengthTheSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
					    // Write code here that turns the phrase above into concrete actions
					   // throw new io.cucumber.java.PendingException();
						String d=Boolean.toString(r);
						assertEquals("true", d);
					}


					
						@When("I search about home by {string} and {string}")
						public void iSearchAboutHomeByAnd(String string, String string2) {
							 count=0;
							 String[] arraycom;
							this.spec=string;
							this.spec1=string2;
							// listOLists.add(typelist);
							// listOLists.add(placementlist);
							// listOLists.add(pricelist);
				
//								
//							for(String s:combination) {
//								
//								if((string.equals(s)) && (string2.equals(s)) )
//								{
//									count++;
//								}
//								}
							System.out.println("A List of Home that Combination Between "+string +" and "+string2 +" :");
							for (String key : keys) {
								arraycom=key.split("_");
								if((string.equals(arraycom[0])) && (string2.equals(arraycom[2]))){count++;System.out.print(key);
								System.out.println(" "+dataTable1.get(key));}
							}
							System.out.println();
										com=new Combination_scenarios();
										//ByTybe t=new ByTybe();
										//ByPlacement p=new ByPlacement();
										
										//boolean f=true;
										//result=t.searchByType(string, typelist, count, keys, values, dataTable1);
                                       // result1=p.searchByPlacement(string2, placementlist, count, keys, values, dataTable1);
										
										cm=com.bycombinationSearch(string,string2,keys,count);  
										// result1=com.bycombinationSearch2(string,string2,listOLists,count);
						}
						

						
						@Then("A list of homes that matches the type and specification should be returned and printed on the console")
						public void aListOfHomesThatMatchesTheTypeAndSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
							assertEquals(true,cm);
							
						}



	
}
