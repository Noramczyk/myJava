package sumOfEvens;

class Tester {
    
    public static int calculateSumOfEvenNumbers(int[] numbers){
        //Implement your code here and change the return value accordingly
    	int evenSum = 0;
    	
    	for(int element:numbers)
    	{
    		if(element %2 ==0)
    		{
    			evenSum += element;
    		}
    		
    	}
        return evenSum;
    }
    
	public static void main(String[] args) {
		int[] numbers = {68,79,86,99,23,2,41,100};
		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
	}
}
