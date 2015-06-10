public enum CoffeeSize { 
	BIG(8), 
	HUGE(10), 
	OVERWHELMING(16) { // start a code block that defines 
					   // the body for this constant
		public String getLidCode() { // override the method
									 // defined in CoffeeSize			
			return "A";
		}	
	}; // semicolon is REQUIRED when more code follows
	
	CoffeeSize(int ounces) {
		this.ounces = ounces;
	}
	
	private int ounces;
	
	public int getOunces() {
		return ounces;
	}
	public String getLidCode() { // this method is overridden
								 // by the OVERWHELMING constant
		return "B";
	}
} 