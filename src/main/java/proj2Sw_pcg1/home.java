package proj2Sw_pcg1;



public class home {
	private ByTybe type ;
	private ByPlacement placement ;
	private ByAmenities amenities ;
	private ByMaterial material ;
	private ByPets pets ;


	private int area ;
	private int price ;
	private int num_of_bedrooms;
	private int num_of_bathroom;
	private int lease_length ;
	
	public home(ByTybe type ,ByMaterial material , ByPlacement placement , ByPets pets , ByAmenities amenities , int price ,
			int area , int num_of_bedrooms , int num_of_bathroom ,int lease_length) {
		this.type = type ;
		this.material  = material  ;
		this.placement =placement;
		this.pets = pets;
		this.amenities=amenities;
		this.price =price;
		this.area=area;
		this.num_of_bedrooms=num_of_bedrooms;
		this.num_of_bathroom=num_of_bathroom;
		this.lease_length=lease_length;
	}
	

	public home( ) {
		this.type = type ;
		this.material  = material  ;
		this.placement =placement;
		this.amenities=amenities;
		this.price =price;
		this.area=area;
		
	}


//	public String toString() {
//		return "nira [type =" + type + ", material =" + material + ",placement =" + placement + ",pets =" + pets + ","
//				+ "amenities =" + amenities + ", price =" + price + ", area =" + area + ", num_of_bedrooms =" + num_of_bedrooms + ","
//				+ "num_of_bathroom =" + num_of_bathroom + ", lease_length =" + lease_length + "]" ;
//		
//	}
	
	public String toString() {
		return "nira [type =" + type + ", material =" + material + ",placement =" + placement +  ","
				+ "amenities =" + amenities + ", price =" + price + ", area =" + area 
				+ "]" ;
		
	}
	public ByTybe getType() {
		return type ;
	}

	public ByPlacement getPlacement() {
		return placement;
	}


	public ByAmenities getAmenities() {
		return amenities;
	}


	public ByMaterial getMaterial() {
		return material;
	}



	public ByPets getPets() {
		return pets;
	}



	public int getArea() {
		return area;
	}



	public int getPrice() {
		return price;
	}


	public int getNum_of_bedrooms() {
		return num_of_bedrooms;
	}

	public int getNum_of_bathroom() {
		return num_of_bathroom;
	}



	public int getLease_length() {
		return lease_length;
	}

	
	
	
	
	
}
