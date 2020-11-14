Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR,BALCONY|230_120_4_1_12|
                |HOUSE_BRICK_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|200_170_2_1_6|
               |HOUSE_STONE_CITY_YES_FIREPLACE,ELEVATOR|100_130_2_3_6|
                
  Scenario: Search home by type
  When I search about home by "APARTMENT"
  Then A list of homes that matches the  type specification should be returned and printed on the console
  
  Scenario: Search home by pets
  When I search about home by "NO"
  Then A list of homes that matcshes the pets specification should be returned and printed on the console
  
  Scenario: Search home by material
  When I search about home by "STONE"
  Then A list of homes that matches the  material specification should be returned and printed on the console

  Scenario: Search about home with less than a specific price
  When I search about home with price less than 400 
  Then A list of homes that matches the price specification should be returned and printed on the console
 
  Scenario: Search about home between range of prices
  When I search about home with price less than 600 and more than 210 
  Then A list of homes that matches the rang price specification should be returned and printed on the console
  
  Scenario: Search about home with less than a specific area
  When I search about home with area less than 180
  Then A list of homes that matches the area specification should be returned and printed on the console
  
  Scenario: Search about home between range of areas
  When I search about home with area less than 150 and more than 100 
  Then A list of homes that matches the rang area specification should be returned and printed on the console
 
  Scenario: Search home by placement
  When I search about home by "CITY"
  Then A list of homes that matches the  placement specification should be returned and printed on the console
  
  
  Scenario: Search home by amenties
  When I search about home by "BALCONY"
  Then A list of homes that matches the  amenties specification should be returned and printed on the console
  
   Scenario: Search home by numberofbedrooms
   When I search about home with 3 numberofbedrooms
   Then A list of homes that matches the numberofbedrooms specification should be returned and printed on the console
   
   Scenario: Search home by numberofbathrooms
   When I search about home with 2 numberofbathrooms
   Then A list of homes that matches the numberofbathrooms specification should be returned and printed on the console
   
   Scenario: Search home by Lease length
   When I search about Lease length home with 6 mounth
   Then A list of homes that matches Lease length the  specification should be returned and printed on the console
  
  #Scenario: Search home by type and placement and less than specific price
  #When I search about home by "HOUSE" and "WOOD" and price less than 400 	
 # Then A list of homes that matches the type and  and price specification should be returned and printed on the console 
  
  Scenario: Search home by type and placement 
  When I search about home by "APARTMENT" and "CITY" 	
  Then A list of homes that matches the type and specification should be returned and printed on the console 
  