package stringSplit;

class Customer{
	private String customerName;
	private int applicableDiscount;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getApplicableDiscount() {
		return applicableDiscount;
	}
	public void setApplicableDiscount(int applicableDiscount) {
		this.applicableDiscount = applicableDiscount;
	}
	
	public void findDiscountAndName(String inputString) {
		
		//write the solution as mentioned 
		String discount = "";
		
		String[] splitString = inputString.split(":");
		
		
		//System.out.println(splitString[0]);
		//System.out.println(splitString[1]);
		if(splitString[0].equals("Regular"))
		{
			discount = "10%";
			
		}
		else if(splitString[0].equals("Priviledged"))
		{
			discount = "20%";
		}
		System.out.println("Hi "+ splitString[1] + " " + discount + 
				" discount is applicable for you");
		
	}
}

class Tester{
	public static void main(String[] args) {
		Customer customer1 = new Customer();  //regular
		Customer customer2 = new Customer(); //privileged
		
		//write the code to implement the solution
		customer1.findDiscountAndName("Regular:Jack");
		customer2.findDiscountAndName("Priviledged:Mary");
	
	}
}
