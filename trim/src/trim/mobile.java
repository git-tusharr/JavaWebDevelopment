package trim;

public class mobile {
	
	String name;
	int price;
	
	
	variants variants;
	
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	 public variants getVariants() {
	        return variants;
	    }
	    public void setVariants(variants variants) {
	        this.variants = variants;
	    }
	
	
	void display() {
		System.out.println(name+" "+price+variants);
	}
		
		
		

}
