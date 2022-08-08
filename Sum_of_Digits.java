package sumOfDigits;


public class digitSum {
	
	static int sum(int x) {
		int iSum = 0;
		int var = 0;
		
		while(x != 0)
		{
			var = x % 10;
			iSum += var;		// SUM of each number
			System.out.println("iSum = " + iSum);
			x = x /10;
			System.out.println("x = " + x);
			System.out.println("");
		}
		
		return iSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2250;
		int val, divCheck;
		
		val = sum(x);
		divCheck = x % val;
		System.out.println(val);
		System.out.println(divCheck);
		
		if(divCheck != 0)
		{
			System.out.println("Invalid value... ");
		}
		else
		{
			System.out.println("Value is valid!!!....");
		}
		

	}

}
