package integerPalindromNeg;

class Tester{
    public static boolean checkPalindrome(int x){
	    //Implement your code here and change the return value accordingly
    	
    	String reverse = "";
    	String str = Integer.toString(x);
    	System.out.println(x);
    	
    	for(int i = str.length() - 1; i >= 0; i--)
    	{
    	
    		reverse = reverse + str.charAt(i);
    		
    	}
    	//System.out.println(reverse);
    	
    	String strY = new String(reverse);
    	String strX = new String(str);
    	
    	if (strX.equals(strY))
    		return true;
    	
    	else
        return false;
	}
	
	public static void main(String args[]){
		int x = -121;
		if(checkPalindrome(x))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}
